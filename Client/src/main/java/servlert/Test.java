/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlert;

/**
 *
 * @author trung
 */
import fpt.aptech.project.Client.Models.Phieunhapxuat;
import java.util.Arrays;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
public class Test {

    private static final String URL = "http://localhost:9999/trung";
    private static final String URL_ONE = "http://localhost:9999/trung/phieuA";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
 
        // Gửi yêu cầu với phương thức GET và Headers mặc định.
        Phieunhapxuat result = restTemplate.getForObject(URL_ONE, Phieunhapxuat.class);
 
        System.out.println(result);
    }

}
