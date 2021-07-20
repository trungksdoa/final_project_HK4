/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.Quotes;
import com.warehouse.project.responsitory.order.QuotesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class QuotesServiceImpl implements IQuotesServiec{
    @Autowired
    QuotesRepository repository;

    
    @Override
    public List<Quotes> getListQuotes() {
     return repository.findAll();
    }

    @Override
    public void save(Quotes quotes) {
    repository.save(quotes);
    }

    @Override
    public void delete(Quotes quotes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public Quotes findOne(String id) {
        return  repository.getById(id);
    }

    @Override
    public List<Quotes> getByDate(String fromdate, String tomdate) {
       return repository.getByDate(fromdate, tomdate);
    }

    @Override
    public List<Quotes> getByDate(String fromdate) {
       return repository.getByDate(fromdate);
    }

    @Override
    public List<Quotes> getLikeId(String id) {
        return repository.getLikeId(id);
    }


    
}
