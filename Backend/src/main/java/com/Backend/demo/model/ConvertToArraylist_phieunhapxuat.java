/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.model;

import com.Backend.demo.model.trung.Phieunhapxuat;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author trung
 */
public final class ConvertToArraylist_phieunhapxuat {

    @XmlElement(name = "phieunhapxuat")
    private ArrayList<Phieunhapxuat> phieunhapxuats;

    public ArrayList<Phieunhapxuat> LayDulieuPhieu() {
        return phieunhapxuats;
    }

    public void datphieunhapxuat(ArrayList<Phieunhapxuat> phieunhapxuats) {
        this.phieunhapxuats = phieunhapxuats;
    }

}
