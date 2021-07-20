/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.Account;
import com.warehouse.project.responsitory.order.AccountRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class AccountServiceImpl implements IAccountService{
    @Autowired
    AccountRepository repository;

    @Override
    public List<Account> getAllAccount() {
        return repository.findAll();
    }
}
