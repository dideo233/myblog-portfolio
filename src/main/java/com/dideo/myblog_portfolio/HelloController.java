package com.dideo.myblog_portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("blogTitle", "My Blog");
        model.addAttribute("welcomeMessage", "나만의 백엔드 블로그에 오신 것을 환영합니다.");
        return "home";
    }
}
