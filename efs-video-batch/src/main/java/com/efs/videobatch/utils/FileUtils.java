package com.efs.videobatch.utils;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.efs.videobatch.entities.Video;
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

    public Video readVideo() {
        try {
            if (CSVReader == null) 
            	initReader();
            
            String[] video = CSVReader.readNext();
            
            if (video == null) 
            	return null;
            
            return new Video(video[0], video[1]);
            
        } catch (Exception e) {
        	
            logger.error("Erro ao ler arquivo: " + this.fileName);
            return null;
        }
    }

    public void writeVideo(Video video) {
        try {
            if (CSVWriter == null) 
            	initWriter();
            
            String[] lineStr = new String[3];
            lineStr[0] = video.getId();
            lineStr[1] = video.getFilename();
            lineStr[2] = video.getAbsolutePath();
            
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

}
