package com.qf.ssm_demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.qf.ssm_demo.entity.User;
import com.qf.ssm_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Administrator
 * @Time 2020/5/27 9:08
 * @Version 1.0
 */
@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    private IUserService userService;

    @GetMapping
    public Object getUserList(){
        List<User> users = userService.queryAll();
        JSONObject jsonObject = new JSONObject();
          jsonObject.put("status",1);
          jsonObject.put("data", users);
          jsonObject.put("message","成功");
        return jsonObject;
    }

    @PostMapping
    public Object addUser(@RequestBody User user){
        userService.addUser(user);
        JSONObject jsonObject = new JSONObject();
          jsonObject.put("status",1);
          jsonObject.put("data","");
          jsonObject.put("message","成功");
        return jsonObject;
    }

    @PutMapping("/{id}")
    public Object updateUser(@PathVariable Integer id,@RequestBody User userReq){
        User user = userService.searchUser(id);
        if(!StringUtils.isEmpty(userReq.getUsername())){
            user.setUsername(userReq.getUsername());
        }
        if(!StringUtils.isEmpty(userReq.getPassword())){
            user.setPassword(userReq.getPassword());
        }
        userService.updateUser(user);
        JSONObject jsonObject = new JSONObject();
          jsonObject.put("status",1);
          jsonObject.put("data","");
          jsonObject.put("message","成功");
        return jsonObject;
    }

    @DeleteMapping("/{ids}")
    public Object deleteUser(@PathVariable ArrayList<Integer> ids){
        userService.deleteUser(ids);
        JSONObject jsonObject = new JSONObject();
          jsonObject.put("status",1);
          jsonObject.put("data","");
          jsonObject.put("message","成功");
        return jsonObject;
    }
}
