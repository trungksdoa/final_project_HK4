///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.warehouse.project.service.order;
//
//
//import com.warehouse.project.model.Quotescontent;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.OutputStream;
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.BorderStyle;
//import org.apache.poi.ss.usermodel.BuiltinFormats;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellStyle;
//
//
//import org.apache.poi.ss.usermodel.FillPatternType;
//import org.apache.poi.ss.usermodel.Font;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
///**
// *
// * @author lenovo
// */
//@Service
//public class WriteExcelExampleService {
//    
//   public static final int COLUMN_INDEX_ID          = 0;
//    public static final int COLUMN_INDEX_GOODID     = 1;
//    public static final int COLUMN_INDEX_GOODNAME      = 2;
//    public static final int COLUMN_INDEX_UNIT      = 3;
//    public static final int COLUMN_INDEX_QUANTITY   = 4;
//    public static final int COLUMN_INDEX_GOODPRICE      = 5;
//    public static final int COLUMN_INDEX_DISCOUNT      = 6;
//   public static final int COLUMN_INDEX_AFTERPRICE      = 7;
//    private static CellStyle cellStyleFormatNumber = null;
//    
//    public static void writeExcel(List<Quotescontent> quotescontents, String excelFilePath) throws IOException {
//          // Create Workbook
//      Workbook workbook = getWorkbook(excelFilePath);
//              Sheet sheet = workbook.createSheet("Quotescontents"); // Create sheet with sheet name
// 
//        int rowIndex = 0;
//        
//     writeHeader(sheet, rowIndex);
//          rowIndex++;
//        for (Quotescontent qt : quotescontents) {
//            // Create row
//            Row row = sheet.createRow(rowIndex);
//            // Write data on row
//            writeBook(qt, row);
//            rowIndex++;
//        }
//       // Auto resize column witdth
//        int numberOfColumn = sheet.getRow(0).getPhysicalNumberOfCells();
//        autosizeColumn(sheet, numberOfColumn);
// 
//        // Create file excel
//        createOutputFile(workbook, excelFilePath);
//        System.out.println("Done!!!");
//   
//    }
//        // Create workbook
//     private static Workbook getWorkbook(String excelFilePath) throws IOException {
//        Workbook workbook = null;
// 
//        if (excelFilePath.endsWith("xlsx")) {
//            workbook = new XSSFWorkbook();
//        } else if (excelFilePath.endsWith("xls")) {
//            workbook = new HSSFWorkbook();
//        } else {
//            throw new IllegalArgumentException("The specified file is not Excel file");
//            
//        }
// 
//        return workbook;
//    }
//    private static void writeHeader(Sheet sheet, int rowIndex) {
//        // create CellStyle
//        CellStyle cellStyle = createStyleForHeader(sheet);
//         
//        // Create row
//        Row row = (Row) sheet.createRow(rowIndex);
//         
//        // Create cells
//        Cell cell = row.createCell(COLUMN_INDEX_ID);
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("Id");
// 
//        cell = row.createCell(COLUMN_INDEX_GOODID);
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("GoodID");
// 
//        cell = row.createCell(COLUMN_INDEX_GOODNAME);
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("GoodName");
// 
//        cell = row.createCell(COLUMN_INDEX_UNIT);
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("Unit");
//        
//        cell = row.createCell(COLUMN_INDEX_QUANTITY);
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("Quantity");
// 
//        cell = row.createCell(COLUMN_INDEX_GOODPRICE);
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("GoodPrice");
//        
//        cell = row.createCell(COLUMN_INDEX_DISCOUNT );
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("Discount");
//        
//        cell = row.createCell(COLUMN_INDEX_AFTERPRICE );
//        cell.setCellStyle(cellStyle);
//        cell.setCellValue("AfterPrice");
//    }
//        // Write data
//    private static void writeBook(Quotescontent quotescontent, Row row) {
//        if (cellStyleFormatNumber == null) {
//            // Format number
//            short format = (short)BuiltinFormats.getBuiltinFormat("#,##0");
//            // DataFormat df = workbook.createDataFormat();
//            // short format = df.getFormat("#,##0");
//             
//            //Create CellStyle
//            Workbook workbook = row.getSheet().getWorkbook();
//            cellStyleFormatNumber = workbook.createCellStyle();
//            cellStyleFormatNumber.setDataFormat(format);
//        }
//         
//        Cell cell = row.createCell(COLUMN_INDEX_ID);
//        cell.setCellValue(quotescontent.getId());
// 
//        cell = row.createCell(COLUMN_INDEX_GOODID);
//        cell.setCellValue(quotescontent.getGoodsId());
// 
//        cell = row.createCell(COLUMN_INDEX_GOODNAME);
//        cell.setCellValue(quotescontent.getGoodsName());
// 
//        cell = row.createCell(COLUMN_INDEX_QUANTITY);
//        cell.setCellValue(quotescontent.getQuantity());
//        
//        cell = row.createCell(COLUMN_INDEX_UNIT);
//        cell.setCellValue(quotescontent.getUnit());
//        
//        cell = row.createCell(COLUMN_INDEX_GOODPRICE);
//        cell.setCellValue(quotescontent.getGoodsPrice());
//        
//        cell = row.createCell(COLUMN_INDEX_DISCOUNT);
//        cell.setCellValue(quotescontent.getDiscount());
//        
//        cell = row.createCell(COLUMN_INDEX_AFTERPRICE);
//        cell.setCellValue(quotescontent.getAfterpirce());
//         
//        // Create cell formula
//        // totalMoney = price * quantity
////        cell = row.createCell(COLUMN_INDEX_TOTAL, CellType.FORMULA);
////        cell.setCellStyle(cellStyleFormatNumber);
////        int currentRow = row.getRowNum() + 1;
////        String columnPrice = CellReference.convertNumToColString(COLUMN_INDEX_PRICE);
////        String columnQuantity = CellReference.convertNumToColString(COLUMN_INDEX_QUANTITY);
////        cell.setCellFormula(columnPrice + currentRow + "*" + columnQuantity + currentRow);
//    }
//        // Create CellStyle for header
//    private static CellStyle createStyleForHeader(Sheet sheet) {
//        // Create font
//        Font font = sheet.getWorkbook().createFont();
//        font.setFontName("Times New Roman"); 
//        font.setBold(true);
//        font.setFontHeightInPoints((short) 14); // font size
//        font.setColor(IndexedColors.WHITE.getIndex()); // text color
// 
//        // Create CellStyle
//        CellStyle cellStyle = sheet.getWorkbook().createCellStyle();
//        cellStyle.setFont(font);
//        cellStyle.setFillForegroundColor(IndexedColors.BLUE.getIndex());
//        cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//        cellStyle.setBorderBottom(BorderStyle.THIN);
//        return cellStyle;
//    }
//        // Write footer
////    private static void writeFooter(Sheet sheet, int rowIndex) {
////        // Create row
////        Row row = sheet.createRow(rowIndex);
////        Cell cell = row.createCell(COLUMN_INDEX_TOTAL, CellType.FORMULA);
////        cell.setCellFormula("SUM(E2:E6)");
////    }
////     
//    // Auto resize column width
//    private static void autosizeColumn(Sheet sheet, int lastColumn) {
//        for (int columnIndex = 0; columnIndex < lastColumn; columnIndex++) {
//            sheet.autoSizeColumn(columnIndex);
//        }
//    }
//     
//    // Create output file
//    private static void createOutputFile(Workbook workbook, String excelFilePath) throws IOException {
//        try (OutputStream os = new FileOutputStream(excelFilePath)) {
//            workbook.write(os);
//        }
//    }
//}
