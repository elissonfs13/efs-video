package com.efs.videobatch.writers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.item.ItemWriter;

import com.efs.videobatch.entities.Video;
import com.efs.videobatch.utils.FileUtils;

public class CsvItemWriter implements ItemWriter<Video>, StepExecutionListener {
	
	private final Logger logger = LoggerFactory.getLogger(CsvItemWriter.class);
		 
	private final String outputPath;
	
	private FileUtils fu;
	
	public CsvItemWriter(String outputPath) {
		this.outputPath = outputPath;
    }
	

	@Override
	public void write(List<? extends Video> videos) throws Exception {
		for (Video video : videos) {
			fu.writeVideo(video);
            logger.info("efs-video-batch: ESCREVENDO VIDEO: " + video.toString());
		}		
	}

	@Override
	public void beforeStep(StepExecution stepExecution) {
		fu = new FileUtils(outputPath);
        logger.info("efs-video-batch: ESCRITOR INICIALIZADO.");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		fu.closeWriter();
        logger.info("efs-video-batch: ESCRITOR FINALIZADO.");
        return ExitStatus.COMPLETED;
	}

}
