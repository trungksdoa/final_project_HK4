/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.service.order;

import com.warehouse.project.model.*;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author lenovo
 */
public interface IQuotesContentService {
    
    void save(Quotescontent quotescontent);
    List<Quotescontent> findByQuotesId(String id);
    List<Quotescontent> getAllQuotesContent();
    void DeleteQuotesContent(Quotescontent quotescontent);

}
