/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warehouse.project.controller.warehouse.api;

/**
 *
 * @author trung
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testpacsd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher("NK0000");
        while (m.find()) {
            System.out.println(m.group());
        }
        String idgen = "NK0000";
        idgen = idgen.substring(2);
        int idstt = Integer.valueOf(idgen);
        idstt = idstt + 1;
        String str = "" + idstt;
        String pad = "NK0000";
        String ans = pad.substring(0, pad.length() - 1) + str + "_NCC";
        System.out.println(ans);
        System.out.println(pad.length());
    }

}
