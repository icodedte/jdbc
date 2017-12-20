package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Created by 22787 on 2017/12/2.
 */
public class E {
    public void rePassword(){
        Connection conn=null;
        ResultSet rs=null;
        PreparedStatement prep=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/orcl?useUnicode=true&characterEncoding=UTF-8","root","root");

            prep=conn.prepareStatement("DELETE FROM xiqu WHERE username=?");
            prep.setString(1,"333");
            prep.executeUpdate();



        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if(prep!=null){
                try {
                    prep.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }}
        }



    }
    public void qurey(){
        Connection conn=null;
        PreparedStatement prep=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1/orcl?useUnicode=true&characterEncoding=UTF-8","root","root");
            prep= conn.prepareStatement("select * from xiqu WHERE username=?");
            prep.setString(1,"1504010506");
            rs=prep.executeQuery();
            rs.next();

                System.out.printf("%s,%s,%d\n",rs.getString("work"),rs.getString("username"),rs.getInt("money"));





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

    public static void main(String[] args) {
      E e=new E();
      e.rePassword();
    }
}
