/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.order.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.warehouse.project.model.*;
import com.warehouse.project.service.order.*;
import java.util.ArrayList;
import java.util.Calendar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lenovo
 */
@Controller
@RequestMapping("/quotescontent")
public class QuotesContentController {

    @Autowired
    IQuotesContentService quotesContentService;
    @Autowired
    IQuotesServiec quotesServiec;
    @Autowired
    ICustomerService customerService;
    @Autowired
    IAccountService accountService;
    @Autowired
    IGoodsCategoryService goodsCategoryService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String page(Model model) {
        return "order/CreateQuotes";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model,
            @RequestParam(value = "id") String id,
            @RequestParam(value = "check") String check,
            @RequestParam(value = "date") String date,
            @RequestParam(value = "customerId") String customerId,
            @RequestParam(value = "address") String address,
            @RequestParam(value = "phone") String phone,
            @RequestParam(value = "creator") String creator,
            @RequestParam(value = "receiver") String receiver,
            @RequestParam(value = "explain") String explain,
            @RequestParam(value = "goods_name[]") String[] goods_name,
            @RequestParam(value = "unit[]") String[] unit,
            @RequestParam(value = "quantity[]") int[] quantity,
            @RequestParam(value = "gprice[]") int[] gprice,
            @RequestParam(value = "discount[]") int[] discount,
            @RequestParam(value = "afterpirce[]") int[] afterpirce,
            @RequestParam(value = "lasted_price") int lasted_price,
            @RequestParam(value = "cnt") int cnt,
            @RequestParam(value = "total_SL") int total_SL, @RequestParam(value = "GG") int GG,
            @RequestParam(value = "TGG") int TGG,
            @RequestParam(value = "action") String action,
            @RequestParam(value = "goods_id[]") String[] goods_id) {

        Calendar cal = Calendar.getInstance();

        List<Quotes> listQuotes = quotesServiec.getListQuotes();

        String[] output = listQuotes.get(listQuotes.size() - 1).getId().split("/");

        int month = cal.get(Calendar.MONTH) + 1;
        String Month = " ";
        if (month < 10) {
            Month = "0" + month;
        } else {
            Month = "" + month;
        }

        int lastoupt = Integer.parseInt(output[1]) + 1;
        String lastr = "";
        if (Integer.parseInt(output[0].substring(1, 3)) < month) {
            lastr = "0001";
        } else {
            if (lastoupt < 10) {
                lastr = "000" + lastoupt;
            } else if (lastoupt >= 10 && lastoupt < 100) {
                lastr = "00" + lastoupt;
            } else if (lastoupt >= 100 && lastoupt < 1000) {
                lastr = "0" + lastoupt;
            }
        }
        String s = "";
        if (action.equals("luu")) {

            if (check.equals("yes")) {
                for (Quotescontent q : quotesContentService.findByQuotesId(id)) {
                    quotesContentService.DeleteQuotesContent(q);
                }
                s = id;
            } else {
                s = "Q" + Month + cal.get(Calendar.YEAR) + "/" + lastr;
            }
            Quotes quotes = new Quotes();
            quotes.setId(s);
            quotes.setDate(date);
            quotes.setCustomerId(customerId);
            quotes.setAddress(address);
            quotes.setPhone(phone.trim());
            quotes.setCreator(creator);
            quotes.setReceiver(receiver.trim());
            quotes.setExplain(explain.trim());
            quotes.setTotalquantity(total_SL);
            quotes.setTotalDiscount(GG);
            quotes.setTatolPrice(lasted_price);
            quotes.setLastedPrice(TGG);
            quotesServiec.save(quotes);

            for (int i = 0; i < cnt; i++) {
                Quotescontent a = new Quotescontent();
                GoodsCatagory g0Catagory = new GoodsCatagory();
                g0Catagory.setId(goods_id[i]);
                a.setGoodsId(g0Catagory);
                a.setGoodsName(goods_name[i]);
                a.setUnit(unit[i]);
                a.setQuantity(quantity[i]);
                a.setGoodsPrice(gprice[i]);
                a.setAfterpirce(afterpirce[i]);
                a.setDiscount(discount[i]);
                a.setLastedPrice((afterpirce[i] / 100) * discount[i]);
                Quotes quotes1s = new Quotes();
                quotes1s.setId(s);
                a.setQuotesid(quotes1s);
                quotesContentService.save(a);
            }
            return "redirect:/quotes/";

        } else {
            if (check.equals("yes")) {
                for (Quotescontent q : quotesContentService.findByQuotesId(id)) {
                    quotesContentService.DeleteQuotesContent(q);
                }

                s = id;
            } else {
                s = "Q" + Month + cal.get(Calendar.YEAR) + "/" + lastr;
            }
            Quotes quotes = new Quotes();
            quotes.setId(s);
            quotes.setDate(date);
            quotes.setCustomerId(customerId);
            quotes.setAddress(address);
            quotes.setPhone(phone.trim());
            quotes.setCreator(creator);
            quotes.setReceiver(receiver.trim());
            quotes.setExplain(explain.trim());
            quotes.setTotalquantity(total_SL);
            quotes.setTotalDiscount(GG);
            quotes.setTatolPrice(lasted_price);
            quotes.setLastedPrice(TGG);
            quotesServiec.save(quotes);
            for (int i = 0; i < cnt; i++) {
                Quotescontent a = new Quotescontent();
                GoodsCatagory g0Catagory = new GoodsCatagory();
                g0Catagory.setId(goods_id[i]);
                a.setGoodsId(g0Catagory);
                a.setGoodsName(goods_name[i]);
                a.setUnit(unit[i]);
                a.setQuantity(quantity[i]);
                a.setGoodsPrice(gprice[i]);
                a.setAfterpirce(afterpirce[i]);
                a.setDiscount(discount[i]);
                a.setLastedPrice((afterpirce[i] / 100) * discount[i]);
                Quotes quotes1s = new Quotes();
                quotes1s.setId(s);
                a.setQuotesid(quotes1s);
                quotesContentService.save(a);
            }
            Quotes q = quotesServiec.findOne(s);
            List<Quotescontent> list = quotesContentService.findByQuotesId(s);
            Customer customer = customerService.findOne(quotes.getCustomerId());
            model.addAttribute("quotes", q);
            model.addAttribute("list", list);
            model.addAttribute("customer", customer);

            return "order/DetailQuotes";
        }

    }

    @ResponseBody
    @RequestMapping(value = "/customer/")
    public ResponseEntity<List<Customer>> listGoods() {
        List<Customer> arralists1 = new ArrayList<>();
        for (Customer customer : customerService.getAllCustomer()) {
            if (customer.getStatus() == true) {
                arralists1.add(customer);
            }

        }

        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/account/")

    public ResponseEntity<List<Account>> listAccount() {
        List<Account> arralists1 = accountService.getAllAccount();
        //        Catagoryvoucher addArrray = new Catagoryvoucher();
        if (!arralists1.isEmpty()) {

            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/product/")
    public ResponseEntity<List<GoodsCatagory>> listProduct() {
        List<GoodsCatagory> arralists1 = goodsCategoryService.getAllGoodcategory();

        if (!arralists1.isEmpty()) {

            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
