package com.bjpowernode.spring.springAOP01.service;

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
public class Test {

    public static void main(String[] args) {
       DynamicProxy proxy = new DynamicProxy(new HeBei());
        Beijing beijing = (Beijing) proxy.getInstance();
        String result = beijing.sal("哈哈");
        System.out.println(result);
    }
}