
import api.CovidConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jodic
 */
public class Main {
    public static void main(String[] args){
        CovidConnection cc = new CovidConnection("Massachusetts");
        cc.print();
    }
}
