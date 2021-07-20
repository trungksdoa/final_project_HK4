///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.warehouse.project.service.order;
//
//
//import com.warehouse.project.model.Quotescontent;
//import com.warehouse.project.responsitory.order.QuotesContentRepository;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
///**
// *
// * @author lenovo
// */
//@Service
//public class ExcelDataServiceImpl implements IExcelDataService {
//    @Value("${app.upload.file:${user.home}}")
//	public String EXCEL_FILE_PATH;
//
//	@Autowired
//	QuotesContentRepository repo;
//
//	Workbook workbook;
//
//	public List<Quotescontent> getExcelDataAsList() {
//
//		List<String> list = new ArrayList<String>();
//
//		// Create a DataFormatter to format and get each cell's value as String
//		DataFormatter dataFormatter = new DataFormatter();
//
//		// Create the Workbook
//		try {
//			workbook = WorkbookFactory.create(new File(EXCEL_FILE_PATH));
//		} catch (EncryptedDocumentException | IOException e) {
//			e.printStackTrace();
//		}
//
//		// Retrieving the number of sheets in the Workbook
//		System.out.println("-------Workbook has '" + workbook.getNumberOfSheets() + "' Sheets-----");
//
//		// Getting the Sheet at index zero
//		Sheet sheet = workbook.getSheetAt(0);
//
//		// Getting number of columns in the Sheet
//		int noOfColumns = sheet.getRow(0).getLastCellNum();
//		System.out.println("-------Sheet has '"+noOfColumns+"' columns------");
//
//		// Using for-each loop to iterate over the rows and columns
//		for (org.apache.poi.ss.usermodel.Row row : sheet) {
//			for (Cell cell : row) {
//				String cellValue = dataFormatter.formatCellValue(cell);
//				list.add(cellValue);
//			}
//		}
//
//		// filling excel data and creating list as List<Invoice>
//		List<Quotescontent> invList = createList(list, noOfColumns);
//
//		// Closing the workbook
//		try {
//			workbook.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return invList;
//	}
//
//	private List<Quotescontent> createList(List<String> excelData, int noOfColumns) {
//
//		ArrayList<Quotescontent> invList = new ArrayList<Quotescontent>();
//
//		int i = noOfColumns;
//		do {
//			Quotescontent inv = new Quotescontent();
//
//			inv.setId(Integer.valueOf(excelData.get(i)));
//			inv.setGoodsId(excelData.get(i + 1));
//			inv.setGoodsName(excelData.get(i + 2));
//			inv.setUnit(excelData.get(i + 3));
//
//			invList.add(inv);
//			i = i + (noOfColumns);
//
//		} while (i < excelData.size());
//		return invList;
//	}
//
//	@Override
//	public int saveExcelData(List<Quotescontent> quotescontents) {
//		quotescontents = repo.saveAll(quotescontents);
//		return quotescontents.size();
//	}
//}
