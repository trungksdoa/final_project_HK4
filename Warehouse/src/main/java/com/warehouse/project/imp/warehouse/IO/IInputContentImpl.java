/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.beanclass.InputDTO;
import com.warehouse.project.model.beanclass.TranferContnetDTO;
import com.warehouse.project.service.warehouse.IO.IInputContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.warehouse.WarehouseInput_content;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author trung
 */
@Service
public class IInputContentImpl implements IInputContent {

    @Autowired
    WarehouseInput_content lab;

    @Override
    public InputContent Save(InputContent input) {
        return lab.save(input);
    }

    @Override
    public List<InputContent> findAll() {
        return lab.findAll();
    }

    @Override
    public InputContent findWhereId(String id, String ware, Input input) {
        return lab.findWhereId(id, ware, input);
    }

    @Override
    public List<Object[]> findWhereByCodeId(String id) {
        return lab.findALlWhereinput(id);
    }

    @Override
    public InputContent findOneData(int id) {
        Optional<InputContent> option = lab.findById(id);
        InputContent object = option.get();
        return object;
    }

    @Override
    public void Deletes(InputContent inputContent) {
        lab.delete(inputContent);
    }

    @Override
    public InputContent findTwo(String id) {
        return lab.findByTwo(id);
    }

    @Override
    public List<InputContent> findWhereInputId(Input input) {
       return lab.findWhereinputId(input);
    }
}
