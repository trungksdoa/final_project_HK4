package com.Backend.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.Backend.demo.resource.trung.SticketResource;
import com.Backend.demo.resource.trung.nhacungcapResource;
import com.Backend.demo.resource.trung.tainguyenkhachhang;
 
@Component
public class JerseyConfig extends ResourceConfig 
{
    public JerseyConfig() 
    {
        register(SticketResource.class);
        register(tainguyenkhachhang.class);
        register(nhacungcapResource.class);
    }
}
