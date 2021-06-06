/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.impl.trung;

import com.Backend.demo.model.trung.Nhacungcap;
import com.Backend.demo.model.trung.Phieunhapxuat;
import com.Backend.demo.repository.trung.thuvienncc;
import com.Backend.demo.service.trung.Dichvunhacungcap;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class NCCImpl implements Dichvunhacungcap{

    @Autowired
    private thuvienncc service;

    @Override
    public Nhacungcap taonhacungcap(Nhacungcap nhacungcap) {
      return service.save(nhacungcap);
    }

    @Override
    public void Capnhatnhacungcap(Nhacungcap nhacungcap) {
        service.save(nhacungcap);
    }

    @Override
    public Nhacungcap lay1nhacungcap(String id) {
        Optional<Nhacungcap> ncc = service.findById(id);
        Nhacungcap nhacungcap = ncc.get();
        return nhacungcap;
    }

    @Override
    public List<Nhacungcap> laynhieunhacungcap() {
        return service.findAll();
    }

    @Override
    public void xoanhacungcap(String id) {
      service.deleteById(id);
    }

    @Override
    public boolean kiemtratontai(String id) {
      return service.existsById(id);
    }

//    @Override
//    public List<Nhacungcap> timnhacungcaptheoma(String name) {
//        return service.findAllByName(name);
//    }

    @Override
    public List<Nhacungcap> timnhacungcaptheoma(String name) {
        return service.findallbyname(name);
    }


    
}
