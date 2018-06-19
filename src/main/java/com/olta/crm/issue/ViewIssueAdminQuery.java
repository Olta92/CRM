/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.issue;

/**
 *
 * @author Olti
 */
public class ViewIssueAdminQuery {
    
    private static final String GET_ALL_ISSUES = "SELECT * FROM issue";
    
    
    protected String getAllIsses(){
        return GET_ALL_ISSUES;
    }
    
}
