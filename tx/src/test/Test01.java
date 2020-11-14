package test;

import proxy.AccountPoxy;
import service.AccountService;
import service.impl.AccountServiceImpl;

/**
 * @ProjectName: spring
 * @Package: test
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 11:26
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test01 {

    public static void main(String[] args) {
        AccountPoxy accountPoxy = new AccountPoxy(new AccountServiceImpl());
        AccountService accountService = (AccountService) accountPoxy.getProxy();

        accountService.zhuanzhang();

    }
}