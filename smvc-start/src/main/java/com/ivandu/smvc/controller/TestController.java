package com.ivandu.smvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/testController")
public class TestController {
    @RequestMapping(value = "/getView")
    @ResponseBody
    public ModelAndView getView(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView("test-jsp");
        System.out.println("success");
        return modelAndView;
    }
}
