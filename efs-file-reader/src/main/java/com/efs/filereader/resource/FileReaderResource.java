package com.efs.filereader.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efs.filereader.services.FileReaderService;

@RefreshScope
@RestController
@RequestMapping(value = "/filereader")
public class FileReaderResource {
	
	@Autowired
	private FileReaderService fileReaderService;
	
	@GetMapping
	public ResponseEntity<Void> findAll() {
		fileReaderService.readFileWithSpark();
		return ResponseEntity.ok().build();
	}	
	
	@GetMapping(value = "/join")
	public ResponseEntity<Void> join() {
		fileReaderService.joinFilesWithSpark();
		return ResponseEntity.ok().build();
	}	

}
