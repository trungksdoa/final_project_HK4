/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import java.util.List;
import com.warehouse.project.model.*;

/**
 *
 * @author lenovo
 */
public interface IQuotesServiec {

    List<Quotes> getListQuotes();
    List<Quotes> getByDate(String fromdate,String tomdate);
    List<Quotes> getByDate(String fromdate);
    List<Quotes> getLikeId(String id);

    void save(Quotes quotes);

    void delete(Quotes quotes);
    Quotes findOne(String id);
   
   
}
