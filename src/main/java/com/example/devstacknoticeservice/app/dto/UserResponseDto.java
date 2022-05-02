package com.example.devstacknoticeservice.app.dto;

import com.example.devstacknoticeservice.model.user.User;
import lombok.Getter;

@Getter
public class UserResponseDto {
    private final Long userNo;
    private final String nickName;

    private UserResponseDto(Long userNo, String nickName) {
        this.userNo = userNo;
        this.nickName = nickName;
    }

    public static UserResponseDto from(User user) {
        return new UserResponseDto(user.getUserNo(), user.getNickName());
    }
}
