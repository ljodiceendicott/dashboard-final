/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
       //halfUser.add(u);
   }
   public static void logUserInfo(String usern, String pword){
//       userlogin.put(usern, pword);
   }
   public static void updateChanges(){
       try {
      FileWriter myWriter = new FileWriter("test.txt");
      myWriter.write("This is a test");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    //print out information to Json file (userData.Json)
   }
   public static boolean isUser(String Username, String pword){
   //cross reference to see if the username and pword match
   //if(userlogin.containsKey(Username)&& userlogin.)
       return true;
   }
           }
