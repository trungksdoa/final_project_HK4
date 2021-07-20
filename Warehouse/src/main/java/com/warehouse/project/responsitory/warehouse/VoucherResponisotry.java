package com.warehouse.project.responsitory.warehouse;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.warehouse.project.responsitory.warehouse;
//
//import com.warehouse.project.model.Voucher;
//import java.util.List;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
///**
// *
// * @author trung
// */
//public interface VoucherResponisotry extends JpaRepository<Voucher, String> {
//
//    @Query("Select u from Voucher u WHERE u.id = :id")
//    List<Voucher> findByList(@Param("id") String keyword);
//
//    @Query("Select u from Voucher u WHERE u.date BETWEEN :from AND :to")
//    List<Voucher> findByVoucher(@Param("from") String from, @Param("to") String to);
//
//    @Query(nativeQuery = true,value ="Select  * from voucher WHERE id = :code")
//    List<Object[]> findOne(@Param("code") String id);
//}
