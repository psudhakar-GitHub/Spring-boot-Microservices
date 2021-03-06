package com.cts.movieinfoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.movieinfoservice.Repository.MovieRepo;
import com.cts.movieinfoservice.model.Movie;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	MovieRepo movieRepo;
	
	@Override
	public Movie getMovie(int id) {
		// TODO Auto-generated method stub
		return movieRepo.findById(id).get();
	}

}
