package util;

import org.apache.ibatis.session.SqlSession;

/**
 * @ProjectName: spring
 * @Package: util
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 15:31
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 * ThreadLocal原理:
 * 底层数据结构是map,key:当前的线程,value:需要放入到map的值
 * 调用set方法，就会创建一个副本，而且只有一份，单例
 */
public class TxUtil03 {


    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();
    private static SqlSession sqlSession = MyBatisUtil.getSqlSession();

    public static SqlSession getSqlSession(){
        threadLocal.set(sqlSession);
        return threadLocal.get();
    }

    public static void main(String[] args) {
        SqlSession sqlSession1 = getSqlSession();
        SqlSession sqlSession2 = getSqlSession();
        System.out.println(sqlSession1 == sqlSession2);
    }
}