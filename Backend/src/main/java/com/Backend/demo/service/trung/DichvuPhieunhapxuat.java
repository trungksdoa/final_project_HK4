package com.Backend.demo.service.trung;

import java.util.List;

import com.Backend.demo.model.trung.Phieunhapxuat;
import java.util.Optional;

public interface DichvuPhieunhapxuat {
        
    public abstract Phieunhapxuat taoPhieuNhapXuat(Phieunhapxuat phieunhapxuat);

    public abstract void CapnhatPhieuNhapxuat(Phieunhapxuat phieunhapxuat);

    public abstract Optional<Phieunhapxuat> lay1phieunhapxuat(String id);

    public abstract List<Phieunhapxuat> laynhieuphieunhapxuat();

    public abstract void xoaphieu(String id);
   

    public abstract boolean kiemtratontai(String id);
    
}
