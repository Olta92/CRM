/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.manageuser;

/**
 *
 * @author Olti
 */
public class ManageUserQuerys {

    private static final String DELETE_USER = "DELETE FROM users WHERE idCardNumber = ?";
    private static final String UPDATE_USER = "UPDATE users SET email=?, role=?, phone =? ,firstname =? ,lastname = ? WHERE idCardNumber =?";

    private static final String GET_ALL_USERS = "SELECT email, role, phone, idCardNumber, firstname,lastname FROM users";

    protected String getDeleteUser() {
        return DELETE_USER;
    }

    protected String getUpdateUser() {
        return UPDATE_USER;
    }

    protected String getALLUsers() {
        return GET_ALL_USERS;
    }

}
