/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bankapplication.controller;

import com.niraj.bankapplication.model.Account;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Niraj Khadka
 */
public class BankController {
    DBController dbConn;
    
    
    public BankController(){
        dbConn = new DBController("jdbc:mysql://localhost:3306/bca", "root", "root");
    }
    
    public int newAccount(Account acc){
        return dbConn.iud("INSERT INTO `bca`.`account` (`accNo`, `name`, `balance`) "
                + "VALUES ('"+acc.getAccNo()+"', '"+acc.getName()+"', '"+acc.getBalance()+"');");
    }
    
    public ArrayList<Account> listAll(){
        ResultSet rs = dbConn.select("SELECT * FROM account;");
        ArrayList<Account> allAcc = new ArrayList<>();
        try{
            while(rs.next()){
                Account acc = new Account(rs.getInt("accNo"), rs.getString("name"), rs.getInt("balance"));
                allAcc.add(acc);
            }
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        return allAcc;
    }
}
