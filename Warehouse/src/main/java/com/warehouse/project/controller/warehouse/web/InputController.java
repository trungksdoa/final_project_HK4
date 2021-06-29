/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.service.warehouse.IInput;
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

    @RequestMapping("/page")
    public String index(Model model) {
        return "warehouse/index";
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public String SaveData(@ModelAttribute("Input") Input input, Model model, final HttpServletRequest request) {
//        
//        input.setStatus("Chưa Xác Nhận");
//        Input add = lab.Save(input);
//        System.out.println(add);
//        String[] ids = request.getParameterValues("codeID");
        String[] name = request.getParameterValues("15645465");
//        String[] unit = request.getParameterValues("unit");
//        String[] warehouse = request.getParameterValues("warehouse");
//        String[] quantity = request.getParameterValues("quantity");
//        String[] importprice = request.getParameterValues("importprice");
//        String[] group = request.getParameterValues("group");
//        String[] weight = request.getParameterValues("weight");
//        

//        for (int i = 0; i < name.length; i++) {
//            InputContent inputcontent = new InputContent();
//            inputcontent.setGoodsId(goodsId);
//        }
//        inputcontent.setGoodsId(goodsId);
//        
        System.out.println(input);
        System.out.print(name);
//        for (String text : name) {
//            System.out.print(text);
//        }
//        
//    

        return "warehouse/welcome";
    }

}
