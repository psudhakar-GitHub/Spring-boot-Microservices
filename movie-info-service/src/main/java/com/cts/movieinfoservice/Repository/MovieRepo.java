package com.cts.movieinfoservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.movieinfoservice.model.Movie;

public interface MovieRepo extends JpaRepository<Movie, Integer> {

}
