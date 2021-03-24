/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

/**
 *
 * @author jodic
 */
public class NewsConnection {
   String storylink;
   String last_updated;
   String pubdate;
   String title;
   
   
 String apid= "24cb25ed-4ee6-4186-b672-fd3e5e9cbef2";
 String key = "w7nhQF5PpKTQsBezWG2JkgkYsWbBt5KP";
 
 
 
public NewsConnection(String section){
    String link = "https://api.nytimes.com/svc/topstories/v2/"+section+".json?api-key="+key;
}
 
}
