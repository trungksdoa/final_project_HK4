/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.imp.warehouse.IO;

import com.warehouse.project.model.Checkstockslip;
import com.warehouse.project.responsitory.warehouse.CheckSockSlipRes;
import com.warehouse.project.service.warehouse.CheckSockSlipI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class CheckSockSlipImpl implements CheckSockSlipI {

    @Autowired
    CheckSockSlipRes lab;

    @Override
    public Checkstockslip Save(Checkstockslip checkSockSlip) {
        return lab.save(checkSockSlip);
    }

    @Override
    public Checkstockslip Update(Checkstockslip checkSockSlip) {
        return lab.save(checkSockSlip);
    }

    @Override
    public void Delete(String checkSockSlip) {
        lab.deleteById(checkSockSlip);
    }

    @Override
    public Checkstockslip FindOne(String checkSockSlip) {
        return lab.findOne(checkSockSlip);
    }

    @Override
    public List<Checkstockslip> findAll() {
        return lab.findAll();
    }

    @Override
    public Checkstockslip getLastId() {
        return lab.findByList();
    }
}
