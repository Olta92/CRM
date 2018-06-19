package com.olta.crm.DTO;

import com.olta.crm.validators.Validate;

public class RegisterDTO {

    private final Validate reg = new Validate();

    private String username;
    private String password;
    private String email;
    private String id_card_number;
    private int role;

    public RegisterDTO() {
    }

    public RegisterDTO(String username, String password, String email, String id_card_number, int role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.id_card_number = id_card_number;
        this.role = role;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (reg.validatePassword(password)) {
            this.password = password;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (reg.validateEmail(email)) {
            this.email = email;
        }
    }

    public String getId_card_number() {
        return id_card_number;
    }

    public void setId_card_number(String id_card_number) {
        if (reg.validateEmail(id_card_number)) {
            this.id_card_number = id_card_number;
        }
    }

}
