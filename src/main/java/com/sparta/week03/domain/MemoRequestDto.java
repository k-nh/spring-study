package com.sparta.week03.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@RequiredArgsConstructor
public class MemoRequestDto {
    private final String username;
    private final String contents;
}
