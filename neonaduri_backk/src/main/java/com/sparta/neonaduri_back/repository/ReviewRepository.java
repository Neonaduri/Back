package com.sparta.neonaduri_back.repository;

import com.sparta.neonaduri_back.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    // postId로 해당 게시물의 후기 list 가져오기
    List<Review> findAllByPostId(Long postId);
}
