/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.DTO.tableDto;

/**
 *
 * @author Olti
 */
public class TabelOfWorkUserDto {

    private String projectName;
    private String projectIssue;
    private String taskNumber;
    private String typeOfProcces;

    public TabelOfWorkUserDto() {
    }

    public TabelOfWorkUserDto(String projectName, String projectIssue, String taskNumber, String typeOfProcces) {
        this.projectName = projectName;
        this.projectIssue = projectIssue;
        this.taskNumber = taskNumber;
        this.typeOfProcces = typeOfProcces;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectIssue() {
        return projectIssue;
    }

    public void setProjectIssue(String projectIssue) {
        this.projectIssue = projectIssue;
    }

    public String getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        this.taskNumber = taskNumber;
    }

    public String getTypeOfProcces() {
        return typeOfProcces;
    }

    public void setTypeOfProcces(String typeOfProcces) {
        this.typeOfProcces = typeOfProcces;
    }

}
