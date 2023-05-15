package com.spring.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/board")
public class boardController {
    @GetMapping("/hello")
    public String main() {
        System.out.println("BoardController");
        return "hello world";
    }
}
