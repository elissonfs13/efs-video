package com.efs.webflux.entities;

import java.nio.file.Path;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Video {
	
    private String name;
    
    private String uri;
    
    @JsonIgnore
    private Path location;
}
