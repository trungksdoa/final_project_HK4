/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.IO;

import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.Output;
import com.warehouse.project.model.OutputContent;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IOutputConent {

    public abstract OutputContent Save(OutputContent outputContent);

    public abstract OutputContent findOneData(int id);

    public List<OutputContent> findAll();

    public void Deletes(OutputContent inputContent);

    public OutputContent findTwo(String id);

    public OutputContent findWhereId(String id,String ware, Output input);

    public List<Object[]> findWhereByCodeId(String id);
}
