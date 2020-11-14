package com.bjpowernode.spring.springAOP01.cglibProxy;

import com.bjpowernode.spring.springAOP01.service.Security;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.cglibProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 15:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Cglib implements MethodInterceptor {

    //被代理对象
    private Object target;

    public Cglib(Object target) {
        this.target = target;
    }

    //创建一个代理对象，代理target来完成调用方法以及执行登录校验
    public Object getInstance(){
        Enhancer enhancer = new Enhancer();
        //给新创建的对象找父类，需要知道父类的信息:有哪些方法，即将调用哪些方法
        enhancer.setSuperclass(target.getClass());
        //设置回调函数:目的就是为了正确执行目标方法
        enhancer.setCallback(this);
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //登录校验
        LoginAspect.login();
        Security.security();
        //执行目标方法
        methodProxy.invokeSuper(o,objects);

        return null;
    }
}