package com.williamnews.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class APostCategoryController {
    @GetMapping("/post-category")
    public ModelAndView postCategory(){
        ModelAndView modelAndView = new ModelAndView("/admin/html/PostCategory");
        return modelAndView;
    }
}
