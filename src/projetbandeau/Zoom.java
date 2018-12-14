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
 * @author ejaffre
 */
public class Zoom extends Effet {

    private Bandeau b;

    public Zoom(Bandeau b) {
        this.b = b;
        b.setBackground(Color.BLACK);
    }

    public void afficheToiSur() {

        for (int j = 0; j < 200; j += 5) {
            b.setFont(new Font(null, Font.BOLD, 40 + j));
            b.sleep(70);

        }
    }
}
