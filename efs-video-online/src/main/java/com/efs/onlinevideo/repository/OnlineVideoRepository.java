package com.efs.onlinevideo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.efs.onlinevideo.entities.OnlineVideo;

public interface OnlineVideoRepository extends MongoRepository<OnlineVideo, String>{
	
	List<OnlineVideo> findByCategoria(String categoria);

}
