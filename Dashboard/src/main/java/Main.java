
import StartWindows.StartScreen;
import api.CovidConnection;
import com.github.weisj.darklaf.LafManager;
import com.github.weisj.darklaf.theme.DarculaTheme;
import javax.swing.JOptionPane;

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
        LafManager.setTheme(new DarculaTheme());
       LafManager.install();
        StartScreen ss = new StartScreen();
        ss.setVisible(true);
    }
}
