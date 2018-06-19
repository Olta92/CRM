/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.controllers;

/**
 *
 * @author Olta
 */
public class CRUDUserQueries {

    protected final String getCreateQuery() {
        return "INSERT INTO users(username, password, email, idCardNumber, role, phone,firstname,lastname) VALUES (?,?,?,?,?,?,?,?)";
    }

    protected final String getUserRole() {
        return "SELECT role FROM users WHERE email= ? AND password= ?";
    }
    
     protected final String isUserInDb() {
        return "SELECT * FROM users WHERE email= ? AND password= ?";
    }
    
    protected final String getExistUserInDatabase() {
        return "SELECT * FROM users WHERE email= ?";
    }

}
