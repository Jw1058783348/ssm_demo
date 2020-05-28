package com.qf.ssm_demo.service;


import com.qf.ssm_demo.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JH
 * @Time 2018/12/14 11:20
 * @Version 1.0
 */
public interface IUserService {
    List<User> queryAll();
    User searchUser(Integer id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(ArrayList<Integer> ids);
}
