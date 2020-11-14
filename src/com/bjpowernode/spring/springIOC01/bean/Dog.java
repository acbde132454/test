package com.bjpowernode.spring.springIOC01.bean;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.bean
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 15:43
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Dog {

    private String name;

    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}