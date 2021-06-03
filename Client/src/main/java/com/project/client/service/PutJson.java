/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.client.service;

import com.project.client.model.Nhacungcap;
import com.project.client.model.Phieunhapxuat;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author trung
 */
public class PutJson {

    Client client = Client.create();

    String id = "phieuD";
    WebResource webResource = client.resource("http://localhost:9999/phieu/" + id);

    // Dữ liệu gửi đi cùng request
    public void Post() {
        Phieunhapxuat post = new Phieunhapxuat();
        Nhacungcap ncc = new Nhacungcap();

        ncc.setMa("NCCA");
        post.setNgay("2020/02/05");
        post.setNhacungcap("NPP Bánh ngot");
        post.setDiachi("CMT8");
        post.setKieuNhapHayXuat("Nhap");
        post.setNguoinhap("Admin");
        post.setKieuthanhtoan("tienmat");
        post.setKho("Kho ABCD");
        post.setOwed(100000);
        post.setDathanhtoanbaonhieutien(5000);
        post.setNguoigiao("Trung");
        post.setTinhtrangphieu("Chuahoangthanh");
        post.setChugiai("Nhap kho banh ngot");
        post.setManhacungcap(ncc);
        ClientResponse response = webResource.type("application/json").put(ClientResponse.class, post);

        if (response.getStatus() != 200 && response.getStatus() != 201) {
            System.out.println("Failed : HTTP error code : " + response.getStatus());

            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            return;
        }
        System.out.println("Success : HTTP sucess code : " + response.getStatus());
        System.out.println("Output from Server .... \n");

        String output = response.getEntity(String.class);

        System.out.println(output);
    }

    public static void main(String[] args) {
        PutJson db = new PutJson();
        db.Post();
    }
}
