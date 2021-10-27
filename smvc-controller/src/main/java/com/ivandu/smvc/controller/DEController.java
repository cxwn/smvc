package com.ivandu.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DEController {
    @RequestMapping("/add")
    public String test(int a, int b, Model model){
        int res = a + b;
        model.addAttribute("msg", "结果为：" + res);
        return "test";
    }
}
