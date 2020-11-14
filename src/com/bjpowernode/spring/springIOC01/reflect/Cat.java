package com.bjpowernode.spring.springIOC01.reflect;

import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.reflect
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 10:38
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Component("cat")
public class Cat {



    private String name;
    private int age;

    public Cat() {
        System.out.println("构造方法");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void shout(){
        System.out.println("猫叫");
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
}