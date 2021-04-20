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
public class UserCredential{
    private transient String username;
    private transient String password;
    private transient String passwordHint;
    
    public UserCredential(String usern, String pword, String pwordHint){
         this.username = usern;
        this.password = pword;
        this.passwordHint = pwordHint;
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
    public UserCredential getUserCred(){
        return this;
    }
  }
