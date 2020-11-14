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
public class Test {


    public static void main(String[] args) {
        Company company = new Company(new Customer());
        company.buyCar();
    }
}