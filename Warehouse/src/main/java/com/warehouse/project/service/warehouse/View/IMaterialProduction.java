/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.View;

import com.warehouse.project.model.Vwprodcutionmaterial;
import java.util.List;

/**
 *
 * @author trung
 */
public interface IMaterialProduction {
    public abstract List<Vwprodcutionmaterial>findAll(int id);
}
