package com.example.devstacknoticeservice.model.notice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {
    @Query("SELECT n FROM Notice n ORDER BY n.noticeNo DESC")
    List<Notice> findAllDesc(); // 등록된 공고 역순으로 보기
}
