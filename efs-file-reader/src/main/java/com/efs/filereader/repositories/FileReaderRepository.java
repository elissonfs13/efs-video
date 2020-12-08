package com.efs.filereader.repositories;

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
public class FileReaderRepository {
	
	@Autowired
	private FileReaderService fileReaderService;
	
	@GetMapping
	public ResponseEntity<Void> findAll() {
		fileReaderService.executeSpark();
		return ResponseEntity.ok().build();
	}	

}
