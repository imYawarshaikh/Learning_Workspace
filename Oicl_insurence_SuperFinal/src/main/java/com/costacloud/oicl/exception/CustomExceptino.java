package com.costacloud.oicl.exception;

public class CustomExceptino extends Exception{

	
	
	public CustomExceptino(String message) {
		super(message);
		
		System.err.println(message+"error");
		// TODO Auto-generated constructor stub
	}

	
	
}
