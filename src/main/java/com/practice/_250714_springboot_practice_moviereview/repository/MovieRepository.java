package com.practice._250714_springboot_practice_moviereview.repository;

import com.practice._250714_springboot_practice_moviereview.model.Movie;
import com.practice._250714_springboot_practice_moviereview.model.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    Page<Movie> findById(Long id, Pageable pageable);
}
