/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse.View;

import com.warehouse.project.model.Production;
import com.warehouse.project.model.Vwwarehouse;
import java.util.List;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author trung
 */
public interface VwWarehouse {
  public abstract List<Vwwarehouse> findALl();
}
