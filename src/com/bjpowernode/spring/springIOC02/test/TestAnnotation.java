package com.bjpowernode.spring.springIOC02.test;

import com.bjpowernode.spring.springIOC02.annotation.bean.Student;
import com.bjpowernode.spring.springIOC02.annotation.springConfig.SpringConfig01;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.test
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 11:37
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TestAnnotation {

    @Test
    public void test01(){

        //context:IOC容器
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig01.class);

        //调用方法getBeanDefinitionNames   查看当前IOC容器中到底有哪些对象
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

      /* for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }*/

        //从容器中取出对象
        Student student = (Student) context.getBean("student");
        System.out.println(student);


    }
}