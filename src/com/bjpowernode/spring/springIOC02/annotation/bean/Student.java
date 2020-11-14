package com.bjpowernode.spring.springIOC02.annotation.bean;

import com.bjpowernode.spring.springIOC02.bean.Cat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.annotation.bean
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 11:37
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Component("student")
public class Student {

    @Value("张三")
    private String name;

    @Autowired
    private Cat cat;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cat=" + cat +
                '}';
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("销毁");
    }
}