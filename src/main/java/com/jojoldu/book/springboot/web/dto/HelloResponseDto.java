package com.jojoldu.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//final 붙은 애들만 생성자를 생성해줌
@RequiredArgsConstructor
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
