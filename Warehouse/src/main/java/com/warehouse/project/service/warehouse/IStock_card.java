/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.StockCard;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IStock_card {
    public abstract  List<StockCard> findAll();
}
