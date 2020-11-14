package com.bjpowernode.spring.springAOP01.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springAOP01.annotation
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/5 11:40
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
    EnableAspectJAutoProxy:开启AspectJ自动代理功能
 */
@Configuration
@ComponentScan(basePackages = {"com.bjpowernode.spring.springAOP01.service"})
@EnableAspectJAutoProxy
public class SpringConfig {


}