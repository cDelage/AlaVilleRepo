package com.tool.config;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.tool.api.AlavilleAPI;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig{

	  public JerseyConfig() {
	        register(AlavilleAPI.class);
	    }
}
