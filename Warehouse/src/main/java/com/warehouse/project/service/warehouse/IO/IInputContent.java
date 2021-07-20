/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.IO;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.beanclass.InputDTO;
import com.warehouse.project.model.beanclass.TranferContnetDTO;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IInputContent {

    public abstract InputContent Save(InputContent input);

    public List<InputContent> findAll();

    public void Deletes(InputContent inputContent);

    public InputContent findTwo(String id);

    public abstract InputContent findOneData(int id);

    public InputContent findWhereId(String id,String ware, Input input);
    
    public List<InputContent> findWhereInputId(Input input);

    public List<Object[]> findWhereByCodeId(String id);
}
