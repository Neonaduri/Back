package com.sparta.neonaduri_back.utils;

import com.sparta.neonaduri_back.post.dto.BestAndLocationDto;
import com.sparta.neonaduri_back.post.dto.MyLikePostDto;
import com.sparta.neonaduri_back.post.dto.PostListDto;
import com.sparta.neonaduri_back.post.dto.ThemeAndSearchDto;
import com.sparta.neonaduri_back.review.dto.ReviewListDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@Component
public class Paging {
    // 페이징 처리
    public Page<MyLikePostDto> overPages(List<MyLikePostDto> postList, int start, int end, Pageable pageable, int pageno) {
        Page<MyLikePostDto> pages = new PageImpl<>(postList.subList(start, end), pageable, (long)postList.size());
        if (pageno > pages.getTotalPages()) {
            throw new IllegalArgumentException("요청할 수 없는 페이지 입니다.");
        } else {
            return pages;
        }
    }

    // 인기 게시물 조회, 지역별 조회  페이징
    public Page<BestAndLocationDto> overPagesCheck(List<BestAndLocationDto> postList, int start, int end, Pageable pageable, int pageno) {
        Page<BestAndLocationDto> pages = new PageImpl<>(postList.subList(start, end), pageable, (long)postList.size());
        if (pageno > pages.getTotalPages()) {
            throw new IllegalArgumentException("요청할 수 없는 페이지 입니다.");
        } else {
            return pages;
        }
    }

    public Page<ThemeAndSearchDto> overPageCheck2(List<ThemeAndSearchDto> postList, int start, int end, Pageable pageable, int pageno) {
        Page<ThemeAndSearchDto> pages = new PageImpl<>(postList.subList(start, end), pageable, postList.size());
        if (pageno > pages.getTotalPages()) {
            throw new IllegalArgumentException("요청할 수 없는 페이지 입니다.");
        } else {
            return pages;
        }
    }

    public Page<PostListDto> overPages2(List<PostListDto> postList, int start, int end, Pageable pageable, int pageno) {
        Page<PostListDto> pages = new PageImpl(postList.subList(start, end), pageable, postList.size());
        if (pageno > pages.getTotalPages()) {
            throw new IllegalArgumentException("요청할 수 없는 페이지 입니다.");
        } else {
            return pages;
        }
    }

    public Page<ReviewListDto> overPages3(List<ReviewListDto> reviewList, int start, int end, Pageable pageable, int pageno) {
        Page<ReviewListDto> pages = new PageImpl<>(reviewList.subList(start, end), pageable, (long)reviewList.size());
        if (pageno > pages.getTotalPages()) {
            throw new IllegalArgumentException("요청할 수 없는 페이지입니다.");
        } else {
            return pages;
        }
    }
}
