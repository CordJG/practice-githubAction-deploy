package com.codestates.practicegithubActiondeploy.controller;

import com.codestates.practicegithubActiondeploy.service.CordJgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    private final CordJgService service;

    public HelloController(CordJgService service) {
        this.service = service;
    }

    @GetMapping
    public String hello () {

        String str1 = "Hello World! Hello BE BootCam2!!";
        String str2 = "My name is JG";

        String result = service.calculate(str1,str2);



        return result;
    }

    @GetMapping()
    public String hello3() {

        String str3 = "Hello World! Hello BE BootCam2!!";
        String str4 = "My name is JG222";

        String result2 = service.calculate(str3,str4);

        return result2;
    }



    @GetMapping("/main")
    public String hello2 () {

        return "안녕하세요";
    }

}
