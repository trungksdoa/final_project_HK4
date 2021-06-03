/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.model;

import com.Backend.demo.model.trung.Khachhang;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author trung
 */
public class ConvertToArraylist_Khachhang {

    @XmlElement(name = "khachhangs")
    private ArrayList<Khachhang> khachhangs;

    public ArrayList<Khachhang> LayDulieuPhieu() {
        return khachhangs;
    }

    public void datnhieukhach(ArrayList<Khachhang> khachhangs) {
        this.khachhangs = khachhangs;
    }
}
