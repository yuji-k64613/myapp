package com.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

/*
 * http://localhost:8080/myapp/service/main/foo?id=1
 */
@Path("main")
public class Main {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("foo")
	public String foo(@QueryParam("id") int id) {
		id++;
		return "result=" + id;
	}
}
