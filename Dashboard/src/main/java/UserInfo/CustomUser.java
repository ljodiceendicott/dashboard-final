/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;

import DatabaseRetrieve.StockFromJson;
import DatabaseRetrieve.StockInfo;
import api.*;
import java.util.ArrayList;

/**
 *
 * @author jodic
 */

public class CustomUser{
  private User user;
private ArrayList<NewsConnection> newsApiTopics;
private boolean isNews;

private ArrayList<StockConnection> stockslist;
private boolean isStocks;

private CovidConnection covidApiTopic;
private boolean isCovid;

private WeatherConnection wc;
private boolean isWeather;

private ArrayList<StockConnection> sc;
transient private StockFromJson sfj;

private boolean UseDefaults;


//Custom User calls   
        //used for default user
    private CustomUser(String type){
        
       // CovidConnection cc = new CovidConnection(super.getStateTerritory());
        //this.setCovidstate(super.getStateTerritory());
        //this.setIsCovid(true);
        //this.setCovid(cc);
        //arts, automobiles, books, business
        NewsConnection ncOne = new NewsConnection("arts");
        NewsConnection ncTwo = new NewsConnection("automobiles");
        NewsConnection ncThree = new NewsConnection("books");
        NewsConnection ncFour = new NewsConnection("business");
        ArrayList<NewsConnection> news = new ArrayList<>();
        news.add(ncOne);
        news.add(ncTwo);
        news.add(ncThree);
        news.add(ncFour);
        this.setIsNews(true);
        this.setNews(news);
        
        stockslist = new ArrayList<>();
        sc= new ArrayList<>();
        sc.add(new StockConnection("AAPL"));
        sc.add(new StockConnection("GM"));
        
        this.setIsStocks(true);
        this.setStocksDef(sc);
    }
   public CustomUser(){
       newsApiTopics = new ArrayList<>();
       stockslist = new ArrayList<>();
       
   }
    
    public static CustomUser getDefaultCustomUser(){
        return new CustomUser();
    }
    
    public User getUser(){
        return this.user;
    }    
    
//Covid information calls
    public void setCovid(CovidConnection cc){
        this.covidApiTopic = cc;       
    }
     public void setIsCovid(boolean c){
       this.isCovid=c;
    }
   public CovidConnection getCovidinfo(){
        return covidApiTopic;
    }
     public boolean isCovid() {
         return isCovid;
     }       
        
//News information calls
    public void setNews(ArrayList<NewsConnection> news){
        this.newsApiTopics = news;
    }
     public void setIsNews(boolean b) {
        this.isNews=b;
    }
     public boolean isNews() {
        return isNews;
    }
       public ArrayList<NewsConnection> getNews() {
      return newsApiTopics;
    }

       
//stock information calls
     public void setStocks(ArrayList<StockInfo> si){
        for(int i= 0; i<si.size(); i++){
            this.stockslist.add(new StockConnection(si.get(i).getSymbol()));
        }
    }
     public void setStocksDef(ArrayList<StockConnection> si){
        for(int i= 0; i<si.size(); i++){
            this.stockslist.add(si.get(i));
        }
    }
     public ArrayList<StockConnection> getStocks(){
        return this.stockslist;
    }
     
    public void setIsStocks(boolean b){
        this.isStocks = b;
    }
      public boolean isStocks(){
         return isStocks;
     }
     
   //Weather information   
      
    public void setWeather(WeatherConnection wc){
        this.wc = wc;
    }
    public void setisWeather(boolean b){
        this.isWeather = b;
    }
    public boolean isWeather(){
     return this.isWeather;   
    }
    
    
}
