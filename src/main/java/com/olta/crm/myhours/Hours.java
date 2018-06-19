/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.myhours;

import com.olta.crm.DTO.tableDto.HouerUserDto;
import java.util.ArrayList;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.XYDataset;

/**
 *
 * @author Olta
 */
public interface Hours {

    public boolean insertHoursOfUser(String username, String projectName, String projectissue, int taskNumber, int numberOfHouers, String workingProcces);

    public DefaultCategoryDataset data(String userData);
    
    public ArrayList<HouerUserDto> getAllHouerOfUsers();

}
