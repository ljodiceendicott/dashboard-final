/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseWrite;

import UserInfo.CustomUser;
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
      for(int i=0; i<c.size(); i++){
          
          //take all of the CustomUser info and put it into a file
      }
      
  }
  public static void writeCredentoJson(ArrayList<CustomUser> c){
      for(int i=0; i<c.size(); i++){
          String name = c.get(i).getUsername();
          String pword = c.get(i).getPassword();
          //write to the file that has all of the credentials in it
        }
    }
}
  