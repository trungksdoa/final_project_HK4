///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.warehouse.project.controller.order.web;
//
//
//import java.io.IOException;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.warehouse.project.model.*;
//import java.io.ByteArrayInputStream;
//import org.springframework.core.io.InputStreamResource;
//import org.springframework.http.HttpHeaders;
//import org.springframework.web.bind.annotation.RequestParam;
//import com.warehouse.project.service.order.IQuotesContentService;
//
///**
// *
// * @author lenovo
// */
//@RestController
//@RequestMapping("/export")
//public class QuotesContentExcelDownloadRestAPI {
//    @Autowired
//    IQuotesContentService quotesContentService;
//    @GetMapping(value =  "/download/quotesConten.xlsx")
//      public ResponseEntity excelQuotesContnetReport(@RequestParam(value = "id")String id) throws IOException {
//          
//        List <Quotescontent> list = quotesContentService.findByQuotesId(id);
//		
//		ByteArrayInputStream in = QuotesExcelExport.quotescontentToExcel(list);
//		// return IOUtils.toByteArray(in);
//		
//		HttpHeaders headers = new HttpHeaders();
//        headers.add("Content-Disposition", "attachment; filename=quotesConten.xlsx");
//		
//		 return ResponseEntity
//	                .ok()
//	                .headers(headers)
//	                .body(new InputStreamResource(in));
//    }
//}
