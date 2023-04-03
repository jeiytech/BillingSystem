/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_api;
import java.sql.*;
/**
 *
 * @author HP
 */
public class javaConnect {
    
    /**
     *
     * @return
     */
    public static Connection connect(){
        Connection conn = null;
        try{
        
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/detail", "root", "root");
        }
        catch(ClassNotFoundException | SQLException ex){
            System.out.println("Error: "+ ex.getMessage());
        }
        
        return conn;
    }
}

//insert into login(userName, passwd) vlues("","");