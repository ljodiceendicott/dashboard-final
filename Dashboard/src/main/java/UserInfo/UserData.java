/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;


import DatabaseWrite.WriteData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jodic
 */
public class UserData {
    private Gson g;
   private static ArrayList<CustomUser> fullUser;
   private static ArrayList<UserCredential> userlogin;
   private static UserData ud;
  
    public class Userlogininformation{
           public String username;
           public String password;
           public String passwordhint;
           public Userlogininformation(UserCredential u){
               this.username = u.getUsername();
               this.password = u.getPassword();
               this.passwordhint = u.getPasswordHint();
           }
           
       }
   
   private UserData(){
       //load data onto these
       
       fullUser= new ArrayList<>();
       userlogin = new ArrayList<>();
       g = new Gson();
      
   }
   
   public static UserData getInstance(){
       if(ud==null)
           ud =new UserData();
       return ud;
   }
   
   public  void logFullUser(CustomUser cu){
       fullUser.add(cu);
       this.saveFullUsers();
   }
   public void saveFullUsers(){
       try {
           FileWriter fw;
            //logs User's Settings in a file
            File f = new File(getClass().getResource("/Userinfo.json").getFile());
            fw = new FileWriter(f);
            g.toJson(fullUser,fw);
            System.out.println("User info saved:");
            fw.close();
            //log this information in a json file
        } catch (IOException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);  
            } 
       
   } 
   public ArrayList<CustomUser> getFullUsers(){
       return fullUser;
   }
   
   public void logUserCred(UserCredential userCred){
       userlogin.add(userCred);
       saveUserCred(userlogin);
       
   }
   private void saveUserCred(ArrayList<UserCredential> c){
       ArrayList<Userlogininformation> credtoJson = new ArrayList<>();
       for(int i=0; i<userlogin.size(); i++){
           credtoJson.add(new Userlogininformation(userlogin.get(i)));
       }
       int size = credtoJson.size();
      // UserCredential[] array = credtoJson.toArray(new UserCredential[size]);
      JsonObject jobj = new JsonObject();
      JsonArray jarray = g.toJsonTree(userlogin).getAsJsonArray();
      jobj.add("UserCred", jarray);
      try{
           File fe = new File(getClass().getResource("/LoginInfo.json").getFile());
           try (PrintWriter out = new PrintWriter(fe)) {
              out.print(size);
               out.print(jobj.toString());
               System.out.println("User Cred Saved:");
           }
       } catch (IOException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   public ArrayList<UserCredential> getCredentials(){
       return userlogin;
   }
   public boolean isUser(String Username, String pword){
   //cross reference to see if the username and pword match
   //if(userlogin.containsKey(Username)&& userlogin.)
       return true;
   }
           }
