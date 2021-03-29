/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jodic
 */
public class NewsConnection {
   ArrayList<NewsStory> stories;
   
   public class NewsStory{
   String storylink;
   String last_updated;
   String pubdate;
   String title;
   String desc;
   
   public NewsStory(String storylink, String lastup, String pubdate, String title, String desc){
       this.storylink = storylink;
       this.last_updated = lastup;
       this.pubdate = pubdate;
       this.title = title;
       this.desc = desc;
   }
   }
   
 String apid= "24cb25ed-4ee6-4186-b672-fd3e5e9cbef2";
 String key = "w7nhQF5PpKTQsBezWG2JkgkYsWbBt5KP";
 //arts, automobiles, books, business, fashion, food, health, home, insider, magazine, movies, nyregion, obituaries, 
 //opinion, politics, realestate, science, sports, sundayreview, technology, theater, t-magazine, travel, upshot, us, world
 //https://api.nytimes.com/svc/topstories/v2/sports.json?api-key=w7nhQF5PpKTQsBezWG2JkgkYsWbBt5KP
 
public NewsConnection(String section){
            stories= new ArrayList<>();
       try {
                   URL apiUrl = new URL("https://api.nytimes.com/svc/topstories/v2/"+section+".json?api-key="+key);
                   URLConnection yc = apiUrl.openConnection();
                   InputStream inStream = yc.getInputStream();
                   InputStreamReader inStreamReader = new InputStreamReader(inStream);
                   
                   BufferedReader in = new BufferedReader(inStreamReader);
                   String inputLine;
                   StringBuilder sb = new StringBuilder();
                   
                   while ((inputLine = in.readLine()) != null){
                       sb.append(inputLine);
                       sb.append("\n");
                   }
             for(int i = 4; i<7; i++){
                     JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(sb.toString());
            JsonObject objRoot = root.getAsJsonObject();
            JsonElement valueElem = objRoot.get("results");
            JsonArray resultsArray = valueElem.getAsJsonArray();
            JsonObject topstory = resultsArray.get(i).getAsJsonObject();
            String storylink = topstory.get("short_url").getAsString();
            String lastup = topstory.get("updated_date").getAsString();
            String pubdate = topstory.get("published_date").getAsString();                        
            String title =topstory.get("title").getAsString();
            String desc = topstory.get("abstract").getAsString();
            NewsStory ns = new NewsStory(storylink,lastup,pubdate,title,desc);
            stories.add(ns);
             }

       } catch (IOException ex) {
           Logger.getLogger(NewsConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
}
public String toString(){
    String news="";
       for (NewsStory story : stories) {
           news=news+story.title+"\n";
       }
        return news;
}
 public static void main(String[] args){
     NewsConnection nc = new NewsConnection("sports");
     System.out.println(nc);
 }
}
