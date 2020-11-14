package com.bjpowernode.spring.springIOC01.factoryDesign;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.factoryDesign
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 10:12
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TestFactory {

    //ClassCastException
    public static void main(String[] args) {
        Mouse mouse  = (Mouse) HeroFactory.getHero("老鼠");
        mouse.skill();
    }
}