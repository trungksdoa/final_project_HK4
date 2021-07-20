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
import com.warehouse.project.model.Supplier;
import com.warehouse.project.model.Warehouse;

import com.warehouse.project.service.warehouse.IO.IInput;
import com.warehouse.project.service.warehouse.IO.IInputContent;
import com.warehouse.project.service.warehouse.IStock_card;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import com.warehouse.project.service.warehouse.Other.ISupplier;
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

    @Autowired
    ISupplier lab124;
    
    @Autowired
    IStock_card lab134;
    @RequestMapping("/input")
    public String index(Model model) {

        ArrayList<String> goodsName = new ArrayList<>();
        ArrayList<String> ncc = new ArrayList<>();
        ArrayList<String> Warehouse = new ArrayList<>();
        lab242.findALl().forEach(string1 -> {
            goodsName.add(string1.getId());
        });
        for (Supplier supplier : lab124.findAll()) {
            ncc.add(supplier.getId());
        }
        for (StockCard stockCard : lab134.findAll()) {
            Warehouse.add(stockCard.getId());
        }
        model.addAttribute("message", "");
        model.addAttribute("Namelist", goodsName);
        model.addAttribute("SupplierList", ncc);
        model.addAttribute("WarehouseList", Warehouse);
        return "warehouse/InputPage";
    }

    @RequestMapping("/detaiiInput/")
    public String DetailIndex(Model model, HttpServletRequest request) {
//        String ids = request.getParameter("id");
//        ArrayList<InputContent> goodsName = new ArrayList<>();
//        Input details = lab.findOne(ids);
//        model.addAttribute("detailist",details);
//        goodsName.addAll(details.getInputContentCollection());
        return "warehouse/InputPageDetail";
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

    @RequestMapping("/Deletes/")
    public String Deletes(Model model, HttpServletRequest request) {
        String id = request.getParameter("idcode");
        Input dataup = lab.findOne(id);
        dataup.setId(dataup.getId());
        dataup.setDate(dataup.getDate());
        dataup.setService(dataup.getService());
        dataup.setExplain(dataup.getExplain());
        dataup.setStatus(3);
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
                input.setDate2("");
                input.setService(getservice);
                input.setExplain(getexplain);
                input.setStatus(1);
                addss = lab.Save(input);

            } else {
                //When Field id not null
                input.setId(getID);
                input.setDate(getDate);
                input.setDate2("");
                input.setService(getservice);
                input.setExplain(getexplain);
                input.setStatus(1);
                addss = lab.Save(input);
            }
            List<InputContent> objectList = new ArrayList<>();
            //
            //Insert into input content
            //
            if (addss != null) {
                for (int i = 0; i < name.length; i++) {
                    InputContent respone = null;
                    InputContent inputobject = new InputContent();
                    String subString = codeid[i] + "_" + suplier[i] + "_" + warehouse[i];
                    inputobject.setGoodsId(subString);
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
                    if (refreence != null) {
                        inputobject.setReference(refreence[i]);
                    } else {
                        inputobject.setReference(addss.getId());
                    }

                    respone = lab2.Save(inputobject);
                }
            } else {

            }
            return "redirect:/web/warehouse/InputsipData";
        }
    }

    @RequestMapping("/UpdateInputWarehouse")
    public String UpdateInputWarehouse(Model model, HttpServletRequest request) {
        String[] idse = request.getParameterValues("idenentity");
        String[] reference = request.getParameterValues("reference");
        String slipId = request.getParameter("slipIds");
        String expalin = request.getParameter("Explain23s");

        Input findData2 = lab.findOne(slipId);
        findData2.setId(findData2.getId());
        findData2.setService(findData2.getService());
        if (expalin == "") {
            findData2.setExplain(findData2.getExplain());
        } else {
            findData2.setExplain(expalin);
        };
        String date = String.valueOf(java.time.LocalDate.now());
        findData2.setDate2(date);
        findData2.setDate(findData2.getDate());
        findData2.setStatus(2);
        lab.Save(findData2);
        for (int i = 0; i < idse.length; i++) {
            InputContent dataget = lab2.findOneData(Integer.valueOf(idse[i]));
            Warehouse getWarehouse = lab4.findOnes(dataget.getGoodsId().toString(), dataget.getWarehouse());
            if (getWarehouse != null) {
                getWarehouse.setImportPrice(dataget.getImportsPrices());
                getWarehouse.setQuantityInStock(getWarehouse.getQuantityInStock() + dataget.getQuantity());
                getWarehouse.setPriceInStock(getWarehouse.getPriceInStock() + (getWarehouse.getImportPrice() * dataget.getQuantity()));
                Warehouse checksave = lab4.Save(getWarehouse);
//                System.out.println("Update Quantity of: " + checksave.getGoodsName());

            } else {
                Warehouse setWarehouse = new Warehouse();
                setWarehouse.setGoodsId(dataget.getGoodsId().toString());
                setWarehouse.setGoodsName(dataget.getGoodsName());
                setWarehouse.setUnit(dataget.getUnit());
                setWarehouse.setQuantityInStock(dataget.getQuantity());
                setWarehouse.setImportPrice(dataget.getImportsPrices());
                setWarehouse.setSupplier(dataget.getSupplier());
                setWarehouse.setPriceInStock(dataget.getQuantity() * dataget.getImportsPrices());
                setWarehouse.setSupplier(dataget.getSupplier());
                setWarehouse.setGroupGoods(dataget.getGroupGoods());
                setWarehouse.setWeight(dataget.getWeight());
                StockCard stockCards = new StockCard();
                stockCards.setId(dataget.getWarehouse());
                setWarehouse.setStockCard(stockCards);

                Warehouse checksave = lab4.Save(setWarehouse);
//                System.out.println("Add new " + checksave.getGoodsName());
            }
            //Insert history
            Hisio history = new Hisio();
            history.setGoodsId(dataget.getGoodsId().toString());
            history.setGoodsName(dataget.getGoodsId().toString());
            history.setDate(date);
            history.setMajor("Input");
            history.setPrice(Integer.valueOf(dataget.getImportsPrices()));
            history.setQuantity(Integer.valueOf(dataget.getQuantity()));
            history.setUnit(dataget.getUnit());
            history.setWarehouse(dataget.getWarehouse());
            history.setLicense(dataget.getReference());
            lab5.save(history);
        }
        return "redirect:/web/warehouse/InputsipData";

    }

}

