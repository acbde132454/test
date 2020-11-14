package com.bjpowernode.spring.springIOC02.test;

import com.bjpowernode.spring.springIOC01.bean.Person;
import com.bjpowernode.spring.springIOC02.bean.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.test
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 8:50
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TestIOC02 {
    private BeanFactory factory;

    @Before
    public void before(){

        factory =
                new ClassPathXmlApplicationContext("applicationContext.xml");
    }


    //Bean对象对象属性的注入
    @Test
    public void test01(){
       // User user = (User) factory.getBean("user");
       // System.out.println(user);
    }

    //使用注解方式完成 Bean对象对象属性的注入
    /*
    * @Component注解标注的bean对象，默认id号是类名首字母小写
    * */
    @Test
    public void test02(){
      // User user = (User) factory.getBean("user1");
       // System.out.println(user);
       /* Object cat = factory.getBean("cat");
        System.out.println(cat);*/
    }


    //Bean的作用域
    @Test
    public void test03(){
       // User user1 = (User) factory.getBean("user");
        //User user2 = (User) factory.getBean("user");
       // System.out.println(user1 == user2);

    }

    //bean的生命周期
    @Test
    public void test04(){
        //User user = (User) factory.getBean("user");
       // System.out.println(user);
    }

    //bean的懒加载
    @Test
    public void test05(){
//        User user = (User) factory.getBean("user");
    }

    @After
    public void after(){
        ((ClassPathXmlApplicationContext) factory).close();
    }

}