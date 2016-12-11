package com.springboot.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping(value="hello")
    public String getMessage(Model model) {
        model.addAttribute("message", "Hello world!");
        return "greeting";
    }
}
