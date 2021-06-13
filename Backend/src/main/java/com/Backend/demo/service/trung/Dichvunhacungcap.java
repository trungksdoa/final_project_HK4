/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.service.trung;

import com.Backend.demo.model.trung.Nhacungcap;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */


public interface Dichvunhacungcap {
    
    public abstract Nhacungcap taonhacungcap(Nhacungcap nhacungcap);

    public abstract void Capnhatnhacungcap(Nhacungcap nhacungcap);

    public abstract Nhacungcap lay1nhacungcap(String id);
    
    public abstract List<Nhacungcap> timnhacungcaptheoma(String name);
    
    public abstract List<Nhacungcap> laynhieunhacungcap();

    public abstract void xoanhacungcap(String id);
   

    public abstract boolean kiemtratontai(String id);
    
}
