/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.work;

import com.olta.crm.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Olta
 */
public class AssignWorkImpl extends AssignWorkQuerys implements AssignWorkI {

    private final DatabaseConnection databaseConn = new DatabaseConnection();
    private PreparedStatement pstmt;

    @Override
    public boolean assignWorkToUser(String user, String project_name, String project_issue, int task_number, String type_of_procces, int completed, String description) {
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getAssignWorkToUser());
            pstmt.setString(1, user);
            pstmt.setString(2, project_name);
            pstmt.setString(3, project_issue);
            pstmt.setInt(4, task_number);
            pstmt.setString(5, type_of_procces);
            pstmt.setInt(6, completed);
            pstmt.setString(7, description);

            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Work Succesfull assign");
                return true;
            }

            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Can not create user from database " + ex);
        }
        return false;
    }
}
