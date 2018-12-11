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
public class Chanson extends Effet {

    private Bandeau b;

    public Chanson(Bandeau b) {
        this.b = b;
        b.setBackground(Color.BLUE);
    }

    public void afficheToiSur(int n) {

        for (int i = 1; i <= n; i++) {

            b.setBackground(Color.BLUE);
            b.setForeground(Color.YELLOW);
            b.setFont(new Font(null, Font.BOLD, 40));

            b.setMessage("ON");
            b.sleep(300);
            b.setMessage("EST");
            b.sleep(300);
            b.setMessage("CHAMPION ★★");
            b.sleep(1000);

            b.setBackground(Color.WHITE);

            b.setMessage("ON");
            b.sleep(300);
            b.setMessage("EST");
            b.sleep(300);
            b.setMessage("TOUS");
            b.sleep(300);
            b.setMessage("ENSEMBLE");
            b.sleep(1200);

            b.setBackground(Color.RED);

            b.setMessage("C'EST");
            b.sleep(200);
            b.setMessage("LE GRAND JEU");
            b.sleep(1200);

            b.setBackground(Color.BLUE);

            b.setMessage("LA");
            b.sleep(500);
            b.setMessage("FRANCE");
            b.sleep(200);
            b.setMessage("EST");
            b.sleep(200);
            b.setMessage("DEBOUT");
            b.sleep(1200);

            b.setBackground(Color.WHITE); 

            b.setMessage("NOTRE");
            b.sleep(200);
            b.setMessage("PASSION");
            b.sleep(1000);
            b.setMessage("TOUJOURS");
            b.sleep(700);
            b.setMessage("NOUS");
            b.sleep(200);
            b.setMessage("RASSEMBLE");
            b.sleep(1350);
            b.setBackground(Color.RED);

            b.setMessage("ALLEZ LES BLEUS");
            b.sleep(1300);

            b.setBackground(Color.BLUE);

            b.setMessage("ON");
            b.sleep(250);
            b.setMessage("EST");
            b.sleep(250);
            b.setMessage("TOUS");
            b.sleep(300);
            b.setMessage("AVEC");
            b.sleep(300);
            b.setMessage("★★ VOUS ★★");

        }
    }
}
