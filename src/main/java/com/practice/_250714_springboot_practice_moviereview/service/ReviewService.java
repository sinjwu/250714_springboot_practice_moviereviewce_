package com.practice._250714_springboot_practice_moviereview.service;

import com.practice._250714_springboot_practice_moviereview.model.Movie;
import com.practice._250714_springboot_practice_moviereview.model.Review;
import com.practice._250714_springboot_practice_moviereview.repository.MovieRepository;
import com.practice._250714_springboot_practice_moviereview.repository.ReviewRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
@Transactional
public class ReviewService {
    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;
    public Review Create(Long movieId, Review review) {
        Movie movie = movieRepository.findById(movieId)
                .orElseThrow(() -> new NoSuchElementException("영화가 없습니다: " + movieId));
        review.setMovie(movie);
        return reviewRepository.save(review);
    }
}
