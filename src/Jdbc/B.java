package Jdbc;

import java.sql.*;

/**
 * Created by 22787 on 2017/11/6.
 */
public class B {/*
private Connection conn;
PreparedStatement pstsm=null;
ResultSet rs=null;
    public B(){
        conn=C.getConn();
    }
public void add1()  {
        try {
           pstsm=conn.prepareStatement("insert into user(username,password) values (?,?)");
            pstsm.setString(1,"aaa");
            pstsm.setString(2,"bbb");
            pstsm.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pstsm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}

public void select(){

    try {
        Class.forName("com.mysql.jdbc.Driver");


        pstsm= conn.prepareStatement("select * from user");
        rs=pstsm.executeQuery();
        while (rs.next()){

            System.out.printf("%s,%s\n",rs.getString("username"),rs.getString("password"));
        }




    } catch (Exception e) {
        e.printStackTrace();
    }finally {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            pstsm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            pstsm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}*/
}
