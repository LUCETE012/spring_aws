package com.jojoldu.book.springboot.web;

import com.jojoldu.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDtd(@RequestParam("name") String name, @RequestParam("amount") int amount) { // namer과 amount는 API를 호출하는 곳에서 넘겨준 값들
        return new HelloResponseDto(name, amount);
    }
}
