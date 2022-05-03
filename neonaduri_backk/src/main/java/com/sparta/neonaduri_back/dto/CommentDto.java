package com.sparta.neonaduri_back.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CommentDto {
    private Long commentId;
    private String commentContent;
    private String commentImgUrl;
}
