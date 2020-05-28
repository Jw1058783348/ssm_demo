package com.qf.ssm_demo.controller;

import com.google.gson.Gson;
import com.qf.ssm_demo.entity.User;
import com.qf.ssm_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * @Author Administrator
 * @Time 2020/2/5 10:00
 * @Version 1.0
 */
@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private IUserService userService;

    @GetMapping("/getUserList")
    public String getUserList(String callback){
        List<User> users = userService.queryAll();
        return callback+"("+new Gson().toJson(users)+")";
    }

    @PostMapping("/addUser")
    public String getUserList(String callback,User user,String hobbys[]){
        System.out.println("爱好是="+ Arrays.toString(hobbys));
        userService.addUser(user);
        return callback+"({status:1,message:'成功',data:"+new Gson().toJson(user)+"})";
    }
}
