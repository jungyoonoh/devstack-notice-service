package com.example.devstacknoticeservice.service;

import com.example.devstacknoticeservice.app.dto.NoticeResponseDto;
import com.example.devstacknoticeservice.app.dto.UserResponseDto;
import com.example.devstacknoticeservice.model.notice.Notice;
import com.example.devstacknoticeservice.model.user.User;
import com.example.devstacknoticeservice.model.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserResponseDto findById(Long id) {
        User entity = userRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        return UserResponseDto.from(entity);
    }
}
