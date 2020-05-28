package com.qf.ssm_demo.service.impl;


import com.qf.ssm_demo.dao.IUserDao;
import com.qf.ssm_demo.entity.User;
import com.qf.ssm_demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author JH
 * @Time 2018/12/14 11:21
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;
    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    public User searchUser(Integer id) {
        return userDao.searchUser(id);
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public void deleteUser(ArrayList<Integer> ids) {
        userDao.deleteUser(ids);
    }
}
