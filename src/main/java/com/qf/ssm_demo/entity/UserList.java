package com.qf.ssm_demo.entity;

import lombok.*;

import java.util.List;

/**
 * @Author JH
 * @Time 2019/3/23 9:39
 * @Version 1.0
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserList {
    private List<User> userList;
}
