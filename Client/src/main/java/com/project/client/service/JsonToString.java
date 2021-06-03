/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.client.service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author trung
 */
public class JsonToString {

    Client client = Client.create();

    WebResource webResource = client.resource("http://localhost:9999/phieu/phieuA");

    ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

    public void Get() {
        if (response.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            return;
        }
        String output = response.getEntity(String.class);

        System.out.println("Output from Server .... \n");
        System.out.println(output);
    }

    public static void main(String[] args) {
       JsonToString db = new JsonToString();
       db.Get();
    }

}
