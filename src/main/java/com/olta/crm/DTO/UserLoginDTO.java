/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.DTO;

import com.olta.crm.validators.Validate;
import java.util.Objects;


public class UserLoginDTO {

    private final Validate loginvalidate = new Validate();

    private String idCardNumber;
    private String password;

    public UserLoginDTO(String username, String password) {
        this.idCardNumber = username;
        this.password = password;
    }

    public UserLoginDTO() {
    }

    public String getUsername() {
        return idCardNumber;
    }

    public void setUsername(String email) {
        if (loginvalidate.validateEmail(email)) {
            this.idCardNumber = email;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        if (loginvalidate.validatePassword(password)) {
            this.password = password;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.idCardNumber);
        hash = 31 * hash + Objects.hashCode(this.password);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserLoginDTO other = (UserLoginDTO) obj;
        return true;
    }    

}
