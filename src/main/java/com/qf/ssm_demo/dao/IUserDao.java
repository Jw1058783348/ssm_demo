package com.qf.ssm_demo.dao;


import com.qf.ssm_demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JH
 * @Time 2018/12/14 11:00
 * @Version 1.0
 */
@Mapper
public interface IUserDao {
    List<User> queryAll();
    User searchUser(Integer id);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(ArrayList<Integer> ids);

}
