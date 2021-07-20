/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.responsitory.order.GoodcategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class GoodcategoryServiceImpl implements IGoodsCategoryService{
    @Autowired
    GoodcategoryRepository repository;

    @Override
    public List<GoodsCatagory> getAllGoodcategory() {
        return repository.findAll();
    }
    
}
