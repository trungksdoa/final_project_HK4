/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.testapi;


import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author trung
 */
public class Delete {

    Client client = Client.create();

    String id = "phieuD";

   WebResource webResource = client.resource("http://localhost:9999/phieu/phieuD");
     public void Post() {
        ClientResponse response = webResource.delete(ClientResponse.class);

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

    // Dữ liệu gửi đi cùng request
    public static void main(String[] args) {
        Delete db = new Delete();
        
        db.Post();
    }
}
