package com.bjpowernode.spring.springIOC01.factoryDesign;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.factoryDesign
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 10:05
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class HeroFactory {


    public static Object getHero(String heroName){
        if("鸭子王".equals(heroName)){
            //创建鸭子王对象
            return new DuckKing();
        }else if("天使".equals(heroName)){
            //创建天使对象
            return new Angle();
        }else if("老鼠".equals(heroName)){
            //创建老鼠对象
            return new Mouse();
        }else if("冰女".equals(heroName)){
            //创建冰女对象
            return new IceGirl();
        }
        return null;
    }
}