/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.productmanagement2.service;

import com.java.productmanagement2.dao.AccountDao;
import com.java.productmanagement2.entity.Account;

/**
 *
 * @author Admin
 */
public class AccountService {
    private AccountDao userDao;

    public AccountService() {
        userDao = new AccountDao();
    }
    
    
    public Boolean checkAccountExist(String userName,String password) {
        return userDao.checkAccountExist(userName, password);
    }
    
    public Boolean addAccount(Account account) {
        return userDao.addAccount(account);
    }
}
