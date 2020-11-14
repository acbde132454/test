package com.bjpowernode.spring.springAOP01.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.dynamicProxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 10:07
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Component("security")
@Aspect
public class Security {


    public static void security(){
        System.out.println("权限校验");
    }


    @Pointcut("execution(* com.bjpowernode.spring.springAOP01.service.*.sal(..))" +
            " || execution(* com.bjpowernode.spring.springAOP01.service.*.delete(..))")
    public void pointCut(){}

    //方法的目的:给注解一个落脚点
    /*@Before("pointCut()")
    public void before(JoinPoint joinPoint){

        //获取调用方法的名字
        String name = joinPoint.getSignature().getName();
        System.out.println(joinPoint.getSignature().getName());
        security();
    }*/

   /* @After("pointCut()")
    public void after(JoinPoint joinPoint){
        security();
    }*/

    /*@Around("pointCut()")
    public void around(ProceedingJoinPoint joinPoint){


        try {
            security();
            //调用目标方法
            joinPoint.proceed();
            security();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }*/

    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void around(Exception exception){
        security();
    }
}