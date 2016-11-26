package com.service;
import com.model.Message;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/service")
public class MyFirstService {

	@GET
	@Path("/produce")
	@Produces(MediaType.APPLICATION_JSON)
	
	public Response getJson(String msg) {

		final Message message = new Message();

		return Response.status(200).entity(message).build();
	}
	
	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {

		String result = "Your Web-Service Says: " + msg;

		return Response.status(200).entity(result).build();

	}

}