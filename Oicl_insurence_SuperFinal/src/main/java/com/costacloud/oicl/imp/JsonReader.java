package com.costacloud.oicl.imp;

import java.io.InputStream;


import com.costacloud.oicl.pojo.Data;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonReader implements com.costacloud.oicl.interfaces.IJsonReader  {

	public Data readJson(InputStream jsonInputStream) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		
		
		
		ObjectMapper mapper = new ObjectMapper();
	     Data values = null;
	        try {
	           // values = mapper.readValue(new File(filePath), Data.class);
	        	values= mapper.readValue(jsonInputStream, Data.class);
	           }catch(Exception e){
	        	System.err.println(e);
	        	throw new IllegalArgumentException("illegal File !!");
	        }	
		return values;
	}

}
