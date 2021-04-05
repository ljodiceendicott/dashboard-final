/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInfo;

import DatabaseRetrieve.StockNameImport.Stockinfo;
import api.*;
import java.util.ArrayList;

/**
 *
 * @author jodic
 */

public class CustomUser {
  private User user;
private ArrayList newsApiTopics;
private ArrayList<StockConnection> stockslist;
private CovidConnection covidApiTopic;
private WeatherConnection wc;
    private CustomUser(){
        user = new User("Default", "User", "DefaultInfo@info.com","Chatham","Massachusetts", "Duser", "Duser123!", "Easypword");
        CovidConnection cc = new CovidConnection(user.getStateTerritory());
        ArrayList<StockConnection> sc = new ArrayList<>();
        sc.add(new StockConnection("Apple","AAPL"));
        sc.add(new StockConnection("GM","GM"));
    }
    public CustomUser(User u) {
        this.user= u;}
    public void setCovid(CovidConnection cc){
        this.covidApiTopic = cc;       
    }
    public void setNews(ArrayList<NewsConnection> news){
        this.newsApiTopics = news;
    }
    public void setStocks(ArrayList<Stockinfo> stocks){
        stockslist = new ArrayList<>();
        stocks.forEach(stock -> {
            stockslist.add(new StockConnection(stock.getName(),stock.getSymbol()));
        });
    }
    public void setWeather(WeatherConnection wc){
        this.wc = wc;
    }
    public ArrayList<StockConnection> getStocks(){
        return this.stockslist;
    }
    public static CustomUser getDefaultCustomUser(){
        return new CustomUser();
    }
    public User getUser(){
        return this.user;
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
