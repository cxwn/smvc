package com.ivandu.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDemo {
    @RequestMapping("/t2")
    public String controllerTest(Model model){
        model.addAttribute("msg", "This is a test.");
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(Model model){
        model.addAttribute("msg", "Show me your code.");
        return "test";
    }
}
