package com.sparta.neonaduri_back.dto;

import com.sparta.neonaduri_back.model.Days;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PostDto {
    private Long postId;
    private Long themeId;
    private String startDate;
    private String endDate;
    private String dateCnt;
    private String title;
    private String location;
    private List<Days> days;
    private String postImgUrl;
    private boolean isLike;
    private boolean isPublic;
}
