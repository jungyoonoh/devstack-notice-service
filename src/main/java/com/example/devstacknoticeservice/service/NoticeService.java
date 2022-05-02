package com.example.devstacknoticeservice.service;

import com.example.devstacknoticeservice.app.dto.NoticeResponseDto;
import com.example.devstacknoticeservice.model.notice.Notice;
import com.example.devstacknoticeservice.model.notice.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class NoticeService {

    private final NoticeRepository noticeRepository;

    @Transactional
    public NoticeResponseDto findById(Long id) {
        Notice entity = noticeRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);
        return NoticeResponseDto.from(entity);
    }

    @Transactional
    public List<NoticeResponseDto> findAllDesc() {
        return noticeRepository.findAllDesc().stream()
                .map(NoticeResponseDto::from)
                .collect(Collectors.toList());
    }
}
