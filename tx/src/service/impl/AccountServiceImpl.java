package service.impl;

import mapper.AccountMapper;
import org.apache.ibatis.session.SqlSession;
import service.AccountService;
import util.TxUtil01;

/**
 * @ProjectName: spring
 * @Package: service.impl
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 11:23
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class AccountServiceImpl implements AccountService {

    private static SqlSession sqlSession = TxUtil01.getSqlSession();


    @Override
    public void zhuanzhang() {
        AccountMapper accountMapper = sqlSession.getMapper(AccountMapper.class);
        accountMapper.zhuanchu();
        int a = 1 /0;
        accountMapper.zhuanru();
    }
}