package com.cts.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.movieinfoservice.model.Movie;
import com.cts.movieinfoservice.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieInfoController {

	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies/{movieId}")
	public Movie getMovie(@PathVariable("movieId") int movieId) {
		return movieService.getMovie(movieId);
	}
}
