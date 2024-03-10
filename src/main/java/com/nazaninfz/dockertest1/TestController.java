package com.nazaninfz.dockertest1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/1")
    @ResponseStatus(HttpStatus.OK)
    public String test1() {
        return "hello docker 1 world/test";
    }

    @GetMapping("/2")
    @ResponseStatus(HttpStatus.OK)
    public String test2() {
        return "hello docker 1 world/test2";
    }
}
