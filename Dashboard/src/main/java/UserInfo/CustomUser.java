/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;

import api.*;
import java.util.ArrayList;

/**
 *
 * @author jodic
 */

public class CustomUser{
    User user;
    boolean doesNews;
ArrayList newsApiTopics;
    boolean doesStocks;
//Arraylist stocksApiTopic
    boolean doesCrypto;
//Arraylist cryptoApiTopic
    boolean doesCovid;
//CovidConnection CovidApiTopic
    
    public CustomUser(User u, CovidConnection cc, WeatherConnection wc, StockConnection sc,ArrayList<NewsConnection> stories) {
        this.user= u;
       //TO DO:
       //set 
        
       // this.assignadds(cc,sc,nc,wc);
        
    }
  /*
    public CustomUser(boolean covid, boolean crypto, boolean stocks, boolean news) {
        this.assignadds(covid,crypto,stocks,news);
    }*/
    //used if all of the of the things should be added
   // private void assignadds(CovidConnection covid, StockConnection stocks, NewsConnection news, WeatherConnection weather){ 
        //information about what the user wants
    //    this.registerfull();
    //}
   private void registerfull(){
       UserData.logFullUser(this);
   }
}
