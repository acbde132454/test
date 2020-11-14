package com.bjpowernode.spring.springIOC01.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ProjectName: spring
 * @Package: com.bjpowernode.spring.springIOC01.bean
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/10/31 17:10
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Person {

    private List<String> names;
    private Map<String,String> hobby;
    private Set<String> account;

    @Override
    public String toString() {
        return "User{" +
                "names=" + names +
                ", hobby=" + hobby +
                ", account=" + account +
                '}';
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public Map<String, String> getHobby() {
        return hobby;
    }

    public void setHobby(Map<String, String> hobby) {
        this.hobby = hobby;
    }

    public Set<String> getAccount() {
        return account;
    }

    public void setAccount(Set<String> account) {
        this.account = account;
    }
}