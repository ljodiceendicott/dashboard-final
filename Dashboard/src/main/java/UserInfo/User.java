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
    private String firstName;
    private String lastName;
    private String stateTerritory;
    private String username;
    private String password;
    private String passwordHint;
   public User(String fn, String ln,String staProv, String usern, String pword, String pwordHint){
        this.firstName = fn;
        this.lastName = ln;           
        this.stateTerritory = staProv;
        this.username = usern;
        this.password = pword;
// this.password = this.encrypt(pword);
       // UserData.logUserInfo(usern, pword);
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
       System.out.println("unencrypted:"+this.getPassword());
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
   @Override 
   public String toString(){
   return this.getLastName()+","+this.getFirstName();    
   }
   //store user info

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the stateTerritory
     */
    public String getStateTerritory() {
        return stateTerritory;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the passwordHint
     */
    public String getPasswordHint() {
        return passwordHint;
    }
}
