/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.niraj.bankapplication.controller;

/**
 *
 * @author Niraj Khadka
 */
import java.sql.*;
public class DBController {
    Connection conn;
    Statement st;
    
    DBController(){
        
    }
    
    DBController(String url, String user, String password){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ResultSet select(String query){
        try{
            Statement st = conn.createStatement();
            return st.executeQuery(query);
            
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public int iud(String query){
        try{
            Statement st = conn.createStatement();
            return st.executeUpdate(query);
            
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }
    }
    
    public void close(){
        try{
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
