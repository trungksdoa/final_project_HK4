/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.warehouse;

import com.warehouse.project.model.OutputContent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author trung
 */
public interface WarehouseOutput_content extends JpaRepository<OutputContent, Integer> {
}
