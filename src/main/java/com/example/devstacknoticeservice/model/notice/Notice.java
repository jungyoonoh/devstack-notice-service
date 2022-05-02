package com.example.devstacknoticeservice.model.notice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Notice {
    @Id
    @Column(name = "noticeNo", nullable = false)
    private Long noticeNo;

    @Column(length = 500, nullable = false)
    private String noticeTitle;

    @Column
    private String noticeContent;

    @Column
    private String noticeUrl;

    @Column
    private String noticeEndDate;
}