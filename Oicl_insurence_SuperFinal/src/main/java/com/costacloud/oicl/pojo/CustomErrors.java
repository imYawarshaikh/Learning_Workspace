package com.costacloud.oicl.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomErrors {

	private String error;
	private int errorCode;
	private String errorDesc;
	

	public CustomErrors(String error, int errorCode, String errorDesc) {
		super();
		this.error = error;
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	
}
