package LibraryManagementSystem;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
    
    public Conn() {
        try {
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/library?useSSL=false",user:"root", password:"SIN29@chan" );
            Statement stm=conn.createStatement();
        } catch (Exception e) {
           e.getmessage;
        }
    }
}
            
          
    