/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Backend.demo.Controller;

import com.Backend.demo.model.trung.Phieunhapxuat;
import com.Backend.demo.service.trung.DichvuPhieunhapxuat;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author trung
 */
@RestController
@RequestMapping("/trung")
public class TrungController {
    
    @Autowired
    private DichvuPhieunhapxuat lab;
    
    @GetMapping()
    public ResponseEntity<List<Phieunhapxuat>> list() {
          List<Phieunhapxuat> clist = lab.laynhieuphieunhapxuat();
        //isemty là rỗng
        if (clist.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(clist, HttpStatus.OK);
        }
    }
    
    @GetMapping("/{id}")
    public Object get(@PathVariable String id) {
         Optional<Phieunhapxuat> optional = lab.lay1phieunhapxuat(id);
       return optional.map(sticket -> new ResponseEntity<>(sticket, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Phieunhapxuat phieunhapxuat) {
          Optional<Phieunhapxuat> optional = lab.lay1phieunhapxuat(id);
        return optional.map(sticket -> {
            phieunhapxuat.setMa(sticket.getMa());
            return new ResponseEntity<>(lab.taoPhieuNhapXuat(phieunhapxuat), HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
    @PostMapping
    public ResponseEntity<Phieunhapxuat> post(@RequestBody Phieunhapxuat phieunhapxuat) {
         return new ResponseEntity<>(lab.taoPhieuNhapXuat(phieunhapxuat), HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
         Optional<Phieunhapxuat> optional = lab.lay1phieunhapxuat(id);
          return optional.map(sticket -> {
            lab.xoaphieu(id);
            return new ResponseEntity<>(sticket, HttpStatus.OK);
        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    
}
