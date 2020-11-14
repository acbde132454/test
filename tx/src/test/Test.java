package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @ProjectName: spring
 * @Package: test
 * @Description: java类作用描述
 * @Author: Andy
 * @CreateDate: 2020/11/3 11:13
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public class Test {

    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///sh2004", "root", "1234");

            connection.setAutoCommit(false);

            String sql = "update account set money=money-30 where name='王陈'";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.executeUpdate();

            int a = 1 / 0;

            sql = "update account set money=money+30 where name='女朋友'";
            ps = connection.prepareStatement(sql);
            ps.executeUpdate();
            connection.commit();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }

    }
}