package com.bjpowernode.spring.springIOC02.dev.dao.impl;

import com.bjpowernode.spring.springIOC02.dev.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.dev.dao.impl
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 14:53
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void login() {
        System.out.println("用户登录");
    }
}