/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Hisio;
import com.warehouse.project.responsitory.warehouse.HistoryRes;
import com.warehouse.project.service.warehouse.Ihistory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class HistoryImpl implements Ihistory{
    @Autowired
    HistoryRes lab;

    @Override
    public Hisio save(Hisio hisio) {
       return lab.save(hisio);
    }

    @Override
    public List<Hisio> listAll(String id,String warehouse) {
      return lab.findALl(id,warehouse);
    }

    @Override
    public List<Object[]> groupBy() {
      return lab.listBy();
    }

    @Override
    public void Update(String keyword, int Codeid) {
       lab.Update(keyword, Codeid);
    }

    @Override
    public List<Hisio> findAll() {
      return lab.findAll();
    }



    
}
