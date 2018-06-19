/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.issue;

import com.olta.crm.DTO.tableDto.IssueFromTheUser;
import java.util.ArrayList;

/**
 *
 * @author Olti
 */
public interface ViewIssueAdmin {

    public ArrayList<IssueFromTheUser> listOfIssues();
    
}
