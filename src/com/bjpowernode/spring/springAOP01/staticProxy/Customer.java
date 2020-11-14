package com.bjpowernode.spring.springAOP01.staticProxy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.staticProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 9:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Customer implements Service {
    @Override
    public void buyCar() {
        System.out.println("用户买车");
    }
}