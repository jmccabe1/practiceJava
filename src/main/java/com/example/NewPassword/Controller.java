package com.example.NewPassword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping()
    String hello() {
        return "Hello, World!";
    }
}
