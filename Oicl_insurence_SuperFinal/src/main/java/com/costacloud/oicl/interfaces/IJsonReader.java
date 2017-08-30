package com.costacloud.oicl.interfaces;

import java.io.InputStream;

import com.costacloud.oicl.pojo.Data;

public interface IJsonReader {

	
	public Data readJson(InputStream uploadedInputStream) throws IllegalArgumentException;
	
}
