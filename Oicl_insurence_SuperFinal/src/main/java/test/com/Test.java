package test.com;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.costacloud.oicl.imp.SessionController;
import com.documentum.fc.client.IDfFolder;
import com.documentum.fc.client.IDfSession;
import com.documentum.fc.client.IDfSysObject;
import com.documentum.fc.common.DfException;
import com.rsa.cryptoj.f.se;
import com.webservices.cc.Oicl_insurence.CustomJson;

public class Test {
public static void main(String[] args) throws Exception {
	
	

SessionController session = new SessionController();

	

IDfFolder newFolder = dmCreateStoragePath(session.getSession(), "/Oicl_warehouse/Allies/News/wire service/Fox News/2012/May/07");
System.out.println(newFolder.getObjectName());







/*
IDfFolder sysObj = (IDfFolder)session.getSession().newObject("dm_folder");
sysObj.setObjectName("testFolder");
sysObj.link("/Oicl_warehouse/Allies/testFolder");
sysObj.save();

//IDfFolder folder = (IDfFolder) session.getSession().getObjectByPath("/Oicl_warehouse/Allies");

System.out.println(sysObj.getObjectName()+" : "+sysObj.getObjectId());

*/

}
public static IDfFolder dmCreateStoragePath(IDfSession session, String path) throws Exception {
    IDfFolder folder = null;
 
    // first see if the folder already exists
    folder = (IDfFolder) session.getObjectByQualification("dm_folder where any r_folder_path='" + path + "'");
 
    // if not build it
    if (null == folder) {
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
