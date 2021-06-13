/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.repository.trung;

import com.Backend.demo.model.trung.Nhacungcap;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author trung
 */
public interface thuvienncc extends JpaRepository<Nhacungcap, String> {

    @Query("SELECT n FROM Nhacungcap n WHERE n.ma LIKE %?1%")
    public List<Nhacungcap> findallbyname(String keyword);
//    @Query("SELECT n FROM Nhacungcap n WHERE n.ma LIKE %:ma%")
//    public List<Nhacungcap> findAllByName(@PathVariable("ma") String name);
}
