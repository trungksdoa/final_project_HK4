/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.Other;

import com.warehouse.project.model.Groupsgoods;
import com.warehouse.project.responsitory.warehouse.GroupgoodsRes;
import com.warehouse.project.service.warehouse.Other.Igroupgoodds;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class GroupgoodsImpl implements Igroupgoodds{

    @Autowired
    GroupgoodsRes lab;
    
    @Override
    public List<Groupsgoods> findALl() {
       return lab.findAll();
    }
    
}
