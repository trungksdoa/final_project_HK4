/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Checkstockslip;
import java.util.List;

/**
 *
 * @author trung
 */
public interface CheckSockSlipI {

    public abstract Checkstockslip Save(Checkstockslip checkSockSlip);

    public abstract Checkstockslip Update(Checkstockslip checkSockSlip);

    public abstract void Delete(String checkSockSlip);
    
    public abstract Checkstockslip FindOne(String id);

    public abstract List<Checkstockslip> findAll ();
    
     public abstract Checkstockslip getLastId ();
}
