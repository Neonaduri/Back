package com.sparta.neonaduri_back.post.dto;


import com.sparta.neonaduri_back.login.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BestAndLocationDto {

    private Long postId;
    private String postImgUrl;
    private String postTitle;
    private String location;
    private String theme;
    private boolean islike;
    private int likeCnt;
    private int reviewCnt;
    private User user;
}
