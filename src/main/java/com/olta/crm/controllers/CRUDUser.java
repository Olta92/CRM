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
public interface CRUDUser {
    
    public boolean createUserWithUsernameEmailPasswIdCard(String username, String password, String email, String id_card, int role, String phone, String firstname, String lastname);
    
    public int getRoleOfUser(String email, String password);
    
    public boolean existUserInDatabase(String email, String password);
    
    public boolean isUserInDatabase(String email);
    
}
