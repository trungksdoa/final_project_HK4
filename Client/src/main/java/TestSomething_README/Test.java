/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSomething_README;

/**
 *
 * @author trung
 */
import fpt.aptech.project.Client.Models.Dichvuhanghoa;
import fpt.aptech.project.Client.Models.NoidungNhapxuat;
import fpt.aptech.project.Client.Models.Phieunhapxuat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Test {

    private static final String URL = "http://localhost:9999/trung";
    private static final String URL_ONE = "http://localhost:9999/trung/phieuA";

    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();

        // Gửi yêu cầu với phương thức GET và Headers mặc định.
        Phieunhapxuat[] list = restTemplate.getForObject(URL, Phieunhapxuat[].class);

        if (list != null) {
            for (Phieunhapxuat e : list) {
                 Collection<NoidungNhapxuat> noidung = e.getNoidungNhapxuatCollection();
                
                System.out.println("Sticket: " + e.getMa());
                 System.out.println(noidung);
                 System.out.println("-----------------------");
            }
        }
 
 
        // Gửi yêu cầu với phương thức GET và Headers mặc định.
          HttpHeaders headers = new HttpHeaders();
 
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Yêu cầu trả về định dạng JSON
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("my_other_key", "my_other_value");
 
        // HttpEntity<String>: To get result as String.
        HttpEntity<String> entity = new HttpEntity<String>(headers);
 
 
        // Gửi yêu cầu với phương thức GET, và các thông tin Headers.
        ResponseEntity<Phieunhapxuat> response = restTemplate.exchange(URL_ONE, //
                HttpMethod.GET, entity, Phieunhapxuat.class);
 
        Phieunhapxuat result = response.getBody();
        List<NoidungNhapxuat> noidung = (List<NoidungNhapxuat>) result.getNoidungNhapxuatCollection();
        for (NoidungNhapxuat noidungNhapxuat : noidung) {
            System.out.println(noidungNhapxuat);
        }
        System.out.println(result);
    }

}
