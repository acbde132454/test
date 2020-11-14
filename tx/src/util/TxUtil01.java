package util;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: spring
 * @Package: util
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 14:01
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 * 构造方法私有化
 * 提供一个静态常量
 * 返回该常量的一个静态方法
 */
public class TxUtil01 {

    private static SqlSession sqlSession = MyBatisUtil.getSqlSession();

    private TxUtil01(){}

    public static SqlSession getSqlSession(){
        return sqlSession;
    }




}