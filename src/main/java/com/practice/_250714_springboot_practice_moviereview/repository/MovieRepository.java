package com.practice._250714_springboot_practice_moviereview.repository;

import com.practice._250714_springboot_practice_moviereview.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
