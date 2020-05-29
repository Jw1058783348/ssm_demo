package com.qf.ssm_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Administrator
 * @Time 2020/5/29 11:16
 * @Version 1.0
 */
@Controller
public class BaseController {

    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
