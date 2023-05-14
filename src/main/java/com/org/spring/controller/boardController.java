package com.org.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class boardController {
    @GetMapping("/board")
    public String board() {
        return "/board hello";
    }
}
