/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.work;

/**
 *
 * @author Olta
 */
public class AssignWorkQuerys {
    
    private static final String ASSIGN_WORK_TO_USER = "INSERT INTO work_user (user, project_name, project_issue, task_number, type_of_procces, completed, description) VALUES ( ?, ?, ?, ?, ?, ?, ?);";
    
    protected String getAssignWorkToUser(){
        return ASSIGN_WORK_TO_USER;
    }
    
}
