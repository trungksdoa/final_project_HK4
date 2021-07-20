/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Checkslip;
import java.util.List;

/**
 *
 * @author trung
 */
public interface ICheckstock {

    public abstract Checkslip Save(Checkslip checkslip);

    public abstract List<Checkslip> findALl();

    public abstract Checkslip findOne(int id);

//    public abstract Checkslip findOnese(String id,String goodsid);
    
    public abstract Checkslip update(Checkslip checkslip);
    public abstract List<Checkslip> ListByCheckid(String id);
}
