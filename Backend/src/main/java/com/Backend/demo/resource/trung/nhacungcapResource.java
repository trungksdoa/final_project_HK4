package com.Backend.demo.resource.trung;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

import com.Backend.demo.model.trung.Nhacungcap;
import com.Backend.demo.model.ConvertToArraylist_Nhacungcaps;
import com.Backend.demo.model.trung.Khachhang;
import com.Backend.demo.service.trung.Dichvunhacungcap;
import java.util.List;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "nhacungcap")
@Path("/nhacungcap")
public class nhacungcapResource {

    @Autowired
    private Dichvunhacungcap service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ConvertToArraylist_Nhacungcaps getAll() {
        ConvertToArraylist_Nhacungcaps convert = new ConvertToArraylist_Nhacungcaps();
        ArrayList<Nhacungcap> nhacungcaps = (ArrayList<Nhacungcap>) service.laynhieunhacungcap();
        convert.nhacungcaparray(nhacungcaps);
        return convert;
    }

    @POST
    @Consumes("application/json")
    public Response create(Nhacungcap nhacungcap) throws URISyntaxException {

        nhacungcap = service.taonhacungcap(nhacungcap);
        return Response.status(201)
                .entity("tao thanh cong voi id la = " + nhacungcap.getMa())
                .contentLocation(new URI("/nhacungcap/" + nhacungcap.getMa())).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateEmployee(@PathParam("id") String id, Nhacungcap nhacungcap)
            throws URISyntaxException {
        boolean isEmployeeExist = service.kiemtratontai(id);
        if (isEmployeeExist) {
            nhacungcap.setMa(id);;
            service.Capnhatnhacungcap(nhacungcap);
            return Response.status(200).entity("Cap nhat cong").build();
        } else {
            return Response.status(404).entity("khong tim thay nhac cung cap").build();
        }

    }

    @GET
    @Path("/findbyName/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public ConvertToArraylist_Nhacungcaps searchByName(@PathParam("id") String id) {
        ConvertToArraylist_Nhacungcaps convert = new ConvertToArraylist_Nhacungcaps();
        ArrayList<Nhacungcap> nhacungcaps = (ArrayList<Nhacungcap>) service.timnhacungcaptheoma(id);
        convert.nhacungcaparray(nhacungcaps);
        return convert;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeById(@PathParam("id") String id) throws URISyntaxException {
        boolean isEmployeeExist = service.kiemtratontai(id);
        if (isEmployeeExist) {
            Nhacungcap nhacungcap = service.lay1nhacungcap(id);
            return Response.status(200).entity(nhacungcap)
                    .contentLocation(new URI("/nhacungcap/" + id)).build();
        } else {
            return Response.status(404).entity("khong tim thay nahc cung cap").build();
        }

    }

    @DELETE
    @Path("/{id}")
    public Response deleteEmployee(@PathParam("id") String id) throws URISyntaxException {
        boolean isEmployeeExist = service.kiemtratontai(id);
        if (isEmployeeExist) {
            service.xoanhacungcap(id);
            return Response.status(200).entity("xoa thanh cong").build();
        } else {
            return Response.status(404).entity("khong tim thay nah cung cap").build();
        }
    }

}
