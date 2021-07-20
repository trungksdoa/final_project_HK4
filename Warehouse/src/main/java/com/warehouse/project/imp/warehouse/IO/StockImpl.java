/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.StockCard;
import com.warehouse.project.responsitory.warehouse.Stockresponsitory;
import com.warehouse.project.service.warehouse.IStock_card;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class StockImpl implements IStock_card{

    @Autowired
    Stockresponsitory lab;
    @Override
    public List<StockCard> findAll() {
       return lab.findAll();
    }
    
}
