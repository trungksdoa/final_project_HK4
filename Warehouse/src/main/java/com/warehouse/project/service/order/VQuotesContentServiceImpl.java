/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;


import com.warehouse.project.model.VQuotesContent;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.warehouse.project.responsitory.order.vQuotesContentRepository;

/**
 *
 * @author lenovo
 */
@Service
public class VQuotesContentServiceImpl implements IVQuotesContentService{
    @Autowired
    vQuotesContentRepository repository;
    @Override
    public List<VQuotesContent> findByQuotesId(String id) {
         return  repository.findByQuotesId(id);
    }

    @Override
    public List<VQuotesContent> getAllVQuotesContent() {
      return repository.findAll();
    }
    
}
