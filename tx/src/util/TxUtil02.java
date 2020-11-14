package util;

import org.apache.ibatis.session.SqlSession;

/**
 * @ProjectName: spring
 * @Package: util
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 15:29
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class TxUtil02 {

    private static SqlSession sqlSession;

    static {
        sqlSession = MyBatisUtil.getSqlSession();
    }

    public static SqlSession getSqlSession() {
        return sqlSession;
    }

    public static void main(String[] args) {
        SqlSession sqlSession1 = getSqlSession();
        SqlSession sqlSession2 = getSqlSession();

        System.out.println(sqlSession1 == sqlSession2);
    }
}