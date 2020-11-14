package com.bjpowernode.spring.springIOC02.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.bean
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 8:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 * 将对象属性赋值给对象的时候说法:
 * 1、将属性注入到对象中
 * 2、对象依赖这些属性
 */
@Component("user1")
public class User {

    private String name;
    private int age;

    @Autowired//默认按类型注入：cat和user进行关联
    private Cat cat;

    public User() {
        System.out.println("构造方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }

    public void init(){
        System.out.println("初始化");
    }

    public void destroy(){
        System.out.println("销毁");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
}