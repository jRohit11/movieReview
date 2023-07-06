package com.demo.movieReview.service;

import com.demo.movieReview.domain.Movie;
import com.demo.movieReview.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private MovieRepository movieRepository;

    //constructor injection
    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }
}
