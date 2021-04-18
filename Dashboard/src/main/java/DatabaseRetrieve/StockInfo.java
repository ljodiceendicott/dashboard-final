/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseRetrieve;

/**
 *
 * @author jodic
 */
public class StockInfo {
                private String name;
                private String symbol;
   
                public StockInfo(String name, String symbol){
                    this.name= name;
                    this.symbol = symbol;
                    }
                public String getName(){
                    return name;
                    }
                public String getSymbol(){
                    return symbol;
                    }
                public String toString(){
                    return name+"("+symbol+")";
                        }
                }

