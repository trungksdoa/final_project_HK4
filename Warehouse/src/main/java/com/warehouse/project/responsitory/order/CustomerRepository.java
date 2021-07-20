/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;

import com.warehouse.project.model.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author lenovo
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {
       @Query("SELECT c FROM Customer c WHERE c.name LIKE :name")
      public List<Customer> findByCustorName(@PathVariable("name") String name);
}
