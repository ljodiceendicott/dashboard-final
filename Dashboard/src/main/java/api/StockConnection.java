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
    String key ="bbe21b9a39c90a3543d03a6d05efcc3e";
    String baselink = "http://api.marketstack.com/v1/";
    
    public StockConnection(String stock){
        
    }
}
