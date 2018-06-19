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
public interface Issue {
    
    public boolean insertIssue(String issue_topic, String project_name, String working_proccess, String project_context, String description, String username);
    
}
