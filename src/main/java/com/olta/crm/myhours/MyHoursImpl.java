/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.myhours;

import com.olta.crm.DTO.tableDto.HouerUserDto;
import com.olta.crm.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Olta
 */
public class MyHoursImpl extends HoursQuerys implements Hours {

    private final DatabaseConnection databaseConn = new DatabaseConnection();
    private PreparedStatement pstmt;
    private final DefaultCategoryDataset data = new DefaultCategoryDataset();
    private ArrayList<HouerUserDto> houerOfUsers;
    private ResultSet rs;

    @Override
    public boolean insertHoursOfUser(String username, String projectName, String projectissue, int taskNumber, int numberOfHouers, String workingProcces) {

        try {
            pstmt = databaseConn.getConnection().prepareStatement(getInsertUserHoursQuery());
            pstmt.setString(1, username);
            pstmt.setString(2, projectName);
            pstmt.setString(3, projectissue);
            pstmt.setInt(4, taskNumber);
            pstmt.setInt(5, numberOfHouers);
            pstmt.setString(6, workingProcces);

            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Hour Succesfull entered");
                return true;
            }

            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Can not create user from database " + ex);
        }
        return false;
    }

    @Override
    public DefaultCategoryDataset data(String userData) {
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getHourUser());
            pstmt.setString(1, userData);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                data.addValue(rs.getInt("number_of_hours"), String.valueOf(rs.getTimestamp("date")), "");
            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Cannot get the hours from the db" + ex);
        }
        return data;
    }

    @Override
    public ArrayList<HouerUserDto> getAllHouerOfUsers() {
        houerOfUsers = new ArrayList<>();
        HouerUserDto houerUser;
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getAllHouers());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                houerUser = new HouerUserDto(
                        rs.getString("user"),
                        rs.getString("project_name"),
                        rs.getString("project_issue"),
                        rs.getInt("task_number"),
                        rs.getString("type_of_procces"),
                        rs.getInt("completed"),
                        rs.getString("description"));
                houerOfUsers.add(houerUser);
            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return houerOfUsers;
    }

}
