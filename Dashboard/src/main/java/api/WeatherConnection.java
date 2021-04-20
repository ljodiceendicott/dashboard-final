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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author jodic
 */
public class WeatherConnection {
    private String city;
    private transient String description;
   private transient String main;
   private transient String iconURL;
   private transient String myAPIKey = "&appid=7b2eea32adfd6ad3fe73ff7221c45daa"; ;

    public WeatherConnection(String cityName){
        this.city = cityName;
        try{    

            URL apiURL = new URL("http://api.openweathermap.org/data/2.5/weather?units=imperial&q=" + cityName + myAPIKey);

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
              JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(sb.toString());
            JsonObject objRoot = root.getAsJsonObject();
            JsonElement valueElem = objRoot.get("weather");
            JsonArray weatherArray = valueElem.getAsJsonArray();
            JsonObject currWeatherObj = weatherArray.get(0).getAsJsonObject();
            this.main = currWeatherObj.get("main").getAsString();
            this.description = currWeatherObj.get("description").getAsString();
            String iconNum = currWeatherObj.get("icon").getAsString();
            this.iconURL = "http://openweathermap.org/img/wn/"+iconNum+"@2x.png";
            in.close();}
   
       catch(Exception e){
            // TODO: Produce useful error messages for the user
            e.printStackTrace();
        }
    }
    @Override
    public String toString(){
        return city+" Weather:"+description;
    }
}
