package com.example.devstacknoticeservice.app;

import com.example.devstacknoticeservice.app.dto.NoticeResponseDto;
import com.example.devstacknoticeservice.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class NoticeApiController {

    private final NoticeService noticeService;

    // notice{id}
    @GetMapping("/api/v1/notice/{id}")
    public NoticeResponseDto findById(@PathVariable Long id){
        return noticeService.findById(id);
    }

    // noticeAll
    @GetMapping("/api/v1/notice")
    public List<NoticeResponseDto> findAllDesc(){
        return noticeService.findAllDesc();
    }
}
