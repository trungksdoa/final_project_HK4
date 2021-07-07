/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.web;

import com.warehouse.project.model.Checkstockslip;
import com.warehouse.project.model.Checkslip;
import com.warehouse.project.model.Hisio;
import com.warehouse.project.model.Input;
import com.warehouse.project.model.Vwtotal;
import com.warehouse.project.model.Warehouse;
import com.warehouse.project.model.beanclass.Hisotryio;
import com.warehouse.project.model.beanclass.WarehouseBean;
import com.warehouse.project.model.beanclass.WarehouseStock;
import com.warehouse.project.service.warehouse.CheckSockSlipI;
import com.warehouse.project.service.warehouse.ICheckstock;
import com.warehouse.project.service.warehouse.IWarehouse;
import com.warehouse.project.service.warehouse.Ihistory;
import com.warehouse.project.service.warehouse.View.IVwtotal;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.MethodNotAllowedException;

/**
 *
 * @author trung
 */
@Controller
@RequestMapping("/web/warehouse")
public class KiemKeController {

    @Autowired
    IWarehouse lab;

    @Autowired
    IVwtotal lav2;

    @Autowired
    Ihistory lab5;

    @Autowired
    ICheckstock lab6;

    @Autowired
    CheckSockSlipI lab8;

    public int ConverttoInt(String keyword2) {
        int keyword = Integer.valueOf(keyword2);
        return keyword;
    }

    @RequestMapping(value = "/page1", method = RequestMethod.GET)
    public String page(Model model) {
        List<WarehouseStock> warehouse = new ArrayList<>();
        int Sumquantity = 0;
        int SumPrice = 0;
        model.addAttribute("datalist", lab.findAllData());
//        model.addAttribute("Namelist", allObject);
//        model.addAttribute("ListQuantity", lab.FindALl());
        for (Object[] objects : lab.findAllWarehouse()) {
            String Warehouse = (String) objects[0];
            WarehouseStock objectconvet = new WarehouseStock(Warehouse);
            warehouse.add(objectconvet);
        }
        for (Warehouse warehouse1 : lab.findAllData()) {
            Sumquantity += warehouse1.getQuantityInStock();
            SumPrice += warehouse1.getPriceInStock();
        }
        model.addAttribute("datalist2", warehouse);
        model.addAttribute("SumPrice", SumPrice);
        model.addAttribute("sumquantity", Sumquantity);
//        model.addAttribute("historyIo", lab5.findAll());
        return "warehouse/Inventory";
    }

    @RequestMapping(value = "/page2", method = RequestMethod.GET)
    public String page2(Model model) {
        model.addAttribute("historyIo", lab5.findAll());
        return "warehouse/Tracking";
    }

//    @RequestMapping(value = "/page3", method = RequestMethod.GET)
//    public String page3(Model model) {
//        return "warehouse/TrackingsStock";
//    }
    @RequestMapping(value = "/page4", method = RequestMethod.GET)
    public String page4(Model model) {
        model.addAttribute("Listdata", lab8.findAll());
        model.addAttribute("message", "");
        return "warehouse/TrackingsStockList";
    }

