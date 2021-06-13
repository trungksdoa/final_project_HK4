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
import fpt.aptech.project.Client.Models.Nhacungcap;
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
        //--------------
        //Get List
        //@Param
        //@Param
        //---------------
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

        //--------------
        //Get Object
        //@Param
        //@Param
        //---------------
        // Gửi yêu cầu với phương thức GET và Headers mặc định.
        HttpHeaders headers = new HttpHeaders();

        headers.setAccept(Arrays.asList(new MediaType[]{MediaType.APPLICATION_JSON}));
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

        //--------------
        //Put Object
        //@Param
        //@Param
        //---------------
//        Phieunhapxuat phieunhapxuat = new Phieunhapxuat();
//        phieunhapxuat.setMa("PhieuABC");
//        phieunhapxuat.setNgay("2012/01/05");
//        phieunhapxuat.setMa("PhieuABC");
//        phieunhapxuat.setDiachi("CauTieu");
//        phieunhapxuat.setKieuNhapHayXuat("Nhập");
//        phieunhapxuat.setNguoinhap("Admin");
//        phieunhapxuat.setKieuthanhtoan("Bán");
//        phieunhapxuat.setKho("Kho ABC");
//        phieunhapxuat.setOwed(999999);
//        phieunhapxuat.setDathanhtoanbaonhieutien(0);
//        phieunhapxuat.setNguoigiao("TrungDepTrai");
//        phieunhapxuat.setTinhtrangphieu("ABC");
//        phieunhapxuat.setChugiai("OK C????");
//
//        Nhacungcap ncc = new Nhacungcap();
//        ncc.setMa("ABC");
//        phieunhapxuat.setManhacungcap(ncc);
//
//
//        // Dữ liệu đính kèm theo yêu cầu.
//        HttpEntity<Phieunhapxuat> requestBody = new HttpEntity<>(phieunhapxuat);
//
//        // Gửi yêu cầu với phương thức POST.
//        ResponseEntity<Phieunhapxuat> sut
//                = restTemplate.postForEntity(URL, requestBody, Phieunhapxuat.class);
//
//        System.out.println("Status code:" + sut.getStatusCode());
//
//        // Code = 200.
//        if (sut.getStatusCode() == HttpStatus.OK) {
//            Phieunhapxuat e = sut.getBody();
//            System.out.println("(Client Side) Employee Created: " + e.getMa());
//        }
    }

}
