package proxy;

import org.apache.ibatis.session.SqlSession;
import util.TxUtil01;
import util.TxUtil02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: spring
 * @Package: proxy
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 11:33
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class AccountPoxy implements InvocationHandler {

    private Object target;

    public AccountPoxy(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces()
        ,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //当前sqlSession默认是不提交事务的
//        SqlSession sqlSession = TxUtil01.getSqlSession();
        SqlSession sqlSession = TxUtil02.getSqlSession();
        try{
            //调用目标方法
            method.invoke(target,args);
            sqlSession.commit();
        }catch (Exception e){
            //事务回滚
            sqlSession.rollback();
            e.printStackTrace();
        }

        return null;
    }
}