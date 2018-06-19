/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.work;

import com.olta.crm.DTO.tableDto.TabelOfWorkUserDto;
import com.olta.crm.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * * @author Olta
 */
public class WorkImpl extends WorkQuerys implements Work {

    private final DatabaseConnection databaseConn = new DatabaseConnection();
    private PreparedStatement pstmt;
    private ResultSet rs;
    private ArrayList<TabelOfWorkUserDto> listOfWork;
    private TabelOfWorkUserDto workUser;

    @Override
    public ArrayList<TabelOfWorkUserDto> listOfHouer(String user) {
        listOfWork = new ArrayList<>();
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getUserWorkRecord());
            pstmt.setString(1, user);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                if (rs.getInt("completed") == 0) {
                    workUser = new TabelOfWorkUserDto(
                            rs.getString("project_name"),
                            rs.getString("project_issue"),
                            String.valueOf(rs.getInt("task_number")),
                            rs.getString("type_of_procces")
                    );
                    listOfWork.add(workUser);
                }
            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfWork;
    }

    @Override
    public void updateCompltedWork(int taskNumber) {
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getCompletedTaskWork());
            pstmt.setInt(1, 1);
            pstmt.setInt(2, taskNumber);
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Work Completed!");

            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Could not Updat the task " + ex);
        }
    }

}
