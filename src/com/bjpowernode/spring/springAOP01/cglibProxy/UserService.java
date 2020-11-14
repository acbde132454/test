package com.bjpowernode.spring.springAOP01.cglibProxy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.cglibProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 15:38
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class UserService {

    public void add(){

        System.out.println("添加方法");
    }

    public void delete(){

        System.out.println("删除方法");
    }
}