package com.bjpowernode.spring.springAOP01.service;

import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.dynamicProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 10:06
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service("shanghai")
public class Shanghai implements Beijing {
    @Override
    public String sal(String name) {

        System.out.println("上海分销商卖电脑");

        return name;
    }

    @Override
    public void delete() {
        System.out.println("删除");
        throw new RuntimeException();
    }

    @Override
    public void update() {

    }
}