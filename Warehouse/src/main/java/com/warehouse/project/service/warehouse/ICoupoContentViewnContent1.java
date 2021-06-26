/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Catagoryvoucher;
import java.util.List;

/**
 *
 * @author trung
 */
public interface ICoupoContentViewnContent1 {
  
    public abstract List<Catagoryvoucher> findALl();
    
     public abstract List<Catagoryvoucher> findALlById(String voucherId);
}
