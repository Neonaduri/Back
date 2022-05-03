package com.sparta.neonaduri_back.model;
/**
 * [model] - User
 *
 * @class   : User
 * @author  : 오예령
 * @since   : 2022.04.30
 * @version : 1.0
 *
 *   수정일     수정자             수정내용
 *  --------   --------    ---------------------------
 *  2022.05.03 오예령       회원 정보에 profileImgUrl, totalLike 추가
 */

import com.sparta.neonaduri_back.dto.user.SignupRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String nickName;

    @Column(nullable = true)
    private String email;

    @Column(nullable = true)
    private Long kakaoId;

    @Column(nullable = true)
    private String profileImgUrl;

    @Column(nullable = true)
    private int totalLike;

    @Builder

    // 카카오 회원가입
    public User(String userName, String password, String nickName, String email) {
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
        this.email = email;
    }

    // 회원가입
    public User(String userName, String password, SignupRequestDto signupRequestDto) {
        this.userName = userName;
        this.password = password;
        this.nickName = signupRequestDto.getNickName();
        this.profileImgUrl = "http://k.kakaocdn.net/dn/dpk9l1/btqmGhA2lKL/Oz0wDuJn1YV2DIn92f6DVK/img_110x110.jpg";
    }

    public User(String userName, String nickName, String passWordEncode, Long kakaoId) {
        this.userName = userName;
        this.nickName = nickName;
        this.password = passWordEncode;
        this.kakaoId = kakaoId;
    }
}