package com.warehouse.project.controller.order.web;

import com.warehouse.project.model.*;

import com.warehouse.project.service.order.IAccountService;
import com.warehouse.project.service.order.ICustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.warehouse.project.service.order.IGoodsCategoryService;
import com.warehouse.project.service.order.ISalesCouponContentService;
import com.warehouse.project.service.order.ISalesCouponService;
import com.warehouse.project.service.order.IVWarehouseService;
import java.util.Calendar;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author lenovo
 */
@Controller
@RequestMapping("/salescouponcontent")
public class SalesCouponContentController {

    @Autowired
    ICustomerService customerService;
    @Autowired
    IAccountService accountService;
    @Autowired
    IGoodsCategoryService goodsCategoryService;
    @Autowired
    IVWarehouseService vWarehouseService;
    @Autowired
    ISalesCouponService salesCouponService;
    @Autowired
    ISalesCouponContentService salesCouponContentService;

    @RequestMapping("/")
    public String page(Model model) {
        return "order/Salescoupon";
    }

    @ResponseBody
    @RequestMapping(value = "/vwarehouse/")
    public ResponseEntity<List<VWarehouse>> listvwarehouse() {

        List<VWarehouse> arralists1 = vWarehouseService.getAllWarehouse();

        if (!arralists1.isEmpty()) {

            return new ResponseEntity<>(arralists1, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(Model model, @RequestParam(value = "date") String date,
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
            @RequestParam(value = "total_SL") int total_SL,
            @RequestParam(value = "GG") int GG,
            @RequestParam(value = "TGG") int TGG,
            @RequestParam(value = "action") String action,
            @RequestParam(value = "goods_id[]") String[] goods_id,
            @RequestParam(value = "paid") int paid,
            @RequestParam(value = "salescouponId") String salescouponId,
            @RequestParam(value = "payments") String payments,
            @RequestParam(value = "owed") int owed,
            @RequestParam(value = "quotes") int quotes
    ) {

        Calendar cal = Calendar.getInstance();
        List<SalesCoupon> listSalesCoupon = salesCouponService.getListSalesCoupon();
        String[] output = listSalesCoupon.get(listSalesCoupon.size() - 1).getId().split("/");
        int month = cal.get(Calendar.MONTH) + 1;
        String Month = " ";
        if (month < 10) {
            Month = "0" + month;
        } else {
            Month = "" + month;
        }
        int lastoupt = Integer.parseInt(output[1]) + 1;
        String lastr = "";
        if (Integer.parseInt(output[0].substring(2, 4)) < month) {
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

        String s = "SQ" + Month + cal.get(Calendar.YEAR) + "/" + lastr;
        if (quotes == 2) {

            if (action.equals("luu")) {
                SalesCoupon salesCoupon = new SalesCoupon();
                salesCoupon.setId(s);
                salesCoupon.setDate(date);
                salesCoupon.setCustomerId(customerId);
                salesCoupon.setAddress(address);
                salesCoupon.setPhone(phone.trim());
                salesCoupon.setSeller(creator);
                salesCoupon.setReceiver(receiver.trim());
                salesCoupon.setExpain(explain.trim());
                salesCoupon.setTotalquantity(total_SL);
                salesCoupon.setTotalDiscount(GG);
                salesCoupon.setCircumstance(1);
                salesCoupon.setStatus(true);
                salesCoupon.setPayments(payments);
                salesCoupon.setPaid(paid);
                salesCoupon.setOwed(owed);
                salesCoupon.setTatolPrice(lasted_price);
                salesCoupon.setLastedPrice(TGG);
                salesCouponService.save(salesCoupon);

                for (int i = 0; i < cnt; i++) {
                    SalesCouponContent salesCouponContent = new SalesCouponContent();
                    salesCouponContent.setGoodsId(goods_id[i]);
                    salesCouponContent.setGoodsName(goods_name[i]);
                    salesCouponContent.setUnit(unit[i]);
                    salesCouponContent.setQuantity(quantity[i]);
                    salesCouponContent.setUnitPrice(gprice[i]);
                    salesCouponContent.setStatus(true);
                    salesCouponContent.setAfterpirce(afterpirce[i]);
                    salesCouponContent.setDiscount(discount[i]);
                    salesCouponContent.setDiscoutPrice((afterpirce[i] / 100) * discount[i]);
                    salesCouponContent.setSalesCouponId(s);
                    salesCouponContentService.save(salesCouponContent);
                }
                return "redirect:/salescoupon/";

            } else {
                SalesCoupon salesCoupon = new SalesCoupon();
                salesCoupon.setId(s);
                salesCoupon.setDate(date);
                salesCoupon.setCustomerId(customerId);
                salesCoupon.setAddress(address);
                salesCoupon.setPhone(phone.trim());
                salesCoupon.setSeller(creator);
                salesCoupon.setReceiver(receiver.trim());
                salesCoupon.setExpain(explain.trim());
                salesCoupon.setTotalquantity(total_SL);
                salesCoupon.setTotalDiscount(GG);
                salesCoupon.setCircumstance(1);
                salesCoupon.setStatus(true);
                salesCoupon.setPayments(payments);
                salesCoupon.setPaid(paid);
                salesCoupon.setOwed(owed);
                salesCoupon.setTatolPrice(lasted_price);
                salesCoupon.setLastedPrice(TGG);
                salesCouponService.save(salesCoupon);

                for (int i = 0; i < cnt; i++) {
                    SalesCouponContent salesCouponContent = new SalesCouponContent();
                    salesCouponContent.setGoodsId(goods_id[i]);
                    salesCouponContent.setGoodsName(goods_name[i]);
                    salesCouponContent.setUnit(unit[i]);
                    salesCouponContent.setQuantity(quantity[i]);
                    salesCouponContent.setUnitPrice(gprice[i]);
                    salesCouponContent.setStatus(true);
                    salesCouponContent.setAfterpirce(afterpirce[i]);
                    salesCouponContent.setDiscount(discount[i]);
                    salesCouponContent.setDiscoutPrice((afterpirce[i] / 100) * discount[i]);
                    salesCouponContent.setSalesCouponId(s);
                    salesCouponContentService.save(salesCouponContent);
                }

                SalesCoupon scp = salesCouponService.findOne(s);
                List<SalesCouponContent> list = salesCouponContentService.findBySalesCouponContentId(s);
                Customer customer = customerService.findOne(salesCoupon.getCustomerId());
                model.addAttribute("salesCoupon", scp);
                model.addAttribute("list", list);
                model.addAttribute("customer", customer);
                return "order/DetailsSalesCoupon";

            }
        } else {
            if (action.equals("luu")) {
                SalesCoupon salesCoupon = new SalesCoupon();
                salesCoupon.setId(s);
                salesCoupon.setDate(date);
                salesCoupon.setCustomerId(customerId);
                salesCoupon.setAddress(address);
                salesCoupon.setPhone(phone.trim());
                salesCoupon.setSeller(creator);
                salesCoupon.setReceiver(receiver.trim());
                salesCoupon.setExpain(explain.trim());
                salesCoupon.setTotalquantity(total_SL);
                salesCoupon.setTotalDiscount(GG);
                salesCoupon.setCircumstance(1);
                salesCoupon.setStatus(true);
                salesCoupon.setPayments(payments);
                salesCoupon.setQuotesId(salescouponId);
                salesCoupon.setPaid(paid);
                salesCoupon.setOwed(owed);
                salesCoupon.setTatolPrice(lasted_price);
                salesCoupon.setLastedPrice(TGG);
                salesCouponService.save(salesCoupon);

                for (int i = 0; i < cnt; i++) {
                    SalesCouponContent salesCouponContent = new SalesCouponContent();
                    salesCouponContent.setGoodsId(goods_id[i]);
                    salesCouponContent.setGoodsName(goods_name[i]);
                    salesCouponContent.setUnit(unit[i]);
                    salesCouponContent.setQuantity(quantity[i]);
                    salesCouponContent.setUnitPrice(gprice[i]);
                    salesCouponContent.setStatus(true);
                    salesCouponContent.setAfterpirce(afterpirce[i]);
                    salesCouponContent.setDiscount(discount[i]);
                    salesCouponContent.setDiscoutPrice((afterpirce[i] / 100) * discount[i]);
                    salesCouponContent.setSalesCouponId(s);
                    salesCouponContentService.save(salesCouponContent);
                }
                return "redirect:/salescoupon/";

            } else {
                SalesCoupon salesCoupon = new SalesCoupon();
                salesCoupon.setId(s);
                salesCoupon.setDate(date);
                salesCoupon.setCustomerId(customerId);
                salesCoupon.setAddress(address);
                salesCoupon.setPhone(phone.trim());
                salesCoupon.setSeller(creator);
                salesCoupon.setReceiver(receiver.trim());
                salesCoupon.setExpain(explain.trim());
                salesCoupon.setTotalquantity(total_SL);
                salesCoupon.setTotalDiscount(GG);
                salesCoupon.setCircumstance(1);
                salesCoupon.setStatus(true);
                salesCoupon.setPayments(payments);
                salesCoupon.setQuotesId(salescouponId);
                salesCoupon.setPaid(paid);
                salesCoupon.setOwed(owed);
                salesCoupon.setTatolPrice(lasted_price);
                salesCoupon.setLastedPrice(TGG);
                salesCouponService.save(salesCoupon);

                for (int i = 0; i < cnt; i++) {
                    SalesCouponContent salesCouponContent = new SalesCouponContent();
                    salesCouponContent.setGoodsId(goods_id[i]);
                    salesCouponContent.setGoodsName(goods_name[i]);
                    salesCouponContent.setUnit(unit[i]);
                    salesCouponContent.setQuantity(quantity[i]);
                    salesCouponContent.setUnitPrice(gprice[i]);
                    salesCouponContent.setStatus(true);
                    salesCouponContent.setAfterpirce(afterpirce[i]);
                    salesCouponContent.setDiscount(discount[i]);
                    salesCouponContent.setDiscoutPrice((afterpirce[i] / 100) * discount[i]);
                    salesCouponContent.setSalesCouponId(s);
                    salesCouponContentService.save(salesCouponContent);
                }

                SalesCoupon scp = salesCouponService.findOne(s);
                List<SalesCouponContent> list = salesCouponContentService.findBySalesCouponContentId(s);
                Customer customer = customerService.findOne(salesCoupon.getCustomerId());
                model.addAttribute("salesCoupon", scp);
                model.addAttribute("list", list);
                model.addAttribute("customer", customer);
                return "order/DetailsSalesCoupon";

            }
        }

    }

    @RequestMapping("/doedit")
    public String doedit(Model model,
        @RequestParam(value = "id") String id) {
        SalesCoupon salesCoupon = salesCouponService.findOne(id);
        List<SalesCouponContent> list = salesCouponContentService.findBySalesCouponContentId(id);
        Customer customer = customerService.findOne(salesCoupon.getCustomerId());
        model.addAttribute("salesCoupon", salesCoupon);
        model.addAttribute("list", list);
        model.addAttribute("customer", customer);
          model.addAttribute("check", "yes");
        return "order/EditSalesCoupon";
    }

}
