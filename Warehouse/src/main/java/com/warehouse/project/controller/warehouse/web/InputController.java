/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.CatagoryGroupSupplier;
import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.StockCard;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.IO.IInput;
import com.warehouse.project.service.warehouse.IO.IInputContent;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import com.warehouse.project.service.warehouse.Other.Idynamic;
import com.warehouse.project.service.warehouse.Other.Igoodscatagory;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class InputController {

    @Autowired
    IInput lab;

    @Autowired
    IInputContent lab2;

    @Autowired
    Idynamic lab3;

    @Autowired
    IWarehouse lab4;

    @Autowired
    Ihistory lab5;

    @Autowired
    Igoodscatagory lab242;

    @RequestMapping("/input")
    public String index(Model model) {

        ArrayList<String> goodsName = new ArrayList<>();
        ArrayList<String> ncc = new ArrayList<>();
        ArrayList<String> Warehouse = new ArrayList<>();
        lab242.findALl().forEach(string1 -> {
            goodsName.add(string1.getGoodsName());
        });
        model.addAttribute("message", "");
        model.addAttribute("Namelist", goodsName);
        model.addAttribute("SupplierList", ncc);
        model.addAttribute("WarehouseList", Warehouse);
        return "warehouse/InputPage";
    }

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping("/InputsipData")
    public String InputsipData(Model model) {
        model.addAttribute("InputsipData", lab.findall());
        return "warehouse/InputsipData";
    }

    @RequestMapping("/Updates/{id}")
    public String Updates(Model model, @PathVariable("id") String id) {
        Input dataup = lab.findOne(id);
        dataup.setId(dataup.getId());
        dataup.setDate(dataup.getDate());
        dataup.setService(dataup.getService());
        dataup.setExplain(dataup.getExplain());
        dataup.setStatus("Completed");
        dataup.setDeletestatus(Boolean.FALSE);
        dataup.setDate(dataup.getDate());
        lab.Update(dataup);
        model.addAttribute("InputsipData", lab.findall());
        return "redirect:/web/warehouse/InputsipData";
    }

    @RequestMapping("/Deletes/")
    public String Deletes(Model model, HttpServletRequest request) {
        String id = request.getParameter("idcode");
        Input dataup = lab.findOne(id);
        dataup.setId(dataup.getId());
        dataup.setDate(dataup.getDate());
        dataup.setService(dataup.getService());
        dataup.setExplain(dataup.getExplain());
        dataup.setStatus("NotComplete");
        dataup.setDeletestatus(Boolean.TRUE);
        dataup.setDate(dataup.getDate());
        lab.Update(dataup);
        model.addAttribute("InputsipData", lab.findall());
        return "redirect:/web/warehouse/InputsipData";
    }

    public boolean isSpace(String[] array) {
        for (String array1 : array) {
            return (array1 == null) || (array1.trim().length() == 0); //true on null, empty string, or white space only. Do something here
        }
        return false;
    }

    public boolean isEmpty(String[] array) {
        for (String array1 : array) {
            return array1 == null; //true on null, empty string, or white space only. Do something here
        }
        return false;
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public String SaveData(@ModelAttribute("Input") Input input, Model model, HttpServletRequest request) {
        String getID = request.getParameter("id");
        String getDate = request.getParameter("Date");
        String getservice = request.getParameter("service");
        String getexplain = request.getParameter("explain");
        String[] refreence = request.getParameterValues("refercne");

        String[] name = request.getParameterValues("name");
        String[] codeid = request.getParameterValues("codeid");
        String[] unit = request.getParameterValues("unit");
        String[] suplier = request.getParameterValues("suplier");
        String[] warehouse = request.getParameterValues("warehouse");
        String[] quantity = request.getParameterValues("quantity");
        String[] importprice = request.getParameterValues("importprice");
        String[] group = request.getParameterValues("group");
        String[] weight = request.getParameterValues("weight");

        Input addss = null;
        String message = "Success";

        if (isSpace(warehouse) || isSpace(quantity) || isSpace(importprice)) {
            message = "Some field is empty";
            model.addAttribute("color", "red");
            model.addAttribute("message", message);
            return "warehouse/InputPage";
        } else {
            //

            //Insert to input information
            //
            //When field id == null
            if ("".equals(getID)) {
                Input idobject = lab.findAllId();
                if (idobject != null) {
                    String idgen = idobject.toString();
                    idgen = idgen.substring(2);
                    int idstt = Integer.valueOf(idgen);
                    idstt = idstt + 1;
                    String str = "" + idstt;
                    String pad = "NK0000";
                    String ans = pad.substring(0, pad.length() - str.length()) + str;
                    input.setId(ans);
                } else {

                    //when data is null then add default value is Nk0000
                    String idgen = "NK0000";
                    idgen = idgen.substring(2);
                    int idstt = Integer.valueOf(idgen);
                    idstt = idstt + 1;
                    String str = "" + idstt;
                    String pad = "NK0000";
                    String ans = pad.substring(0, pad.length() - str.length()) + str;
                    input.setId(ans);
                }
                input.setDate(getDate);
                input.setService(getservice);
                input.setExplain(getexplain);
                input.setStatus("Chưa Xác Nhận");
                input.setDeletestatus(Boolean.FALSE);
                addss = lab.Save(input);

            } else {
                //When Field id not null
                input.setId(getID);
                input.setDate(getDate);
                input.setService(getservice);
                input.setExplain(getexplain);
                input.setStatus("Chưa Xác Nhận");
                input.setDeletestatus(Boolean.FALSE);
                addss = lab.Save(input);
            }
            List<InputContent> objectList = new ArrayList<>();
            //
            //Insert into input content
            //
            if (addss != null) {
                for (int i = 0; i < name.length; i++) {
                    GoodsCatagory catagory = new GoodsCatagory();
                    InputContent inputobject = new InputContent();
                    catagory.setId(codeid[i]);
                    inputobject.setGoodsId(catagory);
                    inputobject.setGoodsName(name[i]);
                    inputobject.setUnit(unit[i]);
                    inputobject.setSupplier(suplier[i]);
                    inputobject.setWarehouse(warehouse[i]);
                    inputobject.setQuantity(Integer.valueOf(quantity[i]));
                    inputobject.setImportsPrices(Integer.valueOf(importprice[i]));
                    inputobject.setGroupGoods(group[i]);
                    inputobject.setWeight(Integer.valueOf(weight[i]));
                    Input sdsa = new Input();
                    sdsa.setId(addss.getId());
                    inputobject.setInputId(sdsa);
                    objectList.add(inputobject);

                    if (refreence == null) {
                        //Insert history
                        Hisio history = new Hisio();
                        history.setGoodsId(codeid[i]);
                        history.setGoodsName(name[i]);
                        history.setDate(getDate);
                        history.setMajor("Input");
                        history.setPrice(Integer.valueOf(importprice[i]));
                        history.setQuantity(Integer.valueOf(quantity[i]));
                        history.setUnit(unit[i]);
                        history.setWarehouse(warehouse[i]);
                        history.setLicense("Enter another");
                        lab5.save(history);
                    } else {
                        //Insert history
                        Hisio history = new Hisio();
                        history.setGoodsId(codeid[i]);
                        history.setGoodsName(name[i]);
                        history.setDate(getDate);
                        history.setMajor("Input");
                        history.setPrice(Integer.valueOf(importprice[i]));
                        history.setQuantity(Integer.valueOf(quantity[i]));
                        history.setUnit(unit[i]);
                        history.setWarehouse(warehouse[i]);
                        history.setLicense(refreence[i]);
                        lab5.save(history);
                    }

                }
//                List<InputContent> arrraylist = new ArrayList<>();
                InputContent respone = null;
                for (InputContent inputContent : objectList) {
                    InputContent add = new InputContent();
                    add.setGoodsId(inputContent.getGoodsId());
                    add.setGoodsName(inputContent.getGoodsName());
                    add.setUnit(inputContent.getUnit());
                    add.setSupplier(inputContent.getSupplier());
                    add.setWarehouse(inputContent.getWarehouse());
                    add.setQuantity(inputContent.getQuantity());
                    add.setImportsPrices(inputContent.getImportsPrices());
                    add.setGroupGoods(inputContent.getGroupGoods());
                    add.setWeight(inputContent.getWeight());
                    add.setInputId(inputContent.getInputId());
                    respone = lab2.Save(add);

                    //Insert warehouse
                    Warehouse getWarehouse = lab4.FindDupGoods("" + respone.getGoodsId().toString() + "", "" + respone.getWarehouse() + "", "" + respone.getSupplier() + "");
                    if (getWarehouse != null) {
//                        arrraylists.add(getWarehouse);
                        getWarehouse.setImportPrice(respone.getImportsPrices());
                        getWarehouse.setQuantityInStock(getWarehouse.getQuantityInStock() + respone.getQuantity());
                        getWarehouse.setPriceInStock(getWarehouse.getPriceInStock() + (getWarehouse.getImportPrice() * respone.getQuantity()));
                        Warehouse checksave = lab4.Save(getWarehouse);
                        System.out.println("Update Quantity of: " + checksave.getGoodsName());

                    } else {
                        Warehouse setWarehouse = new Warehouse();
                        setWarehouse.setGoodsId(respone.getGoodsId().toString());
                        setWarehouse.setGoodsName(respone.getGoodsName());
                        setWarehouse.setUnit(respone.getUnit());
                        setWarehouse.setQuantityInStock(respone.getQuantity());
                        setWarehouse.setImportPrice(respone.getImportsPrices());
                        setWarehouse.setSupplier(respone.getSupplier());
                        setWarehouse.setPriceInStock(respone.getQuantity() * respone.getImportsPrices());
                        setWarehouse.setSupplier(respone.getSupplier());
                        setWarehouse.setGroupGoods(respone.getGroupGoods());
                        setWarehouse.setWeight(respone.getWeight());
                        StockCard stockCards = new StockCard();
                        stockCards.setId(respone.getWarehouse());
                        setWarehouse.setStockCard(stockCards);

                        Warehouse checksave = lab4.Save(setWarehouse);
                        System.out.println("Add new " + checksave.getGoodsName());
                    }
                }
            } else {

            }
            model.addAttribute("color", "green");
            model.addAttribute("message", message);
            return "redirect:/web/warehouse/InputsipData";
        }
    }

}
