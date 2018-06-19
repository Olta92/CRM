/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.issue;

import com.olta.crm.DTO.tableDto.IssueFromTheUser;
import com.olta.crm.DTO.tableDto.TabelOfWorkUserDto;
import com.olta.crm.database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Olta
 */
public class ViewIssueAdminImpl extends ViewIssueAdminQuery implements ViewIssueAdmin {

    private final DatabaseConnection databaseConn = new DatabaseConnection();
    private PreparedStatement pstmt;
    private ResultSet rs;
    private ArrayList<IssueFromTheUser> listOfIssues;
    private IssueFromTheUser workUser;

    @Override
    public ArrayList<IssueFromTheUser> listOfIssues() {
        listOfIssues = new ArrayList<>();
        try {
            pstmt = databaseConn.getConnection().prepareStatement(getAllIsses());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                workUser = new IssueFromTheUser(
                        rs.getString("username"),
                        rs.getString("issue_topic"),
                        rs.getString("project_name"),
                        rs.getString("working_proccess"),
                        rs.getString("project_context"),
                        rs.getString("description")
                );
                listOfIssues.add(workUser);

            }
            pstmt.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listOfIssues;
    }

}
