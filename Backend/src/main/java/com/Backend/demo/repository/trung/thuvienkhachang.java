/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.repository.trung;

import com.Backend.demo.model.trung.Khachhang;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author trung
 */
public interface thuvienkhachang extends CrudRepository<Khachhang, String> {
    
}
