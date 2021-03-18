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
   private static ArrayList<User> halfUser;
   public static Hashtable<String, String> userlogin;
   public UserData(){
       fullUser= new ArrayList();
       halfUser = new ArrayList();
       userlogin = new Hashtable();
       
   }
   
   public static void logFullUser(CustomUser cu){
       fullUser.add(cu);
       halfUser.remove(cu.user); 
   }
   public static void logHalfUser(User u){
       halfUser.add(u);
   }
   public static void logUserInfo(String usern, String pword){
       userlogin.put(usern, pword);
   }
   
           }
