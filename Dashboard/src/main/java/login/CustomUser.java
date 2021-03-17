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

public class CustomUser extends User{
    boolean doesNews;
//Arraylist newsApiTopic
    boolean doesStocks;
//Arraylist stocksApiTopic
    boolean doesCrypto;
//Arraylist cryptoApiTopic
    boolean doesCovid;
//CovidConnection CovidApiTopic
    
    public CustomUser(String fn, String ln, String email, String city, String staProv, String usern, String pword, String pwordHint,boolean covid, boolean crypto, boolean stocks, boolean news) {
        super(fn, ln, email, city, staProv, usern, pword, pwordHint);
        if(covid){
            // call covid api
        }
        if(crypto){
            //call to the crypto api
        }
        if(stocks){
            //call stocks api
        }
        if(news){
            //call news
       }
        //information about what the user wants
        this.registerfull();
    }
   private void registerfull(){
       UserData.logFullUser(this);
   }
}
