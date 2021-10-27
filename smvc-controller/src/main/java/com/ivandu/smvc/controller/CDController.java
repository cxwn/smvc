package com.ivandu.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/a")
public class CDController {
    @RequestMapping("/t2")
    public String test(Model model) {
        model.addAttribute("msg", "CD demo.");
        return "test";
    }
}
