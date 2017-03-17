/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Icha
 */
public class file_kereta {
     private static Connection kereta; 
    public static Connection GetConnection() throws SQLException
{ 
        if (kereta == null) { 
            Driver driver = new Driver(); 
            kereta = (Connection) 
DriverManager.getConnection("jdbc:mysql://localhost:3306/db_kereta?zeroDateTimeBehavior=convertToNull", "root", ""); 
        } 
        return kereta; 
    } 
}
