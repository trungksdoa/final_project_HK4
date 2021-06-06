/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.impl.trung;

import com.Backend.demo.model.trung.Phieunhapxuat;
import com.Backend.demo.repository.trung.thuvienPhieu;
import com.Backend.demo.service.trung.StickerNoParamInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author trung
 */
@Service
public class PhieuImplNoParam implements StickerNoParamInterface {

    @Autowired
    thuvienPhieu lab;

    private String id;
    private Phieunhapxuat phieu;

    public PhieuImplNoParam() {
    }

    
    
    public PhieuImplNoParam(String id, Phieunhapxuat phieu) {
        this.id = id;
        this.phieu = phieu;
    }

    @Override
    public Phieunhapxuat taoPhieuNhapXuat() {
        return lab.save(phieu);
    }

    @Override
    public void CapnhatPhieuNhapxuat() {
        lab.save(phieu);
    }

    @Override
    public Phieunhapxuat lay1phieunhapxuat() {
        Optional<Phieunhapxuat> option = lab.findById(id);
        Phieunhapxuat convertToModal = option.get();

        return convertToModal;
    }

    @Override
    public List<Phieunhapxuat> laynhieuphieunhapxuat() {
        return lab.findAll();
    }

    @Override
    public void xoaphieu() {
        lab.deleteById(id);
    }

    @Override
    public boolean kiemtratontai() {
        return lab.existsById(id);
    }

}
