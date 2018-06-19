/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.manageuser;

import com.olta.crm.DTO.tableDto.ManageUserDto;
import java.util.ArrayList;

/**
 *
 * @author Olti
 */
public interface ManageUserIn {
    
    public ArrayList<ManageUserDto> getAllUsers();
    
    public boolean updateUserAdmin(String email, String idCard, int role, String phone, String firstName, String secondName);
    
    public boolean deleteUser(String idCard);
    
    
}
