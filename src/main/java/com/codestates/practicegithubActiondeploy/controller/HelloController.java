package com.codestates.practicegithubActiondeploy.controller;

import com.codestates.practicegithubActiondeploy.service.CordJgService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HelloController {

    private final CordJgService service;

    public HelloController(CordJgService service) {
        this.service = service;
    }

    @GetMapping
    public String hello (Model model) {

        String str1 = "Hello World! Hello BE BootCam2!!";
        String str2 = "My name is JG";

        String result = service.calculate(str1,str2);

        model.addAttribute("result",result);

        return "index" ;
    }

    @GetMapping("/main")
    public String hello2 () {

        return "안녕하세요";
    }

}
