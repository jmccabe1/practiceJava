package com.example.NewPassword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller { //This is primarily practice with REST, which is why IntelliJ doesn't think Controller or hello are ever used

    @GetMapping("/hello/{parameterName}")//This GetMapping is how you invoke the palindrome logic, via the NewPasswordApplication main
    String hello(@PathVariable ("parameterName") String parameterName) {
        
        return Compute.isPalindrome(parameterName).toString();//Compute.isPalindrome() returns a boolean, so it needs a toString in order to display properly
    }

    @GetMapping("/substring/{parameterName}") //This GetMapping is used for the substring method in LongestUniqueSubstring
    String findSubstring(@PathVariable ("parameterName") String parameterName) {
        return LongestUniqueSubstring.findSubstring(parameterName);
    }
}
