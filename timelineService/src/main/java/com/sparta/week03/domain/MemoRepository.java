package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    //findAll ByOrderBy ModifiedAtDesc
    //수정된 날짜를 Desc(내림차순,최신순으로) 기준으로 정렬
    List<Memo> findAllByOrderByModifiedAtDesc();

}