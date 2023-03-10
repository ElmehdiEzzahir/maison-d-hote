
package DB;

import DB.DBmgmt;
import java.sql.*;
import javax.swing.*;

public class tables {
    public static void main(String[] args) {
        Connection con= null;
        Statement st=null;
        
        try{
           con=DBmgmt.ConnectDB();
           st=con.createStatement();

               st.executeUpdate("Create sequence inc MINVALUE 1 START WITH 1 INCREMENT BY 1 CACHE 10");
               st.executeUpdate("CREATE TABLE ROOMS(id Number NOT NULL,room_number int,type varchar(50) NOT NULL,price int NOT NULL,status varchar(25))");
               
               st.executeUpdate("CREATE TABLE Checkin(idC Number NOT NULL,cin varchar(30),fullname varchar(60) NOT NULL,RN int,bookedin int NOT NULL,nationality varchar(70),phonenumber varchar(50) NOT NULL,ci Date)");
               st.executeUpdate("Create sequence incch MINVALUE 1 START WITH 1 INCREMENT BY 1 CACHE 10");
               
//
               
               st.executeUpdate("CREATE TABLE client(idcl Number,cin varchar(30),fullname varchar(60),phonenumber varchar(50),nationality varchar(70),RN int,ci Date,co Date,total varchar(50))");
//               
               System.out.println("good");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    }
        finally{
        try{
           con.close();
           st.close();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
  }
  }


}
