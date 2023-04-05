package com.codestates.practicegithubActiondeploy.controller;

import com.codestates.practicegithubActiondeploy.service.CordJgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final CordJgService service;

    public HelloController(CordJgService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String hello () {

        String str1 = "Hello World! Hello BE BootCam2!!";
        String str2 = "My name is JG";

        String result = service.calculate(str1,str2);


        return result;
    }

}
