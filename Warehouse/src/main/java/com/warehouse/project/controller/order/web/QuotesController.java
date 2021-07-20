/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.order.web;

import com.warehouse.project.model.*;
import com.warehouse.project.model.VQuotesContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.warehouse.project.service.order.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;


/**
 *
 * @author lenovo
 */
@Controller
@RequestMapping("/quotes")
public class QuotesController {

    @Autowired
    IQuotesServiec quotesServiec;
    @Autowired
    ICustomerService customerService;
    @Autowired
    IQuotesContentService quotesContentService;
    @Autowired
    IVQuotesContentService VQuotesContentService;
    @Autowired
    IVQuotesService vQuotesService;
//    @Autowired
//    WriteExcelExampleService writeExcelExampleService;

    @RequestMapping("/")
    public String page(Model model) {
        
        List<Customer>listCT = new ArrayList<>();
        for (Customer customer : customerService.getAllCustomer()) {
            if(customer.getStatus()==true){
                listCT.add(customer);
            }
        }
        model.addAttribute("listQuotes", quotesServiec.getListQuotes());
        model.addAttribute("listCustomer",listCT);
        model.addAttribute("list", quotesContentService.getAllQuotesContent());

//        List <VQuotesContent>list = VQuotesContentService.getAllVQuotesContent();
//            model.addAttribute("list", list);
        int totalprice = 0;
        for (Quotes listQuote : quotesServiec.getListQuotes()) {
            totalprice += listQuote.getTatolPrice();
        }
        model.addAttribute("totalprice", totalprice);

        return "order/ListQuotes";
    }

    @RequestMapping("/details")
    public String detail(Model model, @RequestParam(value = "id") String id) {
        Quotes quotes = quotesServiec.findOne(id);
        List<Quotescontent> list = quotesContentService.findByQuotesId(id);
        Customer customer = customerService.findOne(quotes.getCustomerId());
        model.addAttribute("quotes", quotes);
        model.addAttribute("list", list);
        model.addAttribute("customer", customer);

        return "order/DetailsQuotes";
    }

    @RequestMapping("/search")
    public String search(Model model, 
            @RequestParam(value = "fromdate") String fromdate,
            @RequestParam(value = "todate") String todate, 
            @RequestParam(value = "action") String action,
            @RequestParam(value = "Cname") String Cname,
            @RequestParam(value = "CId") String CId) {
        if (action.equals("searchdate")) {
            
            List<Quotes>lisquotes = new ArrayList<>();
       if(todate.isEmpty()){
          lisquotes = quotesServiec.getByDate(fromdate);
            model.addAttribute("listQuotes", lisquotes);
       }else if(todate.isEmpty()&& fromdate.isEmpty()){
           
          lisquotes = quotesServiec.getListQuotes();
            model.addAttribute("listQuotes", lisquotes); 
       }
       else{
        lisquotes = quotesServiec.getByDate(fromdate, todate);
            model.addAttribute("listQuotes",lisquotes);
       }
                model.addAttribute("listCustomer", customerService.getAllCustomer());
                model.addAttribute("list", quotesContentService.getAllQuotesContent());

                int totalprice = 0;
                for (Quotes listQuote : lisquotes) {
                    totalprice += listQuote.getTatolPrice();
                 }
                model.addAttribute("totalprice", totalprice);

                return "order/ListQuotes";
           

        } else if (action.equals("searchname")) {
            if (Cname.isEmpty()) {
                return "redirect:/quotes/";
            } else {
                List<VQuotes> listQuotes = vQuotesService.getByQuotesName('%' + Cname + '%');
                model.addAttribute("listQuotes", listQuotes);
                model.addAttribute("listCustomer", customerService.getAllCustomer());
                model.addAttribute("list", quotesContentService.getAllQuotesContent());
                int totalprice = 0;
                for (VQuotes lQuote : listQuotes) {
                    totalprice += lQuote.getTatolPrice();
                }
                model.addAttribute("totalprice", totalprice);

                return "order/ListQuotes";
            }
        }else if(action.equals("searchId")){
            if(CId.isEmpty()){
               return "redirect:/quotes/"; 
            }else{
               List<Quotes> listQuotes = quotesServiec.getLikeId('%' + CId + '%');
                model.addAttribute("listQuotes", listQuotes);
                model.addAttribute("listCustomer", customerService.getAllCustomer());
                model.addAttribute("list", quotesContentService.getAllQuotesContent());
                int totalprice = 0;
                for (Quotes quotes : listQuotes) {
                    totalprice += quotes.getTatolPrice();
                }
                model.addAttribute("totalprice", totalprice);
                return "order/ListQuotes";  
            }
        }
        else {
            return "order/ListQuotes";
        }

    }
    @RequestMapping("/doedit")
    public String doedit(Model model, @RequestParam(value = "id") String id) {
        Quotes quotes = quotesServiec.findOne(id);
        List<Quotescontent> list = quotesContentService.findByQuotesId(id);
        Customer customer = customerService.findOne(quotes.getCustomerId());
        model.addAttribute("quotes", quotes);
        model.addAttribute("list", list);
        model.addAttribute("customer", customer);
        model.addAttribute("check", "yes");

        return "order/EditQuotes";
    }


}
