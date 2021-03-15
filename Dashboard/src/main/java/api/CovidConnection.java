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
public class CovidConnection {
    int confirmed;
    int recovered;
    int deaths;
    int lat;
    int longit;
    int population;
    String updated;
    String name;
    String countryName;
    Gson gson;
    
   public CovidConnection(String countryName){
        this.countryName = countryName;
        gson = new Gson();
        try{
            URL apiURL = new URL("https://covid-api.mmediagroup.fr/v1/cases?country="+countryName);

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
            
            
            in.close();
        }
        catch(IOException e){
         System.out.println("Bad Connection: ERROR:"+e);
        }
}
    public void print(){
        System.out.println(countryName);
    }
}