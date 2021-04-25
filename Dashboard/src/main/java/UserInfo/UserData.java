/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author jodic
 */
public class UserData {
    private Gson g;
   private static ArrayList<CustomUser> fullUser;
   private static ArrayList<UserCredential> userlogin;
   private static UserData ud;
   private CustomUser cu;
  
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
       this.saveFullUsers(cu);
   }
   public void saveFullUsers(CustomUser cu){
       JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved\n This will be what you "
            + "loadinto and will save the settings that you have set for the next time you hop on\n Put this in a location where you will remember it");
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
         FileNameExtensionFilter fileFilter = new FileNameExtensionFilter("Json Files", "json");
        jfc.setFileFilter(fileFilter);
         int ret = jfc.showSaveDialog(null);
        if(ret != JFileChooser.APPROVE_OPTION)
               return;
           File f = jfc.getSelectedFile();
           
            out = new PrintWriter(f);
          out.write(g.toJson(cu));
          JOptionPane.showMessageDialog(null, "File has been Saved Successfully. Have a good day!");
     }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Invalid file please try again.", "Invalid file", JOptionPane.ERROR_MESSAGE);
        }
     catch (IOException ex) {
            System.out.println(ex);
        }
     finally{
         out.close();
     }       
   } 
   
   public CustomUser loadFullUser(){
       BufferedReader buffread = null;
        try {
            JFileChooser jfc = new JFileChooser();
            int ret = jfc.showSaveDialog(null);
            if(ret != JFileChooser.APPROVE_OPTION)
                return null;
            File f = jfc.getSelectedFile();
            buffread = new BufferedReader(new FileReader(f));
            String inputLine;
            StringBuilder sb = new StringBuilder();
            while((inputLine = buffread.readLine()) != null){
                sb.append(inputLine);
                sb.append("\n");
            }   //getinto the data
             CustomUser cu = g.fromJson(buffread, CustomUser.class);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                buffread.close();
            } catch (IOException ex) {
                Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cu;
   }
        
   public ArrayList<CustomUser> getFullUsers(){
       return fullUser;
   }
   
   public void logUserCred(UserCredential userCred){
       userlogin.add(userCred);
       saveUserCred(userCred);
       
   }
   private void saveUserCred(UserCredential c){
    JOptionPane.showMessageDialog(null, "Make Sure that the Filename ends in the extension(.json) due to that being the file type that is going to be saved\n This will be what you "
            + "loadinto and will save the settings that you have set for the next time you hop on");
         PrintWriter out = null;
     try{
         JFileChooser jfc = new JFileChooser();
        int ret = jfc.showSaveDialog(null);
        if(ret != JFileChooser.APPROVE_OPTION)
               return;
           File f = jfc.getSelectedFile();
            out = new PrintWriter(f);
          out.write(g.toJson(c));
          JOptionPane.showMessageDialog(null, "File has been Saved Successfully. Have a good day!");
     }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Invalid file please try again.", "Invalid file", JOptionPane.ERROR_MESSAGE);
        }
     catch (IOException ex) {
            System.out.println(ex);
        }
     finally{
         out.close();
     }
     }    
     
     
     
     
     
     /*
     PrintWriter out =null;
         try{
           File fe = new File(getClass().getResource("/logininfo.txt").getFile());
           out =new PrintWriter(fe);
                out.print("test");
                //out.print(size);
               //out.print(jobj.toString());
               System.out.println("User Cred Saved:");
           
       } catch (IOException ex) {
            Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, ex);
        }
         finally{
             out.close();
         }
*/
      
   public ArrayList<UserCredential> getCredentials(){
       return userlogin;
   }
   public boolean isUser(String Username, String pword){
   //cross reference to see if the username and pword match
   //if(userlogin.containsKey(Username)&& userlogin.)
       return true;
   }
           }
