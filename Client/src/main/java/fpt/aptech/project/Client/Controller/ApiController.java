/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpt.aptech.project.Client.Controller;

import fpt.aptech.project.Client.Models.Phieunhapxuat;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author PC
 */
@RestController
public class ApiController {

    @Autowired
    private RestTemplate restTemplate;

    private static final String URL = "http://localhost:8888/trung";
    private static final String URL_ONE = "http://localhost:8888/trung/phieuA";
    // get All
    @GetMapping()
    public List<Object> getPhieunhapxuat() {
        Object[] pnx = restTemplate.getForObject(URL, Object[].class);
        return Arrays.asList(pnx);
    }

    // Get One
    @GetMapping("/{id}")
    public Object getOnePhieunhapxuat(String id) {
        // Ở đây tui test với phiếu mặc định là Phiếu A qua URL_ONE sau này mọi người dùng ID tự thay đổi khi get
        Object pnx1 = restTemplate.getForObject(URL_ONE, Object.class);
        return pnx1;
    }
    // POST
    @PostMapping("/{id}")
    public boolean PostPhieunhapxuat() {
    // Tạo một phiếu nhập mới tự thêm dữ liệu nha
    Phieunhapxuat p = new Phieunhapxuat();
    // Dữ liệu đính kèm theo yêu cầu.
    HttpEntity<Phieunhapxuat> requestBody = new HttpEntity<>(p);
    // Gửi yêu cầu với phương thức POST.
    ResponseEntity<Phieunhapxuat> result
    = restTemplate.postForEntity(URL, requestBody, Phieunhapxuat.class);
        // nếu thành công !Code = 200!
        return result.getStatusCode() == HttpStatus.OK;
    }
    //Delete
    @DeleteMapping("/{id}")
    public Phieunhapxuat DeletePhieunhapxuat(String id) {
    // Test Delete
    Phieunhapxuat p = (Phieunhapxuat) getOnePhieunhapxuat(id);
    String resourceUrl = "http://localhost:8888/trung/" + p.getMa(); // get ID cần DELETE qua getone ở trên
    // Gửi yêu cầu với phương thức DELETE.
    restTemplate.delete(resourceUrl);

    return null; // này t lười ktra nào rãnh tự viết thêm
    }
    //PUT
    @PutMapping("/{id}")
    public boolean PutPhieunhapxuat(String id) {
    // gọi get one để tìm phiếu nhập xuất cần lấy gán cho p
    Phieunhapxuat p = (Phieunhapxuat) getOnePhieunhapxuat(id);
    //
    HttpHeaders headers = new HttpHeaders();
    headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
    // Dữ liệu đính kèm theo yêu cầu.
    HttpEntity<Phieunhapxuat> requestBody = new HttpEntity<>(p, headers);
    
    // Gửi yêu cầu với phương thức PUT.
    restTemplate.put(URL, requestBody, new Object[] {});
    
    String resourceUrl = URL + "/" + p.getMa();
    
    Phieunhapxuat pnx = restTemplate.getForObject(resourceUrl, Phieunhapxuat.class);
    // ktra
    return pnx != null; // giải thích: nếu pnx != null trả về true ngược lại trả về false
    }
}
