/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.warehouse;

import com.warehouse.project.model.Hisio;
import java.util.List;

/**
 *
 * @author trung
 */
public interface Ihistory {
    public Hisio save(Hisio hisio);
    public List<Hisio>listAll(String id,String warehouse);
}
