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

import com.Backend.demo.model.trung.Phieunhapxuat;
import com.Backend.demo.model.ConvertToArraylist_phieunhapxuat;
import com.Backend.demo.service.trung.DichvuPhieunhapxuat;


@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "phieu")
@Path("/phieu")
public class SticketResource {

    @Autowired
    private DichvuPhieunhapxuat phieu;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ConvertToArraylist_phieunhapxuat getAll() {
        ConvertToArraylist_phieunhapxuat convert = new ConvertToArraylist_phieunhapxuat();
        ArrayList<Phieunhapxuat> employeeList = (ArrayList<Phieunhapxuat>) phieu.laynhieuphieunhapxuat();
        convert.datphieunhapxuat(employeeList);
        return convert;
    }
    @POST
    @Consumes("application/json")
    public Response create(Phieunhapxuat phieunhapxuat) throws URISyntaxException {

        phieunhapxuat = phieu.taoPhieuNhapXuat(phieunhapxuat);
        return Response.status(201)
                .entity("Phieu tao thanh cong voi id la = " + phieunhapxuat.getMa())
                .contentLocation(new URI("/phieu/" + phieunhapxuat.getMa())).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes("application/json")
    @Produces("application/json")
    public Response updateEmployee(@PathParam("id") String id, Phieunhapxuat phieunhapxuat)
            throws URISyntaxException {
        boolean isEmployeeExist = phieu.kiemtratontai(id);
        if (isEmployeeExist) {
            phieunhapxuat.setMa(id);;
            phieu.CapnhatPhieuNhapxuat(phieunhapxuat);
            return Response.status(200).entity("Phieu capnhat cong").build();
        } else {
            return Response.status(404).entity("khong tim thay phieu").build();
        }

    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getEmployeeById(@PathParam("id") String id) throws URISyntaxException {
        boolean isEmployeeExist = phieu.kiemtratontai(id);
        if (isEmployeeExist) {
            Phieunhapxuat phieunhapxuat = phieu.lay1phieunhapxuat(id);
            return Response.status(200).entity(phieunhapxuat)
                    .contentLocation(new URI("/phieu/" + id)).build();
        } else {
            return Response.status(404).entity("khong tim thay phieu").build();
        }

    }

    @DELETE
    @Path("/{id}")
    public Response deleteEmployee(@PathParam("id") String id) throws URISyntaxException {
        boolean isEmployeeExist = phieu.kiemtratontai(id);
        if (isEmployeeExist) {
            phieu.xoaphieu(id);
            return Response.status(200).entity("Phieu xoa thanh cong").build();
        } else {
            return Response.status(404).entity("khong tim thay phieu").build();
        }
    }

}
