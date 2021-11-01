package com.ivandu.smvc.controller;

import com.ivandu.smvc.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping({"/register"})
    public ModelAndView Register(User user, ModelAndView mv) {
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;
    }
}
