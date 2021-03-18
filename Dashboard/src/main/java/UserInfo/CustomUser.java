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

public class CustomUser{
    User user;
    boolean doesNews;
//Arraylist newsApiTopic
    boolean doesStocks;
//Arraylist stocksApiTopic
    boolean doesCrypto;
//Arraylist cryptoApiTopic
    boolean doesCovid;
//CovidConnection CovidApiTopic
    
    public CustomUser(User u,boolean covid, boolean crypto, boolean stocks, boolean news) {
        this.assignadds(covid,crypto,stocks,news);
        this.user= u;
    }
  /*
    public CustomUser(boolean covid, boolean crypto, boolean stocks, boolean news) {
        this.assignadds(covid,crypto,stocks,news);
    }*/
    private void assignadds(boolean covid, boolean crypto ,boolean stocks, boolean news){
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
