
package DB;

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBmgmt {
    
    public static Connection  ConnectDB(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","anas2002");
            return con;
        }
        catch(Exception e){
            System.out.println(e);
        }
        return null;
    }
}
