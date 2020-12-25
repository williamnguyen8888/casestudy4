package com.williamnews.controller.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class APostController {
    @GetMapping("/post")
    public ModelAndView adminPost(){
        ModelAndView modelAndView = new ModelAndView("/admin/html/listOrders");
        return modelAndView;
    }
}
