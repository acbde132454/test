package com.bjpowernode.spring.springIOC02.extra;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.extra
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 16:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test01 {

    @Test
    public void test01(){
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Object bird = beanFactory.getBean("train");

        System.out.println(bird);
    }
}