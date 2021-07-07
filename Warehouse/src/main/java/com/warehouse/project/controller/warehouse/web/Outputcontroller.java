/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.Output;
import com.warehouse.project.model.OutputContent;
import com.warehouse.project.model.StockCard;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.IO.IOutput;
import com.warehouse.project.service.warehouse.IO.IOutputConent;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
public class Outputcontroller {

    @Autowired
    IOutput lab;

    @Autowired
    IOutputConent lab1;

    @Autowired
    IWarehouse lab4;

    @Autowired
    Ihistory lab5;

    @RequestMapping("/output")
    public String page(Model model) {

        model.addAttribute("message", "");
        return "warehouse/Output";
    }

    @RequestMapping("/OutputSlip")
    public String OutputSlip(Model model) {
        for (Output output : lab.findall()) {
            System.out.println(output.getId());
        }
        model.addAttribute("outputData",lab.findall());
        model.addAttribute("message", "");
        return "warehouse/OutputSlip";
    }

    @RequestMapping("/UpdateOutput/{id}")
    public String Updatesds(Model model, @PathVariable("id") String id) {
        Output dataup = lab.findOne(id);
        dataup.setId(dataup.getId());
        dataup.setDate(dataup.getDate());
        dataup.setSerivce(dataup.getSerivce());
        dataup.setExplain(dataup.getExplain());
        dataup.setStatus("Completed");
        dataup.setDeletestatus(Boolean.FALSE);
        dataup.setDate(dataup.getDate());
        lab.Update(dataup);
        model.addAttribute("InputsipData", lab.findall());
        return "redirect:/web/warehouse/OutputSlip";
    }

