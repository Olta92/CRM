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
public interface AssignWorkI {
 
    public boolean assignWorkToUser(String user, String project_name, String project_issue, int task_number, String type_of_procces, int completed, String description);
    
}
