/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.Output;
import com.warehouse.project.model.OutputContent;
import com.warehouse.project.service.warehouse.IO.IOutputConent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.WarehouseOutput_content;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author trung
 */
@Service
public class IOutputContentImpl implements IOutputConent {

    @Autowired
    WarehouseOutput_content lab;

    @Override
    public OutputContent Save(OutputContent content) {
        return lab.save(content);
    }

    @Override
    public OutputContent findOneData(int id) {
        Optional<OutputContent> option = lab.findById(id);
        OutputContent object = option.get();
        return object;
    }

    @Override
    public List<OutputContent> findAll() {
        return lab.findAll();
    }

    @Override
    public void Deletes(OutputContent inputContent) {
        lab.delete(inputContent);
    }

    @Override
    public OutputContent findTwo(String id) {
        return lab.findByTwo(id);
    }

    @Override
    public OutputContent findWhereId(String id, String ware, Output input) {
       return lab.findWhereId(id, ware, input);
    }

    @Override
    public List<Object[]> findWhereByCodeId(String id) {
       return lab.findALlWhereinput(id);
    }

}
