package com.efs.videobatch.config;

import java.io.File;
import java.io.IOException;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.efs.videobatch.entities.Video;
import com.efs.videobatch.processors.VideoItemProcessor;
import com.efs.videobatch.readers.DirectoryItemReader;
import com.efs.videobatch.writers.CsvItemWriter;
import com.efs.videobatch.writers.NoOpItemWriter;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
	
	@Value("${video.location}")
    private String videoLocation;
	
	@Value("${csv.outputpath}")
    private String outputPath;
	
	@Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public Job job() {
        return jobBuilderFactory.get("job")
                .start(step())
                .build();
    }

    @Bean
    public Step step() {
        try {
            return stepBuilderFactory.get("step").<File, Video>chunk(500)
                    .reader(directoryItemReader())
                    .processor(processor())
                    .writer(csvItemWriter())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    
    @Bean
    public DirectoryItemReader directoryItemReader() throws IOException {
        return new DirectoryItemReader(videoLocation);
    }
    
    @Bean
    public VideoItemProcessor processor() {
        return new VideoItemProcessor();
    }
    
    @Bean
    public CsvItemWriter csvItemWriter() throws IOException {
        return new CsvItemWriter(outputPath);
    }
    
    @Bean
    public NoOpItemWriter noOpItemWriter() throws IOException {
        return new NoOpItemWriter();
    }

}
