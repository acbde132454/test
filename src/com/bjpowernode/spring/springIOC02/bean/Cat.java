package com.bjpowernode.spring.springIOC02.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC02.bean
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/2 8:46
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Component

public class Cat {

    private String kind;


    @Override
    public String toString() {
        return "Cat{" +
                "kind='" + kind + '\'' +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}