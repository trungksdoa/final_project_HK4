/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.debpt.api;

import com.warehouse.project.controller.debpt.web.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author trung
 */
@Controller
public class deptbController {
    
    @RequestMapping("/url")
    public String page(Model model) {
        model.addAttribute("attribute", "value");
        return "view.name";
    }
//    
//      @Autowired
//    private DichvuPhieunhapxuat lab;
//    
//    @GetMapping()
//    public ResponseEntity<List<Phieunhapxuat>> list() {
//          List<Phieunhapxuat> clist = lab.laynhieuphieunhapxuat();
//        //isemty là rỗng
//        if (clist.isEmpty()) {
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        } else {
//            return new ResponseEntity<>(clist, HttpStatus.OK);
//        }
//    }
//    
//    @GetMapping("/{id}")
//    public Object get(@PathVariable String id) {
//         Optional<Phieunhapxuat> optional = lab.lay1phieunhapxuat(id);
//       return optional.map(sticket -> new ResponseEntity<>(sticket, HttpStatus.OK))
//                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//    
//    @PutMapping("/{id}")
//    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Phieunhapxuat phieunhapxuat) {
//          Optional<Phieunhapxuat> optional = lab.lay1phieunhapxuat(id);
//        return optional.map(sticket -> {
//            phieunhapxuat.setMa(sticket.getMa());
//            return new ResponseEntity<>(lab.taoPhieuNhapXuat(phieunhapxuat), HttpStatus.OK);
//        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//    
//    @PostMapping
//    public ResponseEntity<Phieunhapxuat> post(@RequestBody Phieunhapxuat phieunhapxuat) {
//         return new ResponseEntity<>(lab.taoPhieuNhapXuat(phieunhapxuat), HttpStatus.OK);
//    }
//    
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> delete(@PathVariable String id) {
//         Optional<Phieunhapxuat> optional = lab.lay1phieunhapxuat(id);
//          return optional.map(sticket -> {
//            lab.xoaphieu(id);
//            return new ResponseEntity<>(sticket, HttpStatus.OK);
//        }).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//    
    
}
