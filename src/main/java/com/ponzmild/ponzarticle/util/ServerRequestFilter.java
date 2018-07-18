package com.ponzmild.ponzarticle.util;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;

@Provider
@PreMatching
@Priority(Priorities.AUTHENTICATION)
public class ServerRequestFilter implements ContainerRequestFilter {

	@Inject
	private Logger logger;

	@Override
	public void filter(ContainerRequestContext ctx) throws IOException {

		// POSTリクエストにX-Http-Method-Overrideがついていたら
		// ヘッダーのMethodでHttpMethodを上書き
		String methodOverride = ctx.getHeaderString("X-Http-Method-Override");
		if (methodOverride != null) {
			ctx.setMethod(methodOverride);
		}

		String msg = ctx.getMethod() + " " + ctx.getUriInfo().getAbsolutePath().toString();
		logger.log(Level.INFO, msg);
	}


}
