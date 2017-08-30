package com.webservices.cc.Oicl_insurence;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.UriInfo;

import org.aspectj.lang.annotation.Pointcut;
import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import com.costacloud.oicl.imp.Dfc;
import com.costacloud.oicl.imp.JsonReader;
import com.costacloud.oicl.imp.SessionController;
import com.costacloud.oicl.interfaces.IDfc;
import com.costacloud.oicl.interfaces.IJsonReader;
import com.costacloud.oicl.pojo.Data;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.costacloud.oicl.pojo.DOCUMENT;


@Path("test")
public class MyResource2 {

	@Context
    private UriInfo context;
	Data data;

	
	
	
	@GET	
	@Path("nullp")
	public Response nullPointerException() {
		throw new NullPointerException("Throwing null pointer exception");
	}
	



	@GET
	@Path("/Documents2")
	public Response getUploadDocuments(@Context UriInfo info) {
		
	CustomJson json = new CustomJson();	
		json.setDecs1("decs1");
		json.setDecs2("decs2");
		json.setDecs3("decs3");

		
		return Response
				.created(info.getAbsolutePath())
				.status(201).entity(json).build();
		}

	
 
}
