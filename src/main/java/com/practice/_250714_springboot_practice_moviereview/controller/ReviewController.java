package com.practice._250714_springboot_practice_moviereview.controller;

import com.practice._250714_springboot_practice_moviereview.model.Review;
import com.practice._250714_springboot_practice_moviereview.service.ReviewService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;
    @PostMapping("/api/movies/{movieId/reviews}")
    public Review add(
            @PathVariable Long movieId,
            @Valid
    ) {}

}
