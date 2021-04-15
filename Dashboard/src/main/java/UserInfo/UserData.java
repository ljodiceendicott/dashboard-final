/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;


import java.util.ArrayList;
import java.util.Hashtable;


/**
 *
 * @author jodic
 */
public class UserData {
   private static ArrayList<CustomUser> fullUser;
   private static Hashtable<String, String> userlogin;
   private static UserData ud;
   
   private UserData(){
       fullUser= new ArrayList();
       userlogin = new Hashtable();
   }
   
   public static UserData getInstance(){
       if(ud==null){
           return new UserData();
       }
       return ud;
   }
   
   public  void logFullUser(CustomUser cu){
       fullUser.add(cu);
       //log this information in a json file 
   }
   public void logUserLogin(String usern, String pword){
     userlogin.put(usern, pword);
   }
   public boolean isUser(String Username, String pword){
   //cross reference to see if the username and pword match
   //if(userlogin.containsKey(Username)&& userlogin.)
       return true;
   }
           }
