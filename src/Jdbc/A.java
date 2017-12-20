package Jdbc;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import java.sql.*;



/**
 * Created by 22787 on 2017/10/24.
 */
public class A {


    public void add(){
        Connection conn=null;
        PreparedStatement prep=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/user?useUnicode=true&characterEncoding=UTF-8","root","ding521521");
           prep=conn.prepareStatement("insert into user(username,password) values (?,?)");
            prep.setString(1,"123");
            prep.setString(2,"asd");
            System.out.print(prep.executeUpdate()>0?"ok":"no");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                prep.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }

    public void del(){
        Connection conn=null;
        PreparedStatement prep=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/td?useUnicode=true&characterEncoding=UTF-8","root","ding521521");
            prep= conn.prepareStatement(" * from user");
            rs=prep.executeQuery();
            while (rs.next()){

                System.out.printf("%s,%d\n",rs.getString("username"),rs.getInt("userid"));
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
                prep.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


    public void qurey(){
        Connection conn=null;
        PreparedStatement prep=null;
        ResultSet rs=null;
        try {
             Class.forName("com.mysql.jdbc.Driver");

             conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/td?useUnicode=true&characterEncoding=UTF-8","root","ding521521");
             prep= conn.prepareStatement("select * from user");
             rs=prep.executeQuery();
             while (rs.next()){

                 System.out.printf("%d,%s,%d\n",rs.getString("peopleid"),rs.getString("username"),rs.getInt("money"));
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
                prep.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
