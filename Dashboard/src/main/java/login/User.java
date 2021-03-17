/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

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
        if(this.isEmail(email)){
            this.email = email;}
        this.city = city;
        this.stateTerritory = staProv;
        this.username = usern;
        //Method will be made to encrypt oword when storing it
        this.password = pword;
    }
   private boolean isEmail(String email){
       //algo for email
       return true;
   }
   private String encrypt(String pword){
   //encrypt password
   return pword;
   }
   //store user info
}