    @RequestMapping("/DeleteOustput/")
    public String Deletes(Model model, HttpServletRequest request) {
        String id = request.getParameter("idcode");
        Output dataup = lab.findOne(id);
        dataup.setId(dataup.getId());
        dataup.setDate(dataup.getDate());
        dataup.setSerivce(dataup.getSerivce());
        dataup.setExplain(dataup.getExplain());
        dataup.setStatus("NotComplete");
        dataup.setDeletestatus(Boolean.TRUE);
        dataup.setDate(dataup.getDate());
        lab.Update(dataup);
        model.addAttribute("InputsipData", lab.findall());
        return "redirect:/web/warehouse/OutputSlip";
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

    public boolean IsEmptyDatabase(String[] array, String[] array1, String[] array2) {
        for (int i = 0; i < array.length; i++) {
            Warehouse getWarehouse = lab4.FindDupGoods("" + array[i] + "", "" + array1[i] + "", "" + array2[i] + "");
            if (getWarehouse == null) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean QuantityLowers(String[] array, String[] array1, String[] array2) {
        for (int i = 0; i < array.length; i++) {
            Warehouse getWarehouse = lab4.FindDupGoods("" + array[i] + "", "" + array1[i] + "", "" + array2[i] + "");
            if (getWarehouse.getQuantityInStock() <= 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public List<String> GetObjectGoods(String[] array, String[] array1, String[] array2) {
        List<String> itemIsNotInDatabase = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            Warehouse getWarehouse = lab4.FindDupGoods("" + array[i] + "", "" + array1[i] + "", "" + array2[i] + "");
            if (getWarehouse == null) {
                itemIsNotInDatabase.add(array[i]);
            } else {
                itemIsNotInDatabase.add("");
            }
        }
        return itemIsNotInDatabase;
    }

    @RequestMapping(value = "/output", method = RequestMethod.POST)
    public String SaveData(@ModelAttribute("Input") Output output, Model model, HttpServletRequest request) {
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
        String[] importprice = request.getParameterValues("Exportprice");
        String[] group = request.getParameterValues("group");
        String[] weight = request.getParameterValues("weight");

        Output addss = null;
        String message = "Success";
        if (isSpace(warehouse) || isSpace(quantity) || isSpace(importprice)) {
            message = "Some field is empty";
            model.addAttribute("color", "red");
            model.addAttribute("message", message);
            return "warehouse/Output";
        } else {
            //
            //Insert to input information
            if (QuantityLowers(codeid, warehouse, suplier)) {

            }
            //When field id == null
            if (getID == "") {
                Output idobject = lab.findAllId();
                if (idobject != null) {
                    String idgen = idobject.toString();
                    idgen = idgen.substring(2);
                    int idstt = Integer.valueOf(idgen);
                    idstt = idstt + 1;
                    String str = "" + idstt;
                    String pad = "XK0000";
                    String ans = pad.substring(0, pad.length() - str.length()) + str;
                    output.setId(ans);
                } else {
                    //when data is null then add default value is Nk0000
                    String idgen = "XK0000";
                    idgen = idgen.substring(2);
                    int idstt = Integer.valueOf(idgen);
                    idstt = idstt + 1;
                    String str = "" + idstt;
                    String pad = "XK0000";
                    String ans = pad.substring(0, pad.length() - str.length()) + str;
                    output.setId(ans);
                }
                output.setDate(getDate);
                output.setSerivce(getservice);
                output.setExplain(getexplain);
                output.setStatus("NotComplete");
                output.setDeletestatus(Boolean.FALSE);
                addss = lab.Save(output);

            } else {
                //When Field id not null
                output.setId(getID);
                output.setDate(getDate);
                output.setSerivce(getservice);
                output.setExplain(getexplain);
                output.setStatus("NotComplete");
                output.setDeletestatus(Boolean.FALSE);
                addss = lab.Save(output);
            }
            List<OutputContent> objectList = new ArrayList<>();
            //
            //Insert into input content
            //
            if (addss != null) {
                for (int i = 0; i < name.length; i++) {
                    OutputContent outputContent = new OutputContent();
                    outputContent.setGoodsId(codeid[i]);
                    outputContent.setGoodsName(name[i]);
                    outputContent.setUnit(unit[i]);
                    outputContent.setSupplier(suplier[i]);
                    outputContent.setWarehouse(warehouse[i]);
                    outputContent.setQuantity(Integer.valueOf(quantity[i]));
                    outputContent.setExportsPrices(Integer.valueOf(importprice[i]));
                    outputContent.setGroupGoods(group[i]);
                    outputContent.setWeight(Integer.valueOf(weight[i]));
                    Output outputs = new Output();
                    outputs.setId(addss.getId());
                    outputContent.setOutputId(outputs);
                    objectList.add(outputContent);

                    //Insert history
                    if (refreence == null) {
                        //Insert history
                        Hisio history = new Hisio();
                        history.setGoodsId(codeid[i]);
                        history.setGoodsName(name[i]);
                        history.setDate(getDate);
                        history.setMajor("Output");
                        history.setPrice(0 - Integer.valueOf(importprice[i]));
                        history.setQuantity(Integer.valueOf(quantity[i]));
                        history.setUnit(unit[i]);
                        history.setWarehouse(warehouse[i]);
                        history.setLicense("Other export");
                        lab5.save(history);
                    } else {
                        //Insert history
                        Hisio history = new Hisio();
                        history.setGoodsId(codeid[i]);
                        history.setGoodsName(name[i]);
                        history.setDate(getDate);
                        history.setMajor("Output");
                        history.setPrice(0 - Integer.valueOf(importprice[i]));
                        history.setQuantity(Integer.valueOf(quantity[i]));
                        history.setUnit(unit[i]);
                        history.setWarehouse(warehouse[i]);
                        history.setLicense(refreence[i]);
                        lab5.save(history);
                    }
                }
                OutputContent respone = null;
                for (OutputContent outputContent : objectList) {
                    OutputContent add = new OutputContent();
                    add.setGoodsId(outputContent.getGoodsId());
                    add.setGoodsName(outputContent.getGoodsName());
                    add.setUnit(outputContent.getUnit());
                    add.setSupplier(outputContent.getSupplier());
                    add.setWarehouse(outputContent.getWarehouse());
                    add.setQuantity(outputContent.getQuantity());
                    add.setExportsPrices(outputContent.getExportsPrices());
                    add.setGroupGoods(outputContent.getGroupGoods());
                    add.setWeight(outputContent.getWeight());
                    add.setOutputId(outputContent.getOutputId());
                    respone = lab1.Save(add);

                    //Warehouse insert
                    Warehouse getWarehouse = lab4.FindDupGoods("" + respone.getGoodsId().toString() + "", "" + respone.getWarehouse() + "", "" + respone.getSupplier() + "");
                    if (getWarehouse != null) {
                        getWarehouse.setQuantityInStock(getWarehouse.getQuantityInStock() - respone.getQuantity());
                        getWarehouse.setPriceInStock(getWarehouse.getPriceInStock() - (getWarehouse.getImportPrice() * respone.getQuantity()));
                        Warehouse checksave = lab4.Save(getWarehouse);
                        System.out.println("Update Quantity of: " + checksave.getGoodsName());
                    } else {
                        System.out.println("Eo update");
                    }
                }
            } else {

            }
            model.addAttribute("color", "green");
            model.addAttribute("message", message);
            return "redirect:/web/warehouse/OutputSlip";
        }
    }
}
