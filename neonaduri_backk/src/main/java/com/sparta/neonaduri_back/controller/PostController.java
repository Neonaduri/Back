package com.sparta.neonaduri_back.controller;

import antlr.collections.List;
import com.sparta.neonaduri_back.dto.PostDto;
import com.sparta.neonaduri_back.security.UserDetailsImpl;
import com.sparta.neonaduri_back.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class PostController {
    private final PostService postService;

    //플랜 계획하러가기
    @PostMapping("/makeplan")
    public PostDto makePlan(@AuthenticationPrincipal UserDetailsImpl userDetails,
                            @RequestBody PostDto postDto) {
        postService.makePlan(userDetails, postDto);
        return postDto;
    }

    //플랜 계획 조회하기
    @GetMapping("/makeplan/{postId}")
    public PostDto getPost(@PathVariable Long postId, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return postdto;
    }

    //내가 작성한 플랜조회 V
    @GetMapping("/user/getplan")
    public List<PostDto> getMyPost(@AuthenticationPrincipal UserDetailsImpl userDetails){
        return postService.getMyPosts(userDetails.getUser().getId());
    }

    // 내가 플랜 삭제
    @DeleteMapping("/user/delplan/{postId}")
    public ResponseEntity<String> deletePost(@PathVariable Long postId, UserDetailsImpl userDetails, Errors errors) {
        String message = PostService.deletePlan(postId, userDetails, errors);
        if (message.equals("포스트 삭제 성공")) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // 나만보기 플랜 저장
    @PutMapping("/saveplan/me")
    public ResponseEntity<String> savePlan( PostDto postDto, Errors errors) {
        String message = PostService.savePlan(userDetails, errors);
        if (message.equals("포스트 저장 성공")) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // 자랑하기 플랜 저장
    @PutMapping("/saveplan/all")
    public ResponseEntity<String> savePlan( PostDto postDto, Errors errors) {
        String message = PostService.savePlan(userDetails, errors);
        if (message.equals("포스트 저장 성공")) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    // 플랜 상세 조회 V
    @GetMapping("/detail/{postId}")
    public PostDto detailPlan(@PathVariable Long postId, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return postService.detailPlan(postId,userDetails);
    }
}
