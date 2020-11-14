package com.bjpowernode.spring.springAOP01.service;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.dynamicProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/5 10:19
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class SpringAOPTest {

    public static void main(String[] args) {
        BeanFactory beanFactory =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Beijing beijing = (Beijing) beanFactory.getBean("beiJing");
        beijing.sal("abc");
    }
}