package com.example.NewPassword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello/{parameterName}")
    String hello(@PathVariable ("parameterName") String parameterName) {
        
        return Compute.isPalindrome(parameterName).toString();
    }
}
