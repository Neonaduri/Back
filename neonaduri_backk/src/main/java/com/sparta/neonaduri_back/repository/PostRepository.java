package com.sparta.neonaduri_back.repository;

import com.sparta.neonaduri_back.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long > {
    Optional<Post> findAllByUserId();
}
