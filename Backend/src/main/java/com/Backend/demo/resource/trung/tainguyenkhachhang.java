/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.resource.trung;

import com.Backend.demo.model.ConvertToArraylist_Khachhang;
import com.Backend.demo.model.trung.Khachhang;
import com.Backend.demo.model.trung.Phieunhapxuat;
import com.Backend.demo.service.trung.Dichvukhachhang;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author trung
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "khachhangs")
@Path("/khachhangs")
public class tainguyenkhachhang {

    @Autowired
    private Dichvukhachhang lab;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ConvertToArraylist_Khachhang getAll() {
        ConvertToArraylist_Khachhang convert = new ConvertToArraylist_Khachhang();
        ArrayList<Khachhang> arrayList = (ArrayList<Khachhang>) lab.laynhieukhachKhachhangs();
        convert.datnhieukhach(arrayList);
        return convert;
    }
}
