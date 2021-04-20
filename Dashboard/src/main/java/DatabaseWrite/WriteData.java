/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseWrite;

import UserInfo.CustomUser;
import UserInfo.UserCredential;
import UserInfo.UserData;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author jodic
 */
public class WriteData {
     UserData ud;
    public WriteData(){
           // String s =System.getProperty("user.dir");
           //use this to get user working directory
           ud = UserData.getInstance();
    }
  public static void writePDtoJson(ArrayList<CustomUser> c){
     
      for(int i= 0; i<c.size(); i++){
         
     }
      
  }
  public static void writeCredentoJson(ArrayList<UserCredential> c){
      
    }
}
  