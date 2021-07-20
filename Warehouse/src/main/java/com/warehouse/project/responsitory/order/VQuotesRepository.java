/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;

import org.springframework.data.jpa.repository.JpaRepository;
import com.warehouse.project.model.*;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author lenovo
 */
public interface VQuotesRepository extends JpaRepository<VQuotes, String> {
      @Query( "SELECT v FROM VQuotes v WHERE v.name LIKE :name")
      public List<VQuotes> findByQuotesName(@PathVariable("name") String name);
}
