package com.example.devstacknoticeservice.app.dto;

import com.example.devstacknoticeservice.model.notice.Notice;
import lombok.Getter;

@Getter
public class NoticeResponseDto {
    private final Long noticeNo;
    private final String noticeTitle;
    private final String noticeContent;
    private final String noticeUrl;
    private final String noticeEndDate;

    private NoticeResponseDto(Long noticeNo, String noticeTitle, String noticeContent, String noticeUrl, String noticeEndDate) {
        this.noticeNo = noticeNo;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeUrl = noticeUrl;
        this.noticeEndDate = noticeEndDate;
    }

    public static NoticeResponseDto from(Notice entity) {
        return new NoticeResponseDto(entity.getNoticeNo(),
                entity.getNoticeTitle(),
                entity.getNoticeContent(),
                entity.getNoticeUrl(),
                entity.getNoticeEndDate());
    }
}