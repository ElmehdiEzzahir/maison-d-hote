package DB;

import java.sql.*;
import javax.swing.*;


public class Operations {
    public static void DATA(String Query,String result) {
        Connection con= null;
        Statement st=null;
        try{
        con=DBmgmt.ConnectDB();
        st=con.createStatement();
        st.executeUpdate(Query);
        if (!result.equals(""))
            JOptionPane.showMessageDialog(null,result);
        
        }
        catch(Exception e){ JOptionPane.showMessageDialog(null,e);}
    }
}
