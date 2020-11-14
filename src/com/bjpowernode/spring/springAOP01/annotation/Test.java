package com.bjpowernode.spring.springAOP01.annotation;

import com.bjpowernode.spring.springAOP01.service.Beijing;
import com.bjpowernode.spring.springAOP01.service.Shanghai;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.annotation
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/5 11:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Beijing beijing = (Beijing) context.getBean("shanghai");

//        beijing.sal("abc");
        beijing.delete();
    }
}