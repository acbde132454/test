package com.bjpowernode.spring.springIOC01.test;

import com.bjpowernode.spring.springIOC01.bean.Cock;
import com.bjpowernode.spring.springIOC01.bean.Dog;
import com.bjpowernode.spring.springIOC01.bean.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.test
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 15:47
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TestIOC01 {

    private BeanFactory factory;

    @Before
    public void before(){

        factory =
                new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    //从IOC容器中获取Bean对象
    @Test
    public void test01(){
        //读取jar+applicationContext文件，生成IOC容器  factory:IOC
//        ApplicationContext
        //解析applicationContext.xml
        factory =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC中取出bean对象
        Dog dog = (Dog) factory.getBean("dog");
        Cock bean = factory.getBean(Cock.class);
        System.out.println(dog);
    }


    //通过构造方法将属性注入到对象中
    @Test
    public void test02(){
        Dog dog = (Dog) factory.getBean("dog1");
        System.out.println(dog);
    }

    //bean对象的集合属性注入
    @Test
    public void test03(){
       Person person = factory.getBean(Person.class);
        System.out.println(person);
    }



    @After
    public void after(){
        ((ClassPathXmlApplicationContext) factory).close();
    }
}