package com.bjpowernode.spring.springAOP01.staticProxy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.staticProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 9:11
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Company implements Service {

    private Customer customer;


    private Seller seller;

    public Company(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buyCar() {
        customer.buyCar();
    }
}