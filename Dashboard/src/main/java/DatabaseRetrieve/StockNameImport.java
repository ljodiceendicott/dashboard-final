/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseRetrieve;

import DatabaseRetrieve.StockNameImport.Stockinfo;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.DefaultListModel;

/**
 *
 * @author jodic
 */
public class StockNameImport {
 public class Stockinfo{
   private String name;
   private String symbol;
    
   private Stockinfo(String name, String symb){
       this.name = name;
       this.symbol = symb;
   }
   
    public String getSymbol(){
        return symbol;
    }
    public String getName(){
        return name;
    }
   @Override
    public String toString(){ 
       return "("+this.symbol+")"+this.name;
    }
    }
    public void getDlmItems(DefaultListModel<Stockinfo> dlm){
        //readin from json
        ArrayList<Stockinfo>stocks = new ArrayList<>();
       
        File stocktxt = new File(getClass().getResource("/names.txt").getFile()); 
            try {
            Scanner x = new Scanner(stocktxt); 
            while(x.hasNext()){
               String stockname = x.nextLine();
               String stockcode = x.nextLine();
               Stockinfo name = new Stockinfo(stockname, stockcode);
               stocks.add(name);
               dlm.addElement(name);
            }
           x.close();
            
        } catch (FileNotFoundException ex) {
           System.out.println("Somehing went wrong while looking for the file");
        }
    
    }
}
