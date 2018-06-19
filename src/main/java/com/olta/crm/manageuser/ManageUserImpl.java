/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.manageuser;

import com.olta.crm.DTO.tableDto.ManageUserDto;
import com.olta.crm.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Olta
 */
public class ManageUserImpl extends ManageUserQuerys implements ManageUserIn {

    private final DatabaseConnection databaseConn = new DatabaseConnection();
    private PreparedStatement pstmt;
    private ResultSet rs;
    private ManageUserDto manageUser;
    private ArrayList<ManageUserDto> listOfUsers;

    @Override
    public ArrayList<ManageUserDto> getAllUsers() {
        listOfUsers = new ArrayList<>();
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getALLUsers());
            rs = pstmt.executeQuery();
            while (rs.next()) {

                manageUser = new ManageUserDto(
                        rs.getString("email"),
                        rs.getString("idCardNumber"),
                        rs.getInt("role"),
                        rs.getString("phone"),
                        rs.getString("firstname"),
                        rs.getString("lastname")
                );

                listOfUsers.add(manageUser);
            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfUsers;
    }

    @Override
    public boolean updateUserAdmin(String email, String idCard, int role, String phone, String firstName, String secondName) {
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getUpdateUser());
            pstmt.setString(1, email);
            pstmt.setInt(2, role);
            pstmt.setString(3, phone);
            pstmt.setString(4, firstName);
            pstmt.setString(5, secondName);
            pstmt.setString(6, idCard);
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Update Complete!");
                return true;
            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Could not Update the task " + ex);
        }
        return false;

    }

    @Override
    public boolean deleteUser(String idCard) {
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getDeleteUser());
            pstmt.setString(1, idCard);
            
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Deleted Succesfully!");
                return true;
            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Could not Delete the task " + ex);
        }
        return false;
    }

}
