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
public class WorkQuerys {

    private static final String GET_USER_WORK = "SELECT project_name, project_issue, task_number, type_of_procces, completed FROM work_user WHERE user = ?";
    private static final String COMPLETE_TASK_WORK = "UPDATE work_user SET completed = ? WHERE task_number = ?";

    protected String getUserWorkRecord() {
        return GET_USER_WORK;
    }

    protected String getCompletedTaskWork() {
        return COMPLETE_TASK_WORK;
    }

}
