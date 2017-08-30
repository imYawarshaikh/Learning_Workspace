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
import com.documentum.fc.common.DfException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.costacloud.oicl.pojo.DOCUMENT;



@Path("resource")
public class MyResource {

	@Context
    private UriInfo context;
    CustomJson json = new CustomJson();
    IJsonReader jsonReader = new JsonReader();
    List<DOCUMENT> list;
	IDfc dfc=new Dfc();
	
	Data data;
	

	
	@POST
	@Path("/Documents")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	@Produces(MediaType.APPLICATION_JSON)
    public Response uploadDocuments(@FormDataParam("file") InputStream uploadedInputStream,
    							  @FormDataParam("file") FormDataContentDisposition fileDetail,
    							@Context UriInfo info) throws Exception {
		
	
	    
       
        	
        	System.out.println("hit");
		
        	// check if all form parameters are provided
        	data=jsonReader.readJson(uploadedInputStream);
		    System.out.println("data check:"+data.getDOCUMENTS().get(0).getDOCNAME());
			
			
		 /*   if(data.getDOCUMENTS().size() !=0){*/
		     list = data.getDOCUMENTS();
		 	    	
		  /*  }else{
		    	
		    	json.setDecs1("Status code : 400");
				json.setDecs2("Error Msg : No Document found in Json File!");
				json.setDecs3("Hint : server error!!");
				
	        	return Response
				.created(info.getAbsolutePath())
				.status(400).entity(json).build();
		    	
		    }*/
		
			  Iterator<DOCUMENT> iterator = list.iterator();
		      System.out.println(data.getDOCUMENTS().size()+" Documents Found !!");
		       
	         while (iterator.hasNext()) {
	        		dfc.save(data.getBASEDETAILS(),iterator.next(),SessionController.getSession());
	         
	         
	         }
	         
	            json.setDecs1("Status code : 201");
				json.setDecs2("Msg : "+data.getDOCUMENTS().size()+" Documents Uploaded Successfully!!");
				json.setDecs3("Hint : Ok !!");
	         	return Response
	         				.created(info.getAbsolutePath())
	         				.status(201).entity(json).build();
    }
	
	
	
	
	@PUT
	@Path("/Documents")
	public String putUploadDocuments() {
	  return "Will update data soon!!";
    }
	
	@DELETE
	@Path("/Documents")
	public String deleteUploadDocuments() {
	  return "Will delete data soon!!";
    }
	
	
	
	
	@GET
	@Path("/Documents")
	public Response getUploadDocuments(@Context UriInfo info) {
		
	CustomJson json = new CustomJson();	
		
		
		return Response
				.created(info.getAbsolutePath())
				.status(201).entity(json).build();
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	  public static Data readJson(String filePath) {
			// TODO Auto-generated method stub
			 ObjectMapper mapper = new ObjectMapper();
		     Data values = null;
		        try {
		            values = mapper.readValue(new File(filePath), Data.class);
		        //	values= mapper.readValue(jsonInputStream, Data.class);
		        	System.out.println("jsonReader Class "+values.getDOCUMENTS().get(0).getDOCNAME());
		        	
		        }catch(Exception e){
		        	System.err.println(e);
		        }	
			return values;
		}
	  
	  
	
		
		
		
 
}
