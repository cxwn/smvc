package com.ivandu.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHello {
    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg", "Hello, SpringMVC annotation.");
        return "hello";
    }
}
