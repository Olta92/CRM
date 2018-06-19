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
public class IssueFromTheUser {
    
    private String user;
    private String topicIssue;
    private String projectName;
    private String workingProcces;
    private String projectContect;
    private String description;

    public IssueFromTheUser() {
    }
    
    public IssueFromTheUser(String user, String topicIssue, String projectName, String workingProcces, String projectContect, String description) {
        this.user = user;
        this.topicIssue = topicIssue;
        this.projectName = projectName;
        this.workingProcces = workingProcces;
        this.projectContect = projectContect;
        this.description = description;
    }
    
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTopicIssue() {
        return topicIssue;
    }

    public void setTopicIssue(String topicIssue) {
        this.topicIssue = topicIssue;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getWorkingProcces() {
        return workingProcces;
    }

    public void setWorkingProcces(String workingProcces) {
        this.workingProcces = workingProcces;
    }

    public String getProjectContect() {
        return projectContect;
    }

    public void setProjectContect(String projectContect) {
        this.projectContect = projectContect;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
