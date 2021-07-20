/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.Quotescontent;
import com.warehouse.project.responsitory.order.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


/**
 *
 * @author lenovo
 */
@Service
public class QuotesContentServiceImpl implements IQuotesContentService{
    
   
    @Autowired
    QuotesContentRepository repository;
    	
    @Override
    public void save(Quotescontent quotescontent) {
        repository.save(quotescontent);
    }

    @Override
    public List<Quotescontent> findByQuotesId(String id) {
      return  repository.findByQuotesId(id);
    }

    @Override
    public List<Quotescontent> getAllQuotesContent() {
      return repository.findAll();
    }

    @Override
    public void DeleteQuotesContent(Quotescontent quotescontent) {
      repository.delete(quotescontent);
    }

 
    



}
