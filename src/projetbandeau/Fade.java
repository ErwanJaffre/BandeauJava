/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbandeau;



import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author ejaffre
 */
public class Fade extends Effet {
    
    private Bandeau b;

    
    public Fade(Bandeau bandeau){
         this.b = bandeau;
     }

    @Override
    public void afficheToiSur() {
         Color c;
         for(int i=0;i<255;i++){
             b.setBackground( c = new Color(255-i,i,0));
             b.sleep(10);
         }
         for(int i=255;i>0;i--){
             b.setBackground( c = new Color(0+i,i,0));
             b.sleep(10);
         }
    }
    
    
    
}
