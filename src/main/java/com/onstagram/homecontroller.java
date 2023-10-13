package com.onstagram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homecontroller {

    @GetMapping("/")
    public String home() {
        return "main";
    }

    @GetMapping("/user/joinForm")
    public String joinForm() {
        return "/user/joinForm";
    }

}