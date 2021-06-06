/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.model;

import com.Backend.demo.model.trung.Nhacungcap;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author trung
 */
public class ConvertToArraylist_Nhacungcaps {

    @XmlElement(name = "nhacungcap")
    private ArrayList<Nhacungcap> nhacungcaps;

    public ArrayList<Nhacungcap> LayDulieu() {
        return nhacungcaps;
    }

    public void nhacungcaparray(ArrayList<Nhacungcap> nhacungcaps) {
        this.nhacungcaps = nhacungcaps;
    }
}
