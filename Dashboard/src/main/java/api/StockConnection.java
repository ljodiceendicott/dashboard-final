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
public class StockConnection {
    int high;
    int low;
    String symb;
    int close;
    int open;
    String updatedlast;
    String splitfact; 
    String key ="bbe21b9a39c90a3543d03a6d05efcc3e";
    String baselink = "http://api.marketstack.com/v1/";
    //http://api.marketstack.com/v1/eod/latest?access_key=bbe21b9a39c90a3543d03a6d05efcc3e&symbols=AAPL&date_from=2021-03-21&date_to=2021-03-31
    //http://api.marketstack.com/v1/tickers?access_key=bbe21b9a39c90a3543d03a6d05efcc3e
    //http://api.marketstack.com/v1/
    //http://api.marketstack.com/v1/tickers/apple?access_key=bbe21b9a39c90a3543d03a6d05efcc3e
    public StockConnection(String stock){
        
    }
}
