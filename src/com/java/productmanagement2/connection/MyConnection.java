/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.productmanagement2.connection;

import com.java.productmanagement2.dao.AccountDao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MyConnection {
    private final String url = "jdbc:postgresql://localhost:5432/ProductManagement";
    private final String user = "postgres";
    private final String password = "123456";
    private Connection conn;
    
    
    public Connection getConnection() {
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("compelte");
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("no");
        }
        return conn;
    }
    
}
