package com.sparta.neonaduri_back.service;

import com.sparta.neonaduri_back.dto.PostDto;
import com.sparta.neonaduri_back.model.Post;
import com.sparta.neonaduri_back.model.User;
import com.sparta.neonaduri_back.repository.PostRepository;
import com.sparta.neonaduri_back.repository.UserRepository;
import com.sparta.neonaduri_back.security.UserDetailsImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PostService {
    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public static String deletePlan(Long postId, UserDetailsImpl userDetails, Errors errors) {


    }

    public static String savePlan(UserDetailsImpl userDetails, Errors errors) {


    }

    public PostDto detailPlan(Long postId, UserDetailsImpl userDetails) {
        return null;
    }

    public List<PostDto> getMyPosts(Long id) {
        return null;
    }

    public void makePlan(UserDetailsImpl userDetails, PostDto postDto) {
        Optional<User> user = userRepository.findById(userDetails.getUser().getId());
        Post post = postRepository.save(postDto.getPostId(user));
    }
}
