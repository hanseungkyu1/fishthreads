package com.fishthreads.api.v1.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class TestController {

    @GetMapping("/hello")
    public List<String> getHello() {
        return Arrays.asList("민물/바다낚시에 관한 모든 것", "어떤 컨텐츠를?.?");
    }
}
