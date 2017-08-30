package com.costacloud.oicl.exception;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.documentum.fc.common.DfException;
import com.webservices.cc.Oicl_insurence.CustomJson;

@Provider
public class DFCExceptionMapper implements ExceptionMapper<DfException> {

	@Override
	public Response toResponse(DfException arg0) {
		// TODO Auto-generated method stub
		CustomJson json = new CustomJson();
		json.setDecs1("Status code : 500");
		json.setDecs2("Error Msg :dfc Failure!");
		json.setDecs3("Exception : "+arg0.getMessage() );
		return Response.status(500).entity(json).build();
	    }

}
