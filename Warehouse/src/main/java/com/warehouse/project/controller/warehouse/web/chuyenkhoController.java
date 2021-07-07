/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Checkstockslip;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.StockCard;
import com.warehouse.project.model.TranferConent;
import com.warehouse.project.model.TranferWarehouse;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.ITranferContent;
import com.warehouse.project.service.warehouse.ITranferWarehouse;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class chuyenkhoController {

    @Autowired
    IWarehouse lab;

    @Autowired
    ITranferWarehouse lab2;

    @Autowired
    ITranferContent lab3;

    @Autowired
    Ihistory lab5;

    @RequestMapping(value = "/ck", method = RequestMethod.GET)
    public String page2(Model model) {
        return "warehouse/chuyenkho";
    }

    public boolean isSpace(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] == null) || (array[i].trim().length() == 0)) {
                //true on null, empty string, or white space only. Do something here
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @RequestMapping(value = "/ck", method = RequestMethod.POST)
    public String SaveData(Model model, HttpServletRequest request) {
        String[] idcode = request.getParameterValues("ID");
        String[] Unit = request.getParameterValues("Unit");
        String[] From = request.getParameterValues("From");
        String[] To = request.getParameterValues("To");
        String[] Quantity = request.getParameterValues("Quantity");
        
        
//        String idsse= request.getParameter("id");
        String Date= request.getParameter("Date");
        String explain= request.getParameter("explain");
        if (isSpace(idcode) || isSpace(To)) {
            System.out.println("Fails");
            return "redirect:/web/warehouse/ck";
        } else {
            TranferWarehouse tranferWarehouse = new TranferWarehouse();
            TranferWarehouse idobject = lab2.ListOne();
            if (idobject != null) {
                String idgen = idobject.toString();
                idgen = idgen.substring(2);
                int idstt = Integer.valueOf(idgen);
                idstt = idstt + 1;
                String str = "" + idstt;
                String pad = "KK0000";
                String ans = pad.substring(0, pad.length() - str.length()) + str;
                tranferWarehouse.setId(ans);
            } else {
                //when data is null then add default value is Nk0000
                String idgen = "KK0000";
                idgen = idgen.substring(2);
                int idstt = Integer.valueOf(idgen);
                idstt = idstt + 1;
                String str = "" + idstt;
                String pad = "KK0000";
                String ans = pad.substring(0, pad.length() - str.length()) + str;
                tranferWarehouse.setId(ans);
            }
            tranferWarehouse.setDate(Date);
            tranferWarehouse.setExplain(Date);
            tranferWarehouse.setStatus("NotComplete");
            tranferWarehouse.setDeletestatus(Boolean.FALSE);
            TranferWarehouse add213 = lab2.save(tranferWarehouse);
            for (int i = 0; i < idcode.length; i++) {
                TranferConent content = new TranferConent();
                content.setGoodsName(idcode[i].trim());
                content.setFroms(From[i]);
                content.setTos(To[i]);
                content.setUnit(Unit[i]);
                content.setQuantity(Double.valueOf(Quantity[i]));
                content.setTraferId(add213);
                lab3.save(content);

                //Minus From warehouse
                Warehouse warehouse2 = lab.findOnes(idcode[i].trim(), From[i].trim());
                warehouse2.setGoodsId(idcode[i].trim());
                warehouse2.setGoodsName(warehouse2.getGoodsName());
                warehouse2.setUnit(warehouse2.getUnit());
                warehouse2.setQuantityInStock(warehouse2.getQuantityInStock() - Integer.valueOf(Quantity[i].trim()));
                warehouse2.setImportPrice(warehouse2.getImportPrice());
                warehouse2.setSupplier(warehouse2.getSupplier());
                warehouse2.setPriceInStock(warehouse2.getPriceInStock() - (Integer.valueOf(Quantity[i].trim()) * warehouse2.getImportPrice()));
                warehouse2.setGroupGoods(warehouse2.getGroupGoods());
                warehouse2.setWeight(warehouse2.getWeight());
                warehouse2.setStockCard(warehouse2.getStockCard());
                //Save Data By Code Id and Warehouse Query Search where Codeid and Warehouse
                Warehouse Froms = lab.Save(warehouse2);
                if (From != null) {
                    Hisio historyabc = new Hisio();
                    historyabc.setGoodsId(idcode[i].trim());

                    String datesd = String.valueOf(java.time.LocalDate.now());
                    historyabc.setDate(datesd);

                    historyabc.setGoodsName(Froms.getGoodsName());
                    historyabc.setQuantity(0 - Integer.valueOf(Quantity[i].trim()));
                    historyabc.setPrice(Froms.getImportPrice());
                    historyabc.setUnit(Froms.getUnit());
                    historyabc.setWarehouse(From[i].trim());
                    historyabc.setLicense(add213.getId());
                    historyabc.setMajor("Output");
                    lab5.save(historyabc);
                }

                //Plus to warehouse
                Warehouse warehouse3 = lab.findOnes(idcode[i].trim(), To[i].trim());
                if (warehouse3 != null) {
                    warehouse3.setGoodsId(idcode[i].trim());
                    warehouse3.setGoodsName(warehouse3.getGoodsName());
                    warehouse3.setUnit(warehouse3.getUnit());
                    warehouse3.setQuantityInStock(warehouse3.getQuantityInStock() + Integer.valueOf(Quantity[i].trim()));
                    warehouse3.setImportPrice(warehouse3.getImportPrice());
                    warehouse3.setSupplier(warehouse3.getSupplier());
                    warehouse3.setPriceInStock(warehouse3.getPriceInStock() + (Integer.valueOf(Quantity[i].trim()) * warehouse2.getImportPrice()));
                    warehouse3.setGroupGoods(warehouse3.getGroupGoods());
                    warehouse3.setWeight(warehouse3.getWeight());
                    warehouse3.setStockCard(warehouse3.getStockCard());
                    //Save Data By Code Id and Warehouse Query Search where Codeid and Warehouse
                    Warehouse Tos = lab.Save(warehouse3);
                    if (Tos != null) {
                        Hisio historyabc = new Hisio();
                        historyabc.setGoodsId(idcode[i].trim());
                        String datesd = String.valueOf(java.time.LocalDate.now());
                        historyabc.setDate(datesd);
                        historyabc.setGoodsName(Froms.getGoodsName());
                        historyabc.setQuantity(Integer.valueOf(Quantity[i].trim()));
                        historyabc.setPrice(Froms.getImportPrice());
                        historyabc.setUnit(Froms.getUnit());
                        historyabc.setWarehouse(From[i].trim());
                        historyabc.setLicense(add213.getId());
                        historyabc.setMajor("Input");
                        lab5.save(historyabc);
                    }
                } else {
                    Warehouse warehouse4 = new Warehouse();
                    warehouse4.setGoodsId(Froms.getGoodsId());
                    warehouse4.setGoodsName(Froms.getGoodsName());
                    warehouse4.setUnit(Froms.getUnit());
                    warehouse4.setQuantityInStock(Integer.valueOf(Quantity[i].trim()));
                    warehouse4.setImportPrice(Froms.getImportPrice());
                    warehouse4.setSupplier(Froms.getSupplier());
                    warehouse4.setPriceInStock(Integer.valueOf(Quantity[i].trim()) * Froms.getImportPrice());
                    warehouse4.setGroupGoods(Froms.getGroupGoods());
                    warehouse4.setWeight(Froms.getWeight());
                    StockCard stockcard = new StockCard();
                    stockcard.setId(To[i].trim());
                    warehouse4.setStockCard(stockcard);
                    //Save Data By Code Id and Warehouse Query Search where Codeid and Warehouse
                    Warehouse Toss = lab.Save(warehouse4);

                    if (Toss != null) {
                        Hisio historxyz = new Hisio();
                        historxyz.setGoodsId(idcode[i].trim());
                        String datesd = String.valueOf(java.time.LocalDate.now());
                        historxyz.setDate(datesd);
                        historxyz.setGoodsName(Froms.getGoodsName());
                        historxyz.setQuantity(Integer.valueOf(Quantity[i].trim()));
                        historxyz.setPrice(Froms.getImportPrice());
                        historxyz.setUnit(Froms.getUnit());
                        historxyz.setWarehouse(To[i].trim());
                        historxyz.setLicense(add213.getId());
                        historxyz.setMajor("Input");
                        lab5.save(historxyz);
                    }
                }

            }
            return "redirect:/web/warehouse/ck";
        }

    }
}
