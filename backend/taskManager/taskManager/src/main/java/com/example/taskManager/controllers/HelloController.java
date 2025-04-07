package com.example.taskManager.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
//        StringBuilder response = new StringBuilder();
//
//        for (int i = 0; i < 100; i++) {
//            response.append("Hey User you got hacked ")
//                    .append((i + 46) * 5446362)
//                    .append(" Beware of unknown messages<br>");
//        }
//
//        return response.toString();
        return "Welcome to SpringBoot frameWork Here we will work on Big Things......";
    }
}
