/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.issue;

/**
 *
 * @author Olta
 */
public class IssueQuery {

    private static final String INSERT_USER_ISSUE_QUERY = "INSERT INTO issue ( issue_topic, project_name, working_proccess, project_context, description, username) VALUES (?, ?, ?, ?, ?, ?)";

    protected String getInsertUserIssueQuery() {
        return INSERT_USER_ISSUE_QUERY;
    }
    
    
    
    
}
