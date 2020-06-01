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

    @RequestMapping("/index1")
    public String toIndex(){//可以通过controller访问到templates里面的页面,不可以直接通过路径访问(静态资源路径未指定为template)
        return "index1";//指定resorce后可以直接通过路径访问
    }
    @RequestMapping("/index2")//不可以通过controller访问到templates里面的页面,不可以直接通过路径访问(静态资源路径未指定为static)
    public String toIndex2(){
        return "index2";//指定后可以直接通过路径访问，但是不能通过controller
    }
    @RequestMapping("/index3")//不可以通过controller访问到templates里面的页面,可以直接通过路径访问((静态资源路径未指定为webapp:localhost:8080/index3.html)
    public String toIndex3(){
        return "index3";//指定后可以直接通过路径访问，但是不能通过controller
    }
    //结论:经过application.yml指定路径之后可以访问到静态资源文件夹,可直接访问的静态资源文件夹是指定的或者webapp，除了templates文件夹以外其他文件夹无法通过controller实现跳转(因为集成的是thymeleaf)
}
