/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.VQuotes;
import com.warehouse.project.responsitory.order.VQuotesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class VQuotesServiceImpl implements IVQuotesService{
@Autowired
VQuotesRepository repository;
    @Override
    public List<VQuotes> getByQuotesName(String name) {
        return repository.findByQuotesName(name);
    }

    @Override
    public List<VQuotes> getAllQuotes() {
       return repository.findAll();
    }
    
}
