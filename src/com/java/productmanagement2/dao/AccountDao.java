/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.productmanagement2.dao;

import com.java.productmanagement2.connection.MyConnection;
import com.java.productmanagement2.entity.Account;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class AccountDao {
    public Boolean checkAccountExist(String userName,String password){
        Connection con = new MyConnection().getConnection();
        
        try {
            String query = "select * from account where account_name = ? and password = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,userName);
            preparedStatement.setString(2,password);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;
    }
    
    public Boolean addAccount(Account account) {
        Connection con = new MyConnection().getConnection();
        
        try {
            String query = "insert into account (account_name,password) values(?,?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1,account.getAccountName());
            preparedStatement.setString(2,account.getPassword());
            int rs = preparedStatement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AccountDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return false;
    }
    
}
