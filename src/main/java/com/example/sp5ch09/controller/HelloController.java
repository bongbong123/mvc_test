package com.example.sp5ch09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@RestController
@Controller
@RequestMapping("/v2")
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model,
                        @RequestParam(value = "name", required = false) String name) {
        model.addAttribute("greeting", "안녕하세요,");
//        model.addAttribute("name", name);
        return "hello-page";
    }

//    @GetMapping("/hello")
//    public ModelAndView hello(Model model) {
//        ModelAndView mav = new ModelAndView("/hello-page");
//        model.addAttribute("greeting", "안녕하세요,");
//        return mav;
//    }
}
