/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.GoodsCatagory;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.InputContent;
import com.warehouse.project.model.Supplier;
import com.warehouse.project.service.warehouse.IInput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String SaveData(@ModelAttribute("Input") Input input, Model model, HttpServletRequest request) {

        String[] codeid = request.getParameterValues("codeid");
        String[] unit = request.getParameterValues("unit");
        String[] suplier = request.getParameterValues("suplier");
        String[] warehouse = request.getParameterValues("warehouse");
        String[] quantity = request.getParameterValues("quantity");
        String[] importprice = request.getParameterValues("importprice");
        String[] group = request.getParameterValues("group");
        String[] weight = request.getParameterValues("weight");
//
//        for
//        InputContent inputobject = new InputContent();
//        List<InputContent> arrraylist = new ArrayList<InputContent>();
//        GoodsCatagory catagory = new GoodsCatagory();
        List<InputContent> objectList = new ArrayList<InputContent>();
//        for (InputContent inputContent : arrraylist) {
//              System.out.println(loop8);
//        }

//        for (int i = 0; i < test.length; i++) {
//               System.out.println(test[i]);
//        }
//     
//        input.setStatus("Chưa Xác Nhận");
//        Input add = lab.Save(input);
//        System.out.println(add);
        return "warehouse/welcome";
    }

}
