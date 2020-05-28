package com.qf.ssm_demo.controller;


import com.qf.ssm_demo.entity.User;
import com.qf.ssm_demo.entity.UserList;
import com.qf.ssm_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author JH
 * @Time 2018/12/14 11:27
 * @Version 1.0
 */
@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private IUserService userService;
    //@Autowired
   // private HSSFWorkbook hssfWorkbook;

    @RequestMapping("/getUserList")
    public String getUserList(Model model){
        List<User> users = userService.queryAll();
        model.addAttribute("userList",users);
       // System.out.println(hssfWorkbook);
        return "userList";
    }

    @RequestMapping("/addUser")
    public String addUser(User user,String hobbys[]){
        System.out.println("爱好是="+Arrays.toString(hobbys));
       userService.addUser(user);
        System.out.println(user);
        return "index";
    }
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        userService.updateUser(user);

        return "index";
    }
    @RequestMapping("/deleteUser/{ids}")
    public String deleteUser(@PathVariable("id") ArrayList<Integer> ids){
        userService.deleteUser(ids);
        System.out.println(111111111);
        return "index";
    }
    @RequestMapping("/editUser/{id}")
    public String editUser(@PathVariable("id")Integer id ,Model model){
        User user=userService.searchUser(id);
        model.addAttribute("user",user);
        return "edituser";
    }
    @RequestMapping("/topage/{page}")
    public String topage(@PathVariable("page") String page){
        System.out.println("调到"+page+"的页面");
        System.out.println("页面跳转");
        return page;
    }

    @RequestMapping("/addUserList")
    public String addUserList(UserList userList){
        System.out.println(userList);
        return "index";
    }

}

