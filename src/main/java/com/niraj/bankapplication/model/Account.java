/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bankapplication.model;

/**
 *
 * @author Niraj Khadka
 */
public class Account {
    private int accNo;
    private String name;
    private int balance;
    
    public Account(){
        
    }
    
    public Account(int accNo, String name, int balance){
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
    }
    
    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    
    public int getAccNo(){
        return this.accNo;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setBalance(int balance){
        this.balance = balance;
    }
    
    public int getBalance(){
        return this.balance;
    }
    
    @Override
    public String toString(){
        return "Account No: "+this.accNo+", Name: "+this.name+", Balance: "+this.balance;
    }
}
