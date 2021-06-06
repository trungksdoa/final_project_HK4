/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.service.trung;

import com.Backend.demo.model.trung.Phieunhapxuat;
import java.util.List;

/**
 *
 * @author trung
 */
public interface StickerNoParamInterface {
    public abstract Phieunhapxuat taoPhieuNhapXuat();

    public abstract void CapnhatPhieuNhapxuat();

    public abstract Phieunhapxuat lay1phieunhapxuat();

    public abstract List<Phieunhapxuat> laynhieuphieunhapxuat();

    public abstract void xoaphieu();
   

    public abstract boolean kiemtratontai();
}
