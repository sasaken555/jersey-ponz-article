package com.ponzmild.ponzarticle;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api/v1")
public class WebApiConfig extends ResourceConfig {
	public WebApiConfig() {
		packages(this.getClass().getPackage().getName());
	}
}
