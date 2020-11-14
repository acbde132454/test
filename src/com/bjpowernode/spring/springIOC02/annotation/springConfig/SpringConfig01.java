package com.bjpowernode.spring.springIOC02.annotation.springConfig;

import com.bjpowernode.spring.springIOC02.annotation.bean.Student;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.annotation.springConfig
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 11:37
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 * @Configuration:表名该类是配置类，就等同于applicationContext.xml文件
 */
@Configuration
@ComponentScan(basePackages = {"com.bjpowernode.spring.springIOC02"})
public class SpringConfig01 {

    /*
    * @Bean目的是将对象放入到容器中，我们主要使用IOC管理Bean对象功能
    * */
    /*@Bean("student")
    @Scope("prototype")
    @Lazy*/
    public Student getStudent(){
        return new Student();
    }


}