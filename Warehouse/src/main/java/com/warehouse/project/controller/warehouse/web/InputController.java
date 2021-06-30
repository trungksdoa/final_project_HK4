/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.StockCard;

import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.service.warehouse.IInput;
import com.warehouse.project.service.warehouse.IInputContent;
import com.warehouse.project.service.warehouse.IWarehouse;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    IWarehouse lab3;

    @RequestMapping("/page")
    public String index(Model model) {
        return "warehouse/index";
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public String SaveData(@ModelAttribute("Input") Input input, Model model, HttpServletRequest request) {
        input.setStatus("Chưa Xác Nhận");
        Input addss = lab.Save(input);
        String[] name = request.getParameterValues("name");
        String[] codeid = request.getParameterValues("codeid");
        String[] unit = request.getParameterValues("unit");
        String[] suplier = request.getParameterValues("suplier");
        String[] warehouse = request.getParameterValues("warehouse");
        String[] quantity = request.getParameterValues("quantity");
        String[] importprice = request.getParameterValues("importprice");
        String[] group = request.getParameterValues("group");
        String[] weight = request.getParameterValues("weight");
        List<InputContent> objectList = new ArrayList<InputContent>();

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
            inputobject.setImportsPrices(Double.valueOf(importprice[i]));
            inputobject.setGroupGoods(group[i]);
            inputobject.setWeight(Double.valueOf(weight[i]));
            Input sdsa = new Input();
            sdsa.setId(addss.getId());
            inputobject.setInputId(sdsa);
            objectList.add(inputobject);
        }
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
        }
        Warehouse respones = null;
        for (InputContent inputContent : objectList) {
//            System.out.println(inputContent.getGoodsId().toString());
            Warehouse adds = new Warehouse();
            StockCard stockcard = new StockCard();
            adds.setGoodsId(inputContent.getGoodsId().toString());
            adds.setGoodsName(inputContent.getGoodsName());
            adds.setUnit(inputContent.getUnit());
            adds.setSupplier(inputContent.getSupplier());
            //
            stockcard.setId(inputContent.getWarehouse());
            //
            adds.setStockCard(stockcard);
            adds.setQuantityInStock(Double.valueOf(inputContent.getQuantity()));
            adds.setImportPrice(inputContent.getImportsPrices());
            adds.setGroupGoods(inputContent.getGroupGoods());
            adds.setWeight(inputContent.getWeight());
            
            adds.setSellPrice(inputContent.getImportsPrices());
            adds.setGroupGoods(inputContent.getGroupGoods());
            respones = lab3.Save(adds);
        }
        if (respone != null) {
            System.out.println(respone);
        }
//        if (respones != null) {
//            System.out.println(respones);
//        }
//        for (InputContent inputContent : arrraylist) {
//              System.out.println(loop8);
//        }
//        for (int i = 0; i < test.length; i++) {
//               System.out.println(test[i]);
//        }
//     

        return "warehouse/RootLayout";
    }

}
