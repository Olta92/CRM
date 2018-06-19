/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.issue;

import com.olta.crm.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Olta
 */
public class IssueImpl extends IssueQuery implements Issue{
    
    private final DatabaseConnection databaseConn = new DatabaseConnection();
    private PreparedStatement pstmt;

    @Override
    public boolean insertIssue(String issue_topic, String project_name, String working_proccess, String project_context, String description, String username) {
         try {
            pstmt = databaseConn.getConnection().prepareStatement(getInsertUserIssueQuery());
            pstmt.setString(1, issue_topic);
            pstmt.setString(2, project_name);
            pstmt.setString(3, working_proccess);
            pstmt.setString(4, project_context);
            pstmt.setString(5, description);
            pstmt.setString(6, username);
            
            if (pstmt.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Issue Succesfull entered");
                return true;
            }

            pstmt.close();
        } catch (SQLException ex) {
            System.out.println("Can not create user from database " + ex);
        }
        return false;
    }
    
}
