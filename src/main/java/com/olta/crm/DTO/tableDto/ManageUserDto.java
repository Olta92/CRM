/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.DTO.tableDto;

/**
 *
 * @author Olta
 */
public class ManageUserDto {

    private String email;
    private String idCard;
    private int role;
    private String phone;
    private String firstName;
    private String lastName;

    public ManageUserDto() {
    }

    public ManageUserDto(String email, String idCard, int role, String phone, String firstName, String LastName) {
        this.email = email;
        this.idCard = idCard;
        this.role = role;
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = LastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    
}
