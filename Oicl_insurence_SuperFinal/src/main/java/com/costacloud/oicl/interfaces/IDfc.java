package com.costacloud.oicl.interfaces;

import com.costacloud.oicl.pojo.BASEDETAILS;
import com.costacloud.oicl.pojo.DOCUMENT;
import com.costacloud.oicl.pojo.Data;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.common.DfException;

public interface IDfc {

	
	public void save(BASEDETAILS baseDetails,DOCUMENT document,IDfSession session) throws DfException, Exception;

	
}
