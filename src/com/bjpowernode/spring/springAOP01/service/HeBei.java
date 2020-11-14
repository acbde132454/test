package com.bjpowernode.spring.springAOP01.service;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.dynamicProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 10:05
 * @Version: 1.0
 * <p>既能调用目标方法，还能进行校验
 *
 * Copyright: Copyright (c) 2020
 */
public class HeBei implements Beijing {


    @Override
    public String sal(String name) {
        System.out.println("河北分销商卖电脑");
        return name;
    }

    @Override
    public void delete() {

        System.out.println("删除");
    }

    @Override
    public void update() {
    }
}