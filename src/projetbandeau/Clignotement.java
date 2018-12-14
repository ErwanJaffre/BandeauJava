/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbandeau;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author psandre
 */
public class Clignotement extends Effet {

    private Bandeau b;

    public Clignotement(Bandeau band) {
        this.b = band;
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
    }

    public void afficheToiSur() {
      
        for (int i = 1; i <= 10; i++) {
            b.setBackground(Color.BLACK);
            b.setForeground(Color.WHITE);
            b.sleep(100);
            b.setBackground(Color.WHITE);
            b.setForeground(Color.BLACK);
            b.sleep(100);
        }
    }
}
