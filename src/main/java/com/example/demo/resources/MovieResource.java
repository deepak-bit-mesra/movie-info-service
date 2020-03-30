package com.example.demo.resources;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Movie;


@RestController
@RequestMapping("/movies")
public class MovieResource {
	
	Logger LOGGER = LoggerFactory.getLogger(MovieResource.class);
	
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
		LOGGER.info("........ Inside Movie info service");
		
		return new Movie(movieId,"Movie "+ movieId + "is the  Name");
	}
}
