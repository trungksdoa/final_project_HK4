/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllDAO.trung;

import com.project.client.model.Nhacungcap;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author trung
 */
public class NhacungcapDAO {

    ClientConfig clientConfig = new DefaultClientConfig();
//    clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
    // Tạo đối tượng Client dựa trên cấu hình.
    Client client = Client.create(clientConfig);

    WebResource webResource = client.resource("http://localhost:9999/nhacungcap");

    WebResource.Builder builder = webResource.accept(MediaType.APPLICATION_JSON) //
            .header("content-type", MediaType.APPLICATION_JSON);

    ClientResponse response = builder.get(ClientResponse.class);

    public List<Nhacungcap> GetAll() {
        if (response.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response.getStatus());
            String error = response.getEntity(String.class);
            System.out.println("Error: " + error);
        }
        GenericType<List<Nhacungcap>> generic = new GenericType<List<Nhacungcap>>() {
            // No thing
        };
        List<Nhacungcap> list = response.getEntity(generic);

        List<Nhacungcap> finalist = new ArrayList<>();
        for (Nhacungcap emp : list) {
            finalist.add(emp);
        }
        System.out.println("Output from Server .... \n");

        return finalist;
    }

    public List<Nhacungcap> SearchByName(String id) {

        WebResource webResource1 = client.resource("http://localhost:9999/nhacungcap/findbyName/" + id);

        WebResource.Builder builder1 = webResource.accept(MediaType.APPLICATION_JSON) //
                .header("content-type", MediaType.APPLICATION_JSON);

        ClientResponse response1 = builder.get(ClientResponse.class);

        if (response1.getStatus() != 200) {
            System.out.println("Failed with HTTP Error code: " + response1.getStatus());
            String error = response1.getEntity(String.class);
            System.out.println("Error: " + error);
        }
        GenericType<List<Nhacungcap>> generic = new GenericType<List<Nhacungcap>>() {
            // No thing
        };
        List<Nhacungcap> list = response1.getEntity(generic);

        List<Nhacungcap> finalist = new ArrayList<>();
        for (Nhacungcap emp : list) {
            finalist.add(emp);
        }
        System.out.println("Output from Server .... \n");

        return finalist;
    }
//

    public static void main(String[] args) {
        NhacungcapDAO db = new NhacungcapDAO();
        List<Nhacungcap> listss = db.SearchByName("N");

        for (Nhacungcap emp : listss) {
            System.out.println(" --- ");
            System.out.println(emp);
        }
    }
}