//
//
// @RequestMapping(value = "/page", method = RequestMethod.POST)
//    public String SaveData(@ModelAttribute("Input") Input input, Model model, HttpServletRequest request) {
//        String getID = request.getParameter("id");
//        String getDate = request.getParameter("Date");
//        String getservice = request.getParameter("service");
//        String getexplain = request.getParameter("explain");
//        String[] refreence = request.getParameterValues("refercne");
//
//        String[] name = request.getParameterValues("name");
//        String[] codeid = request.getParameterValues("codeid");
//        String[] unit = request.getParameterValues("unit");
//        String[] suplier = request.getParameterValues("suplier");
//        String[] warehouse = request.getParameterValues("warehouse");
//        String[] quantity = request.getParameterValues("quantity");
//        String[] importprice = request.getParameterValues("importprice");
//        String[] group = request.getParameterValues("group");
//        String[] weight = request.getParameterValues("weight");
//
//        Input addss = null;
//        String message = "Success";
//
//        if (isSpace(warehouse) || isSpace(quantity) || isSpace(importprice)) {
//            message = "Some field is empty";
//            model.addAttribute("color", "red");
//            model.addAttribute("message", message);
//            return "warehouse/InputPage";
//        } else {
//            //
//
//            //Insert to input information
//            //
//            //When field id == null
//            if ("".equals(getID)) {
//                Input idobject = lab.findAllId();
//                if (idobject != null) {
//                    String idgen = idobject.toString();
//                    idgen = idgen.substring(2);
//                    int idstt = Integer.valueOf(idgen);
//                    idstt = idstt + 1;
//                    String str = "" + idstt;
//                    String pad = "NK0000";
//                    String ans = pad.substring(0, pad.length() - str.length()) + str;
//                    input.setId(ans);
//                } else {
//
//                    //when data is null then add default value is Nk0000
//                    String idgen = "NK0000";
//                    idgen = idgen.substring(2);
//                    int idstt = Integer.valueOf(idgen);
//                    idstt = idstt + 1;
//                    String str = "" + idstt;
//                    String pad = "NK0000";
//                    String ans = pad.substring(0, pad.length() - str.length()) + str;
//                    input.setId(ans);
//                }
//                input.setDate(getDate);
//                input.setService(getservice);
//                input.setExplain(getexplain);
//                input.setStatus("NotComplete");
//                input.setDeletestatus(Boolean.FALSE);
//                addss = lab.Save(input);
//
//            } else {
//                //When Field id not null
//                input.setId(getID);
//                input.setDate(getDate);
//                input.setService(getservice);
//                input.setExplain(getexplain);
//                input.setStatus("NotComplete");
//                input.setDeletestatus(Boolean.FALSE);
//                addss = lab.Save(input);
//            }
//            List<InputContent> objectList = new ArrayList<>();
//            //
//            //Insert into input content
//            //
//            if (addss != null) {
//                for (int i = 0; i < name.length; i++) {
//                    GoodsCatagory catagory = new GoodsCatagory();
//                    InputContent inputobject = new InputContent();
//                    catagory.setId(codeid[i]);
//                    inputobject.setGoodsId(catagory);
//                    inputobject.setGoodsName(name[i]);
//                    inputobject.setUnit(unit[i]);
//                    inputobject.setSupplier(suplier[i]);
//                    inputobject.setWarehouse(warehouse[i]);
//                    inputobject.setQuantity(Integer.valueOf(quantity[i]));
//                    inputobject.setImportsPrices(Integer.valueOf(importprice[i]));
//                    inputobject.setGroupGoods(group[i]);
//                    inputobject.setWeight(Integer.valueOf(weight[i]));
//                    Input sdsa = new Input();
//                    sdsa.setId(addss.getId());
//                    inputobject.setInputId(sdsa);
//                    objectList.add(inputobject);
//
//                    if (refreence == null) {
//                        //Insert history
//                        Hisio history = new Hisio();
//                        history.setGoodsId(codeid[i]);
//                        history.setGoodsName(name[i]);
//                        history.setDate(getDate);
//                        history.setMajor("Input");
//                        history.setPrice(Integer.valueOf(importprice[i]));
//                        history.setQuantity(Integer.valueOf(quantity[i]));
//                        history.setUnit(unit[i]);
//                        history.setWarehouse(warehouse[i]);
//                        history.setLicense("Enter another");
//                        lab5.save(history);
//                    } else {
//                        //Insert history
//                        testarray.clear();
//                        testarray.add(refreence[i]);
//                        Hisio history = new Hisio();
//                        history.setGoodsId(codeid[i]);
//                        history.setGoodsName(name[i]);
//                        history.setDate(getDate);
//                        history.setMajor("Input");
//                        history.setPrice(Integer.valueOf(importprice[i]));
//                        history.setQuantity(Integer.valueOf(quantity[i]));
//                        history.setUnit(unit[i]);
//                        history.setWarehouse(warehouse[i]);
//                        history.setLicense(refreence[i]);
//                        lab5.save(history);
//                    }
//
//                }
////                List<InputContent> arrraylist = new ArrayList<>();
//                InputContent respone = null;
//                for (InputContent inputContent : objectList) {
//                    InputContent add = new InputContent();
//                    add.setGoodsId(inputContent.getGoodsId());
//                    add.setGoodsName(inputContent.getGoodsName());
//                    add.setUnit(inputContent.getUnit());
//                    add.setSupplier(inputContent.getSupplier());
//                    add.setWarehouse(inputContent.getWarehouse());
//                    add.setQuantity(inputContent.getQuantity());
//                    add.setImportsPrices(inputContent.getImportsPrices());
//                    add.setGroupGoods(inputContent.getGroupGoods());
//                    add.setWeight(inputContent.getWeight());
//                    add.setInputId(inputContent.getInputId());
//                    respone = lab2.Save(add);
//
//                    //Insert warehouse
//                    Warehouse getWarehouse = lab4.FindDupGoods("" + respone.getGoodsId().toString() + "", "" + respone.getWarehouse() + "", "" + respone.getSupplier() + "");
//                    if (getWarehouse != null) {
////                        arrraylists.add(getWarehouse);
//                        getWarehouse.setImportPrice(respone.getImportsPrices());
//                        getWarehouse.setQuantityInStock(getWarehouse.getQuantityInStock() + respone.getQuantity());
//                        getWarehouse.setPriceInStock(getWarehouse.getPriceInStock() + (getWarehouse.getImportPrice() * respone.getQuantity()));
//                        Warehouse checksave = lab4.Save(getWarehouse);
//                        System.out.println("Update Quantity of: " + checksave.getGoodsName());
//
//                    } else {
//                        Warehouse setWarehouse = new Warehouse();
//                        setWarehouse.setGoodsId(respone.getGoodsId().toString());
//                        setWarehouse.setGoodsName(respone.getGoodsName());
//                        setWarehouse.setUnit(respone.getUnit());
//                        setWarehouse.setQuantityInStock(respone.getQuantity());
//                        setWarehouse.setImportPrice(respone.getImportsPrices());
//                        setWarehouse.setSupplier(respone.getSupplier());
//                        setWarehouse.setPriceInStock(respone.getQuantity() * respone.getImportsPrices());
//                        setWarehouse.setSupplier(respone.getSupplier());
//                        setWarehouse.setGroupGoods(respone.getGroupGoods());
//                        setWarehouse.setWeight(respone.getWeight());
//                        StockCard stockCards = new StockCard();
//                        stockCards.setId(respone.getWarehouse());
//                        setWarehouse.setStockCard(stockCards);
//
//                        Warehouse checksave = lab4.Save(setWarehouse);
//                        System.out.println("Add new " + checksave.getGoodsName());
//                    }
//                }
//            } else {
//
//            }
//            model.addAttribute("color", "green");
//            model.addAttribute("message", message);
//            return "redirect:/web/warehouse/InputsipData";
//        }
//    }
