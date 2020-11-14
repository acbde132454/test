package com.bjpowernode.spring.springIOC01.reflect;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.reflect
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 10:37
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TestReflection {

    //获取源文件字节码的方式
    @Test
    public void getClassMethod() throws Exception{

        //方式一
        Class<Cat> class1 = (Class<Cat>) Class.forName("com.bjpowernode.spring.springIOC01.reflect.Cat");

        //方式二
        Class<Cat> class2 = Cat.class;

        //方式三
        Class<Cat> class3 = (Class<Cat>) new Cat().getClass();

        //方式四
        Class<? extends ClassLoader> class4 = new Cat().getClass().getClassLoader().getClass();
    }


    //通过Class类来获取和操作原类的属性
    @Test
    public void test01() throws Exception{
        //获取字节码
        Class<Cat> catClass = Cat.class;

        //Field:描述属性对象
        //getFields:只能获取公开的属性
       /* Field[] fields = catClass.getFields();

        for (Field field : fields) {
            System.out.println(field.getName());
        }*/
       //获取所有属性
        /*Field[] declaredFields = catClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }*/
        //操作属性
        Field field = catClass.getDeclaredField("name");
        //通过反射创建原类的对象 执行该行代码会调用原类的无参构造方法
        Cat cat = catClass.newInstance();
        //给执行私有属性权利 消耗资源的
        field.setAccessible(true);
        field.set(cat,"加菲猫");
        System.out.println(cat);
    }

    //反射操作原类的方法
    @Test
    public void test02() throws Exception{
        Class<Cat> catClass = Cat.class;
        //获取所有公开的方法
        /*Method[] methods = catClass.getMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
        }*/
        //获取指定方法
        Method method = catClass.getMethod("setName", String.class);

        Cat cat = catClass.newInstance();
        //参数1:对象 参数2:参数 会调用原类的指定方法
        method.invoke(cat, "波斯猫");

        System.out.println(cat);
    }
}