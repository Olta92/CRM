/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.olta.crm.work;

import com.olta.crm.DTO.tableDto.TabelOfWorkUserDto;
import java.util.ArrayList;

/**
 *
 * @author Olta
 */
public interface Work {
    
    public ArrayList<TabelOfWorkUserDto> listOfHouer(String user);
    
    public void updateCompltedWork(int taskNumber);
}
