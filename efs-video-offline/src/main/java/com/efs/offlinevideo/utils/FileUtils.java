package com.efs.offlinevideo.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.efs.offlinevideo.entities.OnlineVideo;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class FileUtils {
	
	private final Logger logger = LoggerFactory.getLogger(FileUtils.class);

    private String fileName;
    private CSVReader CSVReader;
    private CSVWriter CSVWriter;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private File file;

    public FileUtils(String fileName) {
        this.fileName = fileName;
    }

    public OnlineVideo readVideo() {
        try {
            if (CSVReader == null) 
            	initReader();
            
            String[] video = CSVReader.readNext();
            
            if (video == null) 
            	return null;
            
            return new OnlineVideo(video[6], video[1], video[2], video[3], video[4], video[5], video[0]);
            
        } catch (Exception e) {
        	
            logger.error("Erro ao ler arquivo: " + this.fileName);
            return null;
        }
    }

    public void writeVideo(OnlineVideo video) {
        try {
            if (CSVWriter == null) 
            	initWriter();
            
            String[] lineStr = new String[3];
            lineStr[0] = buildIdentifierByName(video.getTitle());
            lineStr[1] = video.getTitle();
            lineStr[2] = video.getUrlSite();
            lineStr[3] = video.getDescription();
            lineStr[4] = video.getCategory().name();
            lineStr[5] = video.getDuration();
            lineStr[6] = video.getId();
            
            CSVWriter.writeNext(lineStr);
            
        } catch (Exception e) {
        	
            logger.error("Erro ao escrever arquivo: " + this.fileName);
        }
    }

    private void initReader() throws Exception {
        ClassLoader classLoader = this.getClass().getClassLoader();
        
        if (file == null) 
        	file = new File(classLoader.getResource(fileName).getFile());
        
        if (fileReader == null) 
        	fileReader = new FileReader(file);
        
        if (CSVReader == null) 
        	CSVReader = new CSVReader(fileReader);
    }

    private void initWriter() throws Exception {
        if (file == null) {
            file = new File(fileName);
            file.createNewFile();
        }
        
        if (fileWriter == null) 
        	fileWriter = new FileWriter(file, true);
        
        if (CSVWriter == null) 
        	CSVWriter = new CSVWriter(fileWriter);
    }

    public void closeWriter() {
        try {
            CSVWriter.close();
            fileWriter.close();
            
        } catch (IOException e) {
        	
            logger.error("Erro ao fechar escritor.");
        }
    }

    public void closeReader() {
        try {
            CSVReader.close();
            fileReader.close();
            
        } catch (IOException e) {
        	
            logger.error("Erro ao fechar leitor.");
        }
    }
    
    private String buildIdentifierByName(String filename) throws NoSuchAlgorithmException, UnsupportedEncodingException {
    	
    	byte[] hash = MessageDigest
    			.getInstance("MD5")
    			.digest(filename.getBytes("UTF-8"));
    	
		return new BigInteger(1, hash).toString(16);
    }

}
