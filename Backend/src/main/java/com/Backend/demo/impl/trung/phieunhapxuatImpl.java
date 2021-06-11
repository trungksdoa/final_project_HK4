package com.Backend.demo.impl.trung;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Backend.demo.model.trung.Phieunhapxuat;
import com.Backend.demo.repository.trung.thuvienPhieu;
import com.Backend.demo.service.trung.DichvuPhieunhapxuat;

@Service
public class phieunhapxuatImpl implements DichvuPhieunhapxuat {

    @Autowired
    private thuvienPhieu phieu;

    @Override
    public Phieunhapxuat taoPhieuNhapXuat(Phieunhapxuat phieunhapxuat) {
        return phieu.save(phieunhapxuat);
    }

    @Override
    public void CapnhatPhieuNhapxuat(Phieunhapxuat phieunhapxuat) {
        phieu.save(phieunhapxuat);
    }

    @Override
    public Optional<Phieunhapxuat> lay1phieunhapxuat(String id) {
        Optional<Phieunhapxuat> optional = phieu.findById(id);
//        Phieunhapxuat phieunhapxuat = optional.get();
        return optional;
    }

    @Override
    public List<Phieunhapxuat> laynhieuphieunhapxuat() {
        return (List<Phieunhapxuat>) phieu.findAll();
    }

    @Override
    public void xoaphieu(String id) {
         phieu.deleteById(id);
    }

    @Override
    public boolean kiemtratontai(String id) {
        return phieu.existsById(id);
    }

}
