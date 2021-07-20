/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.responsitory.order;

import com.warehouse.project.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lenovo
 */
public interface AccountRepository extends JpaRepository<Account, Integer> {
    
}
