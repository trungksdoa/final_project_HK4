/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.impl.trung;

import com.Backend.demo.model.trung.Khachhang;
import com.Backend.demo.repository.trung.thuvienkhachang;
import com.Backend.demo.service.trung.Dichvukhachhang;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class KhachhangsImpl implements Dichvukhachhang{
    @Autowired
    private thuvienkhachang lab;

    @Override
    public List<Khachhang> laynhieukhachKhachhangs() {
        return (List<Khachhang>) lab.findAll();
    }
}
