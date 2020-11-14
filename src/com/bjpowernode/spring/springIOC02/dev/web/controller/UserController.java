package com.bjpowernode.spring.springIOC02.dev.web.controller;

import com.bjpowernode.spring.springIOC02.dev.service.UserService;
import com.bjpowernode.spring.springIOC02.dev.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.dev
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 14:49
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
public class UserController {

   // @Autowired
   /* @Qualifier("userServiceImpl")*/
    @Resource
    private UserService userService;

    public void doGet(){
        userService.login();
    }
}