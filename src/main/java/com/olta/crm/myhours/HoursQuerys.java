/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.myhours;

/**
 *
 * @author Olta
 */
public class HoursQuerys {
    
    private static final String INSERT_USER_HOURS_QUERY = "INSERT INTO houer (username, project_name, project_issue, task_number, number_of_hours, working_procces) VALUES ( ?, ?, ?, ?, ?, ?)";
    
    private static final String GET_HOURS_USER = "SELECT number_of_hours , date FROM houer WHERE username = ?";
    
    private static final String GET_ALL_HOUER_OF_USER = "SELECT * FROM work_user";
            
     
    
    protected String getInsertUserHoursQuery() {
        return INSERT_USER_HOURS_QUERY;
    }
    
    protected String getHourUser(){
        return GET_HOURS_USER;
    }
   
    protected String getAllHouers(){
        return GET_ALL_HOUER_OF_USER;
    }
}