    @RequestMapping(value = "/ToCheckstock")
    public String checkWarehouse(Model model, HttpServletRequest request) {
//        model.addAttribute("Listdata", lab6.findALl());
//        System.out.println("");
        String stockcard = request.getParameter("stockcard");
        if (stockcard == null) {
            return "redirect:page4";
        } else {
            List<Object[]> ssss = lab.FindALl(stockcard);
            List<WarehouseBean> lsittodata = new ArrayList<>();
            for (Object[] object : ssss) {
                String id = (String) object[0];
                int quantity = (int) object[2];
                String name = (String) object[1];
                WarehouseBean obecjt = new WarehouseBean(id, quantity, name);
                lsittodata.add(obecjt);
            }
            model.addAttribute("kho", stockcard);
            model.addAttribute("listItemStock", lsittodata);
            return "warehouse/TrackingsStock";
        }

//        return "redirect:page4";
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String welcome(Model model) {
//        model.addAttribute("Listdata", lab6.findALl());
//        System.out.println("");
        List<Object[]> ssss = lab.findAllWarehouse();
        List<WarehouseStock> lsittodata = new ArrayList<>();
        for (Object[] object : ssss) {
            String stock = (String) object[0];
            WarehouseStock obecjt = new WarehouseStock(stock);
            lsittodata.add(obecjt);
        }
        model.addAttribute("ListWarehouse", lsittodata);
        return "warehouse/welcome";
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

    @RequestMapping(value = "/stock/saveData", method = RequestMethod.POST)
    public String SaveData(@ModelAttribute("sockSlip") Checkstockslip sockSlip, Model model, HttpServletRequest request) {

        String stockcard = request.getParameter("kho");

        String[] idcode = request.getParameterValues("idcode");
        String[] quantity = request.getParameterValues("quantity");
        String[] realQuantity = request.getParameterValues("realQuantity");
        String[] BetweenRealAndStock = request.getParameterValues("BetweenRealAndStock");
        String[] explain = request.getParameterValues("explain");
        List<Checkslip> listArray = new ArrayList<>();
        String date = String.valueOf(java.time.LocalDate.now());
//        for (int i = 0; i < idcode.length; i++) {
//            System.out.println(idcode[i]);
//        }
        if (idcode == null) {
            return "redirect:/web/warehouse/page4";
        } else {
            Checkstockslip idobject = lab8.getLastId();
            if (idobject != null) {
                String idgen = idobject.toString();
                idgen = idgen.substring(2);
                int idstt = Integer.valueOf(idgen);
                idstt = idstt + 1;
                String str = "" + idstt;
                String pad = "KK0000";
                String ans = pad.substring(0, pad.length() - str.length()) + str;
                sockSlip.setId(ans);
            } else {
                //when data is null then add default value is Nk0000
                String idgen = "KK0000";
                idgen = idgen.substring(2);
                int idstt = Integer.valueOf(idgen);
                idstt = idstt + 1;
                String str = "" + idstt;
                String pad = "KK0000";
                String ans = pad.substring(0, pad.length() - str.length()) + str;
                sockSlip.setId(ans);
            }
            sockSlip.setDate(date);
            sockSlip.setWarehouse(stockcard);
            sockSlip.setStatus(Boolean.FALSE);
            sockSlip.setStatus2("NotComplete");
            Checkstockslip newSlip = lab8.Save(sockSlip);

            for (int i = 0; i < idcode.length; i++) {
                Checkslip newdata = new Checkslip();
                newdata.setGoodsId(idcode[i]);
                newdata.setDate(date);
                newdata.setQuantityinsystem(Integer.valueOf(quantity[i]));
                newdata.setQuantityireal(Integer.valueOf(realQuantity[i]));
                newdata.setDifference(Integer.valueOf(BetweenRealAndStock[i]));
                newdata.setExplain(explain[i]);
                newdata.setStatus(Boolean.FALSE);
                newdata.setCheckslipid(newSlip.getId());
                lab6.Save(newdata);
            }
            return "redirect:/web/warehouse/page4";
        }
    }

    @RequestMapping(value = "/stock/CanbangKho", method = RequestMethod.POST)
    public String CanbangKho(Model model, HttpServletRequest request) {

        String[] idcode = request.getParameterValues("goodsid");
        String[] quantityreal = request.getParameterValues("quantityireal");
        String[] quantityinsystem = request.getParameterValues("quantityinsystem");
        String[] difference = request.getParameterValues("difference");
        String warehouses = request.getParameter("warehouses");
        String[] identity = request.getParameterValues("identity");
        String datae = request.getParameter("datae");
        String codeIds2 = request.getParameter("codeCheckSlipId");

        Checkstockslip socklip = lab8.FindOne(codeIds2.trim());
        socklip.setDate(socklip.getDate());
        socklip.setWarehouse(socklip.getWarehouse());
        socklip.setStatus(Boolean.FALSE);
        socklip.setStatus2("Completed");
        lab8.Save(socklip);

        for (int i = 0; i < idcode.length; i++) {
            int different = Integer.valueOf(difference[i].trim());
            String coideId = idcode[i];

            Warehouse warehouselaydata = null;
            if (different == 0) {
                Warehouse warehouse2 = lab.findOnes(coideId.trim(), warehouses.trim());
                warehouse2.setGoodsId(coideId.trim());
                warehouse2.setGoodsName(warehouse2.getGoodsName());
                warehouse2.setUnit(warehouse2.getUnit());
                warehouse2.setQuantityInStock(warehouse2.getQuantityInStock());
                warehouse2.setImportPrice(warehouse2.getImportPrice());
                warehouse2.setSupplier(warehouse2.getSupplier());
                warehouse2.setPriceInStock(warehouse2.getPriceInStock());
                warehouse2.setGroupGoods(warehouse2.getGroupGoods());
                warehouse2.setWeight(warehouse2.getWeight());
                warehouse2.setStockCard(warehouse2.getStockCard());
                lab.Save(warehouse2);
            } else {
                Warehouse warehouse2 = lab.findOnes(coideId.trim(), warehouses.trim());
                warehouse2.setGoodsId(coideId.trim());
                warehouse2.setGoodsName(warehouse2.getGoodsName());
                warehouse2.setUnit(warehouse2.getUnit());
                warehouse2.setQuantityInStock(Integer.valueOf(quantityreal[i].trim()));
                warehouse2.setImportPrice(warehouse2.getImportPrice());
                warehouse2.setSupplier(warehouse2.getSupplier());
                warehouse2.setPriceInStock(warehouse2.getPriceInStock());
                warehouse2.setGroupGoods(warehouse2.getGroupGoods());
                warehouse2.setWeight(warehouse2.getWeight());
                warehouse2.setStockCard(warehouse2.getStockCard());
                warehouselaydata = lab.Save(warehouse2);
            }
            Checkslip slip = lab6.findOne(Integer.valueOf(identity[i].trim()));
            slip.setGoodsId(slip.getGoodsId());
            slip.setDate(datae);
            slip.setQuantityinsystem(Integer.valueOf(quantityinsystem[i].trim()));
            slip.setQuantityireal(Integer.valueOf(quantityreal[i].trim()));
            slip.setDifference(different);
            slip.setExplain(slip.getExplain());
            slip.setStatus(Boolean.TRUE);
            slip.setCheckslipid(slip.getCheckslipid());
            Checkslip ABC = lab6.Save(slip);

            if (different < 0) {
                int different1 = Integer.valueOf(difference[i].trim());
                Hisio historyabc = new Hisio();
                historyabc.setGoodsId(coideId.trim());

                String datesd = String.valueOf(java.time.LocalDate.now());
                historyabc.setDate(datesd);

                historyabc.setGoodsName(warehouselaydata.getGoodsName());
                historyabc.setQuantity(different1);
                historyabc.setPrice(warehouselaydata.getImportPrice());
                historyabc.setUnit(warehouselaydata.getUnit());
                historyabc.setWarehouse(warehouses.trim());
                historyabc.setLicense(ABC.getCheckslipid());
                historyabc.setMajor("Output");
                lab5.save(historyabc);
            } else {
                Hisio historyabc = new Hisio();
                historyabc.setGoodsId(coideId.trim());

                String datesd = String.valueOf(java.time.LocalDate.now());
                historyabc.setDate(datesd);

                historyabc.setGoodsName(warehouselaydata.getGoodsName());
                historyabc.setQuantity(different);
                historyabc.setPrice(warehouselaydata.getImportPrice());
                historyabc.setUnit(warehouselaydata.getUnit());
                historyabc.setWarehouse(warehouses.trim());
                historyabc.setLicense(ABC.getCheckslipid());
                historyabc.setMajor("Input");
                lab5.save(historyabc);
            }

//            slip.set(coideId.trim(), warehouses.trim());
        }

//        Checkstockslip newSlip = lab8.FindOne(sockSlip);
        return "redirect:/web/warehouse/page4";
    }

    @RequestMapping(value = "/stock/DoEdit", method = RequestMethod.POST)
    public String DoDelete(Model model, HttpServletRequest request) {
        String idcode = request.getParameter("idcode");
        String Dates = request.getParameter("Dates");
        String Warehouses = request.getParameter("Warehouses");
        Checkstockslip newdata = lab8.FindOne(idcode);
        newdata.setId(idcode);
        newdata.setDate(Dates);
        newdata.setWarehouse(Warehouses);
        newdata.setStatus(Boolean.TRUE);
        lab8.Save(newdata);
//        model.addAttribute("message", "Delete Success");
        return "redirect:/web/warehouse/page4";
    }
}




	
//
