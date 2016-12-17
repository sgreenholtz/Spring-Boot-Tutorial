package com.springboot.tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Hello {

    @RequestMapping(value="hello", method = RequestMethod.GET)
    public String getMessage(Model model) {
        model.addAttribute("message", "Hello world!");
        return "greeting";
    }

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String getIndex() {
        return "index";
    }
}
