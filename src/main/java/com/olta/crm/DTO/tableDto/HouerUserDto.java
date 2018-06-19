/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.DTO.tableDto;

/**
 *
 * @author Olta
 */
public class HouerUserDto {
    
    private String user;
    private String project_name;
    private String project_issue;
    private int task_number;
    private String type_of_procces;
    private int completed;
    private String description;

    public HouerUserDto() {
    }

    public HouerUserDto(String user, String project_name, String project_issue, int task_number, String type_of_procces, int completed, String description) {
        this.user = user;
        this.project_name = project_name;
        this.project_issue = project_issue;
        this.task_number = task_number;
        this.type_of_procces = type_of_procces;
        this.completed = completed;
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_issue() {
        return project_issue;
    }

    public void setProject_issue(String project_issue) {
        this.project_issue = project_issue;
    }

    public int getTask_number() {
        return task_number;
    }

    public void setTask_number(int task_number) {
        this.task_number = task_number;
    }

    public String getType_of_procces() {
        return type_of_procces;
    }

    public void setType_of_procces(String type_of_procces) {
        this.type_of_procces = type_of_procces;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
