package com.bjpowernode.spring.springIOC02.dev.test;

import com.bjpowernode.spring.springIOC02.dev.web.controller.UserController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.dev.test
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 15:00
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test {

    public static void main(String[] args) {
        BeanFactory factory =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserController userController = (UserController) factory.getBean("userController");
        userController.doGet();
    }
}