package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by 22787 on 2017/11/6.
 */
public class C {
    public static Connection conn;
    public static Connection getConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://127.0.0.1/user?useUnicode=true&characterEncoding=UTF-8","root","ding521521");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
