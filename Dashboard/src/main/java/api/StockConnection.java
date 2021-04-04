/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jodic
 */
public class StockConnection implements ApiConnection{
   private String url;
   private int high;
   private int low;
   private String name;
   private String symb;
   private int close;
   private int open;
   private String updatedlast;
   private String splitfact; 
   private String key ="bbe21b9a39c90a3543d03a6d05efcc3e";
   private String baselink = "http://api.marketstack.com/v1/";
    //http://api.marketstack.com/v1/eod/latest?access_key=bbe21b9a39c90a3543d03a6d05efcc3e&symbols=AAPL&date_from=2021-03-21&date_to=2021-03-31
    //http://api.marketstack.com/v1/tickers?access_key=bbe21b9a39c90a3543d03a6d05efcc3e
    //http://api.marketstack.com/v1/
    //http://api.marketstack.com/v1/tickers/apple?access_key=bbe21b9a39c90a3543d03a6d05efcc3e
    public StockConnection(String stock, String symb){
        url=this.setConnection(this.key,symb);
        try{
            this.symb = symb;
            this.name= stock;
            URL apiUrl = new URL(this.url);
            URLConnection yc = apiUrl.openConnection();
            InputStream inStream=yc.getInputStream();
            InputStreamReader inStreamReader = new InputStreamReader(inStream);
            BufferedReader in = new BufferedReader(inStreamReader);
            String inp;
             StringBuilder sb = new StringBuilder();
                   
                   while ((inp = in.readLine()) != null){
                       sb.append(inp);
                       sb.append("\n");
                   }
                   JsonParser jp = new JsonParser();
            JsonElement root = jp.parse(sb.toString());
            JsonObject objRoot = root.getAsJsonObject();
            JsonArray valueElem = objRoot.getAsJsonArray("data");
            JsonObject data = valueElem.get(0).getAsJsonObject();
            this.open = data.get("open").getAsInt();
            this.close = data.get("close").getAsInt();
            this.high = data.get("high").getAsInt();
            this.low = data.get("low").getAsInt();
            this.splitfact = data.get("split_factor").getAsString();
            this.splitfact = data.get("date").getAsString(); 
        } catch (MalformedURLException ex) {
           Logger.getLogger(StockConnection.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(StockConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }
   @Override
    public String toString(){
        return name+"("+symb+")"+high+"/"+low;
    }
/**
 * 
 * @return the name
 */
    public String getName(){
        return name;
    }
    /**
     * @return the high
     */
    public int getHigh() {
        return high;
    }

    /**
     * @return the low
     */
    public int getLow() {
        return low;
    }

    /**
     * @return the symb
     */
    public String getSymb() {
        return symb;
    }

    /**
     * @return the close
     */
    public int getClose() {
        return close;
    }

    /**
     * @return the open
     */
    public int getOpen() {
        return open;
    }

    /**
     * @return the updatedlast
     */
    public String getUpdatedlast() {
        return updatedlast;
    }

    @Override
    public String setConnection(String key, String topic) {
    return  "http://api.marketstack.com/v1/eod/latest?access_key="+key+"&symbols="+topic;  
    }
    public static void main(String[] args){
        StockConnection sc = new StockConnection("apple","AAPL");
        System.out.println(sc);
    }
}
