/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

/**
 *
 * @author Lenovo
 */

import java.sql.*;
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmsystem","root","123456");
            return con;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
    
}
