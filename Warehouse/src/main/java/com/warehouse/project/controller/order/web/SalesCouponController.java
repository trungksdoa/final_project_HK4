/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.order.web;

import com.warehouse.project.model.*;

import com.warehouse.project.service.order.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author lenovo
 */
@Controller
@RequestMapping("/salescoupon")
public class SalesCouponController {

    @Autowired
    ICustomerService customerService;
    @Autowired
    ISalesCouponContentService salesCouponContentService;
    @Autowired
    ISalesCouponService salesCouponService;
    @Autowired
    IVsalesCouponService vsalesCouponService;
    @Autowired
    IVQuotesService quotesServiec;
    @Autowired
    IQuotesContentService quotesContentService;

    @RequestMapping("/")
    public String page(Model model) {
        List<Customer> listCT = new ArrayList<>();
        for (Customer customer : customerService.getAllCustomer()) {
            if (customer.getStatus() == true) {
                listCT.add(customer);
            }
        }
        model.addAttribute("listSalesCoupon", salesCouponService.getListSalesCoupon());
        model.addAttribute("listCustomer", listCT);
        model.addAttribute("list", salesCouponContentService.getAllSalesCouponContent());

        int totalprice = 0;
        for (SalesCoupon listSalesCoupon : salesCouponService.getListSalesCoupon()) {
            totalprice += listSalesCoupon.getTatolPrice();
        }
        model.addAttribute("totalprice", totalprice);

        return "order/ListSalesCoupon";
    }

    @RequestMapping("/details")
    public String detail(Model model, @RequestParam(value = "id") String id) {
        SalesCoupon salesCoupon = salesCouponService.findOne(id);
        List<SalesCouponContent> list = salesCouponContentService.findBySalesCouponContentId(id);
        Customer customer = customerService.findOne(salesCoupon.getCustomerId());
        model.addAttribute("salesCoupon", salesCoupon);
        model.addAttribute("list", list);
        model.addAttribute("customer", customer);
        return "order/DetailsSalesCoupons";
    }

    @RequestMapping("/updatecircumstance")
    public String updatecircumstance(Model model,
            @RequestParam(value = "id") String id,
            @RequestParam(value = "title") String title) {
        model.addAttribute("id", id);
        model.addAttribute("title", title);
        SalesCoupon salesCoupon = salesCouponService.findOne(id);
        if (salesCoupon != null) {
            if (title.equals("xacnhan")) {
                salesCoupon.setCircumstance(2);
                salesCouponService.save(salesCoupon);
            } else if (title.equals("hoantat")) {
                salesCoupon.setCircumstance(3);
                salesCouponService.save(salesCoupon);
            } else if (title.equals("huy")) {
                salesCoupon.setCircumstance(4);
                salesCouponService.save(salesCoupon);
            }
            return "redirect:/salescoupon/";

        } else {
            return "order/index_5";
        }
    }

    @RequestMapping("/search")
    public String search(Model model,
            @RequestParam(value = "fromdate") String fromdate,
            @RequestParam(value = "todate") String todate,
            @RequestParam(value = "action") String action,
            @RequestParam(value = "Cname") String Cname,
            @RequestParam(value = "CId") String CId,
            @RequestParam(value = "circumstance") int circumstance) {
        if (action.equals("searchdate")) {

            List<SalesCoupon> lisSalesCoupon = new ArrayList<>();
            if (todate.isEmpty()) {
                lisSalesCoupon = salesCouponService.getByDate(fromdate);
                model.addAttribute("listSalesCoupon", lisSalesCoupon);
            } else if (todate.isEmpty() && fromdate.isEmpty()) {

                lisSalesCoupon = salesCouponService.getListSalesCoupon();
                model.addAttribute("listSalesCoupon", lisSalesCoupon);
            } else {
                lisSalesCoupon = salesCouponService.getByDate(fromdate, todate);
                model.addAttribute("listSalesCoupon", lisSalesCoupon);
            }
            model.addAttribute("listCustomer", customerService.getAllCustomer());
            model.addAttribute("list", salesCouponContentService.getAllSalesCouponContent());

            int totalprice = 0;
            for (SalesCoupon lisSalesCoupons : lisSalesCoupon) {
                totalprice += lisSalesCoupons.getTatolPrice();
            }
            model.addAttribute("totalprice", totalprice);

            return "order/ListSalesCoupon";
        } else if (action.equals("searchId")) {
            if (CId.isEmpty()) {
                return "redirect:/salescoupon/";
            } else {
                List<SalesCoupon> listSalesCoupon = salesCouponService.getLikeId('%' + CId + '%');
                model.addAttribute("listSalesCoupon", listSalesCoupon);
                model.addAttribute("listCustomer", customerService.getAllCustomer());
                model.addAttribute("list", salesCouponContentService.getAllSalesCouponContent());
                int totalprice = 0;
                for (SalesCoupon salesCoupon : listSalesCoupon) {
                    totalprice += salesCoupon.getTatolPrice();
                }
                model.addAttribute("totalprice", totalprice);
                return "order/ListSalesCoupon";
            }
        } else if (action.equals("searchstatus")) {
            if (circumstance == 0) {
                return "redirect:/salescoupon/";
            } else {
                List<SalesCoupon> listSalesCoupon = salesCouponService.getBycircumstance(circumstance);
                model.addAttribute("listSalesCoupon", listSalesCoupon);
                model.addAttribute("listCustomer", customerService.getAllCustomer());
                model.addAttribute("list", salesCouponContentService.getAllSalesCouponContent());
                int totalprice = 0;
                for (SalesCoupon salesCoupon : listSalesCoupon) {
                    totalprice += salesCoupon.getTatolPrice();
                }
                model.addAttribute("totalprice", totalprice);
                return "order/ListSalesCoupon";
            }
        } else if (action.equals("searchname")) {
            if (Cname.isEmpty()) {
                return "redirect:/salescoupon/";
            } else {
                List<Vsalescoupon> listsalescoupon = vsalesCouponService.getBySalescouponName('%' + Cname + '%');
                model.addAttribute("listSalesCoupon", listsalescoupon);
                model.addAttribute("listCustomer", customerService.getAllCustomer());
                model.addAttribute("list", salesCouponContentService.getAllSalesCouponContent());
                int totalprice = 0;
                for (Vsalescoupon listslcp : listsalescoupon) {
                    totalprice += listslcp.getTatolPrice();
                }
                model.addAttribute("totalprice", totalprice);

                return "order/ListSalesCoupon";
            }
        }
        return "order/index_5";
    }

    @ResponseBody
    @RequestMapping(value = "/quotes/")
    public ResponseEntity<List<VQuotes>> listVsalescoupon() {
        List<VQuotes> arralists1 = quotesServiec.getAllQuotes();

        if (!arralists1.isEmpty()) {

            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
    @ResponseBody
    @RequestMapping(value = "/quotescontent/")
    public ResponseEntity<List<Quotescontent>> listsalesCouponContent() {
        List<Quotescontent> arralists1 = quotesContentService.getAllQuotesContent();
        if (!arralists1.isEmpty()) {
            return new ResponseEntity<>(arralists1, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }
}
