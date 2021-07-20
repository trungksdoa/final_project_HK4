/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.order.CustomerRepository;
import java.util.List;
/**
 *
 * @author lenovo
 */
@Service
public class CustomerServiceImpl implements ICustomerService{
@Autowired
CustomerRepository repository;
    @Override
    public Customer findOne(String id) {
       return repository.getById(id);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return repository.findAll();
    }

    @Override
    public List<Customer> getByName(String name) {
       return repository.findByCustorName(name);
    }
    
}
