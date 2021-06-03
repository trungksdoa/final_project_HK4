/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.client.service;

import com.project.client.model.Phieunhapxuat;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author trung
 */
public class GetJsonToList {

    ClientConfig clientConfig = new DefaultClientConfig();
//    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    // Tạo đối tượng Client dựa trên cấu hình.
    Client client = Client.create(clientConfig);

    WebResource webResource = client.resource("http://localhost:9999/phieu");

    Builder builder = webResource.accept(MediaType.APPLICATION_JSON) //
            .header("content-type", MediaType.APPLICATION_JSON);

    ClientResponse response = builder.get(ClientResponse.class);

    public void GetAll() {
        if (response.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
            return;
        }
        GenericType<List<Phieunhapxuat>> generic = new GenericType<List<Phieunhapxuat>>() {
            // No thing
        };
        List<Phieunhapxuat> list = response.getEntity(generic);

        System.out.println("Output from Server .... \n");

        for (Phieunhapxuat emp : list) {
            System.out.println(" --- ");
            System.out.println(emp);
        }
    }

    public static void main(String[] args) {
        GetJsonToList db = new GetJsonToList();
        db.GetAll();
    }
}
