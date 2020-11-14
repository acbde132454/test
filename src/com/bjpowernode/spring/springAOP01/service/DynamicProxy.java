package com.bjpowernode.spring.springAOP01.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.dynamicProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 10:10
 * @Version: 1.0
 * * <p>通过DynamicProxy创建一个代理类:既能调用目标方法，还能进行校验
 * Copyright: Copyright (c) 2020
 */
public class DynamicProxy implements InvocationHandler {

    //被代理类
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        /*
        参数1:获取target的类信息 clazz.getMehotd(); method.invoke()
        参数2:target的父类(接口:Beijing)的信息 获取父类的接口中的方法
        参数:InvocationHandler对象
         */
        return  Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    //会被自动调用
    /*
    * args:如果方法有参数，args就会把参数接收
    * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Security.security();

        //执行目标方法
        Object invoke = method.invoke(target, args);

        Security.security();
        return invoke;//返回执行目标方法的结果
    }
}