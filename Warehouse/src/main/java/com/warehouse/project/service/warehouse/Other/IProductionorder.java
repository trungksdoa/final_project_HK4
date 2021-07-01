/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.Other;

import com.warehouse.project.model.Productionorder;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IProductionorder {
    public abstract List<Productionorder> findall();
}
