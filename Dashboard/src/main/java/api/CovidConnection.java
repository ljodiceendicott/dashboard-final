/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author lukej
 */
public class CovidConnection implements ApiConnection{
    String confirmed;
    String recovered;
    String deaths;
    String yestConfirmed;
    String yestRecovered;
    String yestDeaths;
    String updated;
    String name;
    Gson gson;
    
   public CovidConnection(String state){
        this.name = state; 
        //code for current day of Covid
        try{
            URL apiURL = new URL("https://covid-api.mmediagroup.fr/v1/cases?country=US");

            URLConnection yc = apiURL.openConnection();

            InputStream inStream = yc.getInputStream();
            InputStreamReader inStreamReader = new InputStreamReader(inStream);

            BufferedReader in = new BufferedReader(inStreamReader);
            String inputLine;
            StringBuilder sb = new StringBuilder();

            while ((inputLine = in.readLine()) != null){
                sb.append(inputLine);
                sb.append("\n");
            }
            
            JsonParser jp= new JsonParser();
            JsonElement root = jp.parse(sb.toString());
            JsonObject stateJson = root.getAsJsonObject();
            JsonElement stateele = stateJson.get(state);
            JsonObject stateobj = stateele.getAsJsonObject();
            this.confirmed = stateobj.get("confirmed").getAsString();
            this.recovered = stateobj.get("recovered").getAsString();
            this.deaths = stateobj.get("deaths").getAsString();
            this.updated = stateobj.get("updated").getAsString();
            
            
            in.close();
        }
        catch(IOException e){
         System.out.println("Bad Connection: ERROR:"+e);
        }
}
    @Override
   public void setConnection(String url){
       //will replace putting the code for connection in the constructor
   }
   private void getYesterday(String state){
       //getting yesterdays data
   }
public void print(){
    System.out.println("Covid Today in "+this.name+"\n Confirmed Cases:"+this.confirmed);
}
}