package com.costacloud.oicl.exception;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.webservices.cc.Oicl_insurence.CustomJson;

@Provider
public class GenericExceptionMapper implements ExceptionMapper<Exception> {


	
	
	@Override
	public Response toResponse(Exception arg0) {
		// TODO Auto-generated method stub
		
		CustomJson json= new CustomJson();
		json.setDecs1("Status code : 500");
		json.setDecs2("Error Msg : genricFailure!");
		json.setDecs3("Exception : "+arg0.getMessage());
		
    return	Response
		.status(500).entity(json).build();
	}



}
