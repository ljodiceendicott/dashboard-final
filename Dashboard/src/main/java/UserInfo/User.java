/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;

/**
 *
 * @author jodic
 */
public class User {
    String firstName;
    String lastName;
    String email;
    String city;
    String stateTerritory;
    String username;
    String password;
    String passwordHint;
   public User(String fn, String ln, String email, String city, String staProv, String usern, String pword, String pwordHint){
        this.firstName = fn;
        this.lastName = ln;           
        this.email = email;
        this.city = city;
        this.stateTerritory = staProv;
        this.username = usern;
        this.password = this.encrypt(pword);
        UserData.logUserInfo(usern, pword);
        UserData.logHalfUser(this);
   }
    
   public static boolean isEmail(String email){
       if(email.length()<=6){
           return false;
       }
       int atseen=0;
       for(int i=0; i<email.length(); i++){
           char character= email.charAt(i);
           if(character=='@'){
               if(i==0||i>email.length()-4){
                   return false;
                       }
                   atseen++;
               if(email.charAt(email.length()-4)=='.'){
                   return atseen==1;
               }
            }
        }
       return false;
       //algo for email
   }
   private String encrypt(String pword){
       System.out.println("unencrypted:"+this.password);
       String encrpword = "";
       for(int i=0; i<pword.length(); i++){
           char e=pword.charAt(i);
           int encrypted = (int)e+4;
           encrypted = encrypted%256;
           encrpword=encrpword+(char)encrypted;
       }
       System.out.println(encrpword);
   //encrypt password
   return encrpword;
   }
   private void decrypt(String pass){
       System.out.println("encrypted:"+pass);
       String decryptpword = "";
       for(int i=0; i<pass.length(); i++){
           char e=pass.charAt(i);
           int encrypted = (int)e-4;
           encrypted = encrypted%256;
           decryptpword=decryptpword+(char)encrypted;
       }
       System.out.println("Original password:"+decryptpword);
       //return decryptpword;
   }
   //store user info
}
