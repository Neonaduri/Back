package com.sparta.neonaduri_back.like.service;

import com.sparta.neonaduri_back.like.dto.LikeResponseDto;
import com.sparta.neonaduri_back.like.model.Likes;
import com.sparta.neonaduri_back.like.repository.LikeRepository;
import com.sparta.neonaduri_back.post.model.Post;
import com.sparta.neonaduri_back.login.model.User;
import com.sparta.neonaduri_back.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class LikeService {

    private final LikeRepository likeRepository;
    private final PostRepository postRepository;

    @Transactional
    public LikeResponseDto toggle(Long postId, User user) {
        Long userId=user.getId();
        Optional<Likes> likesOptional=likeRepository.findByPostIdAndUserId(postId, userId);

        LikeResponseDto likeResponseDto = new LikeResponseDto();
        //이미 해당 게시물 찜한 경우
        if(likesOptional.isPresent()){
            //찜한 내역 삭제
            likeRepository.deleteByPostIdAndUserId(postId, userId);
            //찜 false 상태 반환
            likeResponseDto.setLike(false);
        }else{
        //아직 찜 안 한 경우
            //
            Likes likes=new Likes(userId, postId);
            likeRepository.save(likes);
            likeResponseDto.setLike(true);
        }

        //찜 누르고 취소하는 동시에 게시물 likeCnt 개수도 변화
        //게시물의 찜개수 세기 (likeCnt)
        int likeCnt=likeRepository.countByPostId(postId).intValue();
        Post post=postRepository.findById(postId).orElseThrow(
                ()->new IllegalArgumentException("해당 게시물이 없습니다")
        );
        post.updateLikeCnt(likeCnt);
        postRepository.save(post);
        return likeResponseDto;
    }
}
