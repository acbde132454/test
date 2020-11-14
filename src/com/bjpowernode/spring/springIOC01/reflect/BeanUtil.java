package com.bjpowernode.spring.springIOC01.reflect;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.reflect
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 11:17
 * @Version: 1.0
 * map.put("name","波斯猫")
 * map.put("age",100)
 * <p>
 *     User user = BeanUtil.formToBean(User.class,request.getParameterMap());
 * Copyright: Copyright (c) 2020
 */
public class BeanUtil<E> {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //自己模拟数据
        Map<String,Object> map = new HashMap<>();
        map.put("name","波斯猫");
        map.put("age",10);
       // Cat cat = formToBean(Cat.class, map);

       // System.out.println(cat);

        Cat cat = new Cat();
        BeanUtils.populate(cat,map);
        System.out.println(cat);
    }

    //将map中的数据通过反射设置到对象中对应的属性里
    public static <T> T formToBean(Class<T> clazz, Map<String,Object> map){

        T t = null;
        //反射获取原类的对象
        try {
            t = clazz.newInstance();

            //先通过反射获取原类的所有以set开头的方法，截取去掉set三个字符
            //在把截取的字符串首字母改成小写   setName
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                //获取以set开头的方法
                String methodName = method.getName();
                if(methodName.startsWith("set")){
                    //截取字符串 toLowerCase():大写字母转小写 setName
                    methodName = methodName.substring(3);
                    //遍历map，取出map中封装的数据
                    //遍历map，获取key,如果key和methodName相等的话
                    for(Map.Entry<String,Object> entry : map.entrySet()){
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if(key.equalsIgnoreCase(methodName)){
                            //通过反射执行对应的set方法
                            method.invoke(t,value);
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }


}