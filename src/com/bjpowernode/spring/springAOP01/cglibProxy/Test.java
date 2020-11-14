package com.bjpowernode.spring.springAOP01.cglibProxy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.cglibProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 15:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test {

    public static void main(String[] args) {
        Cglib cglib = new Cglib(new UserService());

        UserService userService = (UserService) cglib.getInstance();
        userService.delete();


    }
}