///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.warehouse.project.imp.warehouse.Other;
//
//import com.warehouse.project.model.Voucher;
//import com.warehouse.project.responsitory.warehouse.VoucherResponisotry;
//import com.warehouse.project.service.warehouse.Other.ICoupon;
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author trung
// */
//@Service
//public class VoucherImpl implements ICoupon {
//
//    @Autowired
//    VoucherResponisotry lab;
//
//    @Override
//    public List<Voucher> findALl(String keyword) {
//        return lab.findByList(keyword);
//    }
//
//    @Override
//    public List<Voucher> findByvoucher(String from, String to) {
//        return lab.findByVoucher(from, to);
//    }
//
//    @Override
//    public List<Voucher> findALlList() {
//        return lab.findAll();
//    }
//
//    @Override
//    public List<Object[]> findOne(String voucher) {
//        List<Object[]> option = lab.findOne(voucher);
//        return option;
//    }
//}
