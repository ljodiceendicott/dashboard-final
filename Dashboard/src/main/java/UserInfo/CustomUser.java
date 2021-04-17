/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;

import DatabaseRetrieve.StockFromJson;
import DatabaseRetrieve.StockFromJson.Stockinfo;
import api.*;
import java.util.ArrayList;

/**
 *
 * @author jodic
 */

public class CustomUser extends User{
  private User user;
private ArrayList<NewsConnection> newsApiTopics;
private boolean isNews;
private ArrayList<StockConnection> stockslist;
private boolean isStocks;
private CovidConnection covidApiTopic;
private boolean isCovid;
private WeatherConnection wc;
private ArrayList<StockConnection> sc;
private StockFromJson sfj;
    
    private CustomUser(){
        super("Default", "User","Massachusetts", "Duser", "Duser123!", "Easypword");
        CovidConnection cc = new CovidConnection(super.getStateTerritory());
        sc= new ArrayList<>();
        stockslist = new ArrayList<>();
        sc.add(new StockConnection("AAPL"));
        sc.add(new StockConnection("GM"));
    }
    public CustomUser(User u){
        super(u.getFirstName(),u.getLastName(), u.getStateTerritory(),u.getUsername(), u.getPassword(), u.getPasswordHint());
        stockslist = new ArrayList<>();
    }
    public void setCovid(CovidConnection cc){
        this.covidApiTopic = cc;       
    }
    public void setNews(ArrayList<NewsConnection> news){
        this.newsApiTopics = news;
    }
    public void setStocks(ArrayList<Stockinfo> si){
        for(int i= 0; i<si.size(); i++){
            this.stockslist.add(new StockConnection(si.get(i).getSymbol()));
        }
    }
    public void setWeather(WeatherConnection wc){
        this.wc = wc;
    }
    public ArrayList<StockConnection> getStocks(){
        return this.stockslist;
    }
    public void setIsCovid(boolean c){
       this.isCovid=c;
    }
        public void setCovidstate(String state){
    super.setCovidstate(state);
}
    public void setIsNews(boolean b) {
        this.isNews=b;
    }
    public void setIsStocks(boolean b){
        this.isStocks = b;
    }
      public static CustomUser getDefaultCustomUser(){
        return new CustomUser();
    }
    public User getUser(){
        return this.user;
    }
    public CovidConnection getCovidinfo(){
        return covidApiTopic;
    }
     public boolean isCovid() {
         return isCovid;
     }
     public boolean isStocks(){
         return isStocks;
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
      // UserData.logFullUser(this);
   }

   

    
}
