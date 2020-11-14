package com.bjpowernode.spring.springIOC02.dev.service.impl;

import com.bjpowernode.spring.springIOC02.dev.dao.UserDao;
import com.bjpowernode.spring.springIOC02.dev.dao.impl.UserDaoImpl;
import com.bjpowernode.spring.springIOC02.dev.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.dev.service.impl
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 14:50
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
@Primary
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void login() {
        userDao.login();
    }
}