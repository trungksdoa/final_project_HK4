/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Beginninggoods;
import com.warehouse.project.model.Warehouse;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IWarehouse2 {

    public abstract Beginninggoods Save(Beginninggoods input);

    public abstract List<Beginninggoods> FindALl();
    
    public abstract Beginninggoods findOne(String goodsId,String warehouse);
}
