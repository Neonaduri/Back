package com.sparta.neonaduri_back.openvidu.dto;

import com.sparta.neonaduri_back.openvidu.AudioChatRole;
import lombok.Data;

@Data
public class AudioChatEntryDto {
    private Long postId;
    private String nickName;
    private AudioChatRole role;
    private Long participantCount;
}
