package com.costacloud.oicl.imp;


import java.io.File;

import com.costacloud.oicl.interfaces.IDfc;
import com.costacloud.oicl.pojo.BASEDETAILS;
import com.costacloud.oicl.pojo.DOCUMENT;
import com.costacloud.oicl.pojo.Data;
import com.documentum.com.DfClientX;
import com.documentum.com.IDfClientX;
import com.documentum.fc.client.IDfClient;
import com.documentum.fc.client.IDfDocument;
import com.documentum.fc.client.IDfFolder;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.common.DfException;
import com.documentum.fc.common.IDfList;
import com.documentum.operations.IDfFile;
import com.documentum.operations.IDfImportNode;
import com.documentum.operations.IDfImportOperation;

public class Dfc implements IDfc {
	static IDfClientX iDfClientX;
	static IDfClient iDfClient;

	static IDfList dfList;
	static IDfDocument doc;
	static  IDfFile dfFile;
	static IDfImportNode node;
	IDfFolder folder;
	
	
	public void save(BASEDETAILS baseDetails, DOCUMENT document,IDfSession session) throws Exception {
		// TODO Auto-generated method stub
		

			
	
			
			
			
			System.out.println("FIle Location on Server : /Allies");
			IDfClientX	iDfClientX = new DfClientX();
			IDfImportOperation dfImportOperation = iDfClientX.getImportOperation();
			dfImportOperation.setSession(session);
			
		
			// folder = (IDfFolder) session.getObjectByPath("/Oicl_warehouse/Allies/"+document.getDOCTYPE()+"/"+baseDetails.getSTAGE()+"/"+document.getFIELDS().getRegDate()+"/"+baseDetails.getCASENUMBER());
			IDfFolder folder1 = dmCreateStoragePath(session, "/Oicl_warehouse/Allies/"+document.getDOCTYPE()+"/"+baseDetails.getSTAGE()+"/"+document.getFIELDS().getRegDate()+"/"+baseDetails.getCASENUMBER());

			/*if(folder==null){
				System.out.println("Please wait Creating new directory...");
				
				
			}*/
			
			dfImportOperation.setDestinationFolderId(folder.getObjectId());
			
			
			
			File convFile = new File(document.getIMAGINGEXPORTFILENAME());
			

			System.out.println("Local Source File Absolute path: " + convFile.getAbsolutePath());

			dfFile = iDfClientX.getFile(convFile.getAbsolutePath());
			node = (IDfImportNode) dfImportOperation.add(dfFile);
			node.setDocbaseObjectType("oicl_y_form");
			node.setNewObjectName(document.getDOCNAME());
			System.out.println("id is set as Name : "+document.getDOCNAME());
			System.err.println("set docbase ObjectType : oicl_y_form");
			if (!dfFile.exists()) {
				System.out.println("available");
			}
			dfImportOperation.add(dfFile);

			if (dfImportOperation.execute()) {
				
				dfList = dfImportOperation.getNewObjects();
				doc = (IDfDocument) dfList.get(0);
				System.out.println("getFilteredDate :" + document.getFIELDS().getRegDate().replace("-", "/"));

				doc.setString("oicl_id", baseDetails.getCASENUMBER());
				doc.setString("oicl_desc", "User: "+baseDetails.getUSER());
				//doc.setString("oicl_form_date","");
				//doc.setString("oicl_verified", "unverified");
				doc.setString("oicl_verify", "false");
				doc.save();
				System.out.println("Document Created");

			}

		
	
		
		
		
	}


public static IDfFolder dmCreateStoragePath(IDfSession session, String path) throws Exception {
    IDfFolder folder = null;
 
    // first see if the folder already exists
    folder = (IDfFolder) session.getObjectByQualification("dm_folder where any r_folder_path='" + path + "'");
 
    // if not build it
    if (null == folder) {
    	System.out.println("Please wait Creating new directory...");
		
        // split path into separate folders
        String[] dirs = path.split("/");
 
        // loop through path folders and build
        String dm_path = "";
        for (int i=0; i<dirs.length; i++) {
 
            if (dirs[i].length() > 0) {
 
                // build up path
                dm_path = dm_path + "/" + dirs[i];
 
                // see if this path exists
                IDfFolder testFolder = (IDfFolder) session.getObjectByQualification("dm_folder where any r_folder_path='" + dm_path + "'");
                if (null == testFolder) {
 
                    // check if a cabinet need to be made
                    if (dm_path.equalsIgnoreCase("/" + dirs[i])) {
                        IDfFolder cab = (IDfFolder) session.newObject("dm_cabinet");
                        cab.setObjectName(dirs[i]);
                        cab.save();
                     // else make a folder
                     } else {
                         folder = (IDfFolder) session.newObject("dm_folder");
                         folder.setObjectName(dirs[i]);
 
                         // link it to parent
                         String parent_path = "";
                         for (int j=0; j < i; j++) {
                            if (dirs[j].length() > 0) {
                                parent_path = parent_path + "/" + dirs[j];
                            }
                         }
                     folder.link(parent_path);
                     folder.save();
                    }
                }
             }
        }
    }
    return folder;
}



}
