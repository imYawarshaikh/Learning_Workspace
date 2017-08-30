package com.costacloud.oicl.imp;



import com.documentum.com.DfClientX;
import com.documentum.com.IDfClientX;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfSessionManager;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfLoginInfo;


public class SessionController {

	private static String repo = "corp";
	private static String username = "dmadmin";
	private static String pwd = "demo.demo";
	private static IDfSessionManager sessionManager=null;
	private static IDfSession session=null;
	
	public static  IDfSession getSession() throws DfException {
		// TODO Auto-generated method stub
		
		IDfClientX	iDfClientX = new DfClientX();
    	IDfClient	iDfClient = iDfClientX.getLocalClient();

		// creating session Manager.
		sessionManager = iDfClient.newSessionManager();
		// creating IDfloginInfo
		IDfLoginInfo loginInfo = iDfClientX.getLoginInfo();
		loginInfo.setUser(username);
		loginInfo.setPassword(pwd);
		// mapping logininfo with session manager.
		sessionManager.setIdentity(repo, loginInfo);
		session = sessionManager.getSession(repo);
		
		System.out.println("Session Created ");
		
   
		return session;
	}

	public  static String getReleaseSession() {
		// TODO Auto-generated method stub
		sessionManager.release(session);
		return "Session Released";
	}
	

	
	
}
