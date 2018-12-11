package projetbandeau;

import java.awt.Color;

/**
 *
 * @author rbonnafo
 */
public class Etoile extends Effet {

    private Bandeau b;
    

    public Etoile(Bandeau b) {
        this.b = b;
        b.setBackground(Color.BLACK);
    }

   
    public void afficheToiSur(int n) {
        
        for (int i = 1; i <= n; i++) {
            
            b.sleep(500);

            b.setForeground(Color.YELLOW);

            b.setMessage("★");
            b.setBackground(Color.BLACK);
            b.sleep(500);
            b.setBackground(Color.BLUE);
            b.setForeground(Color.BLUE);

            b.sleep(500);

            b.setMessage("★★");
            b.setBackground(Color.BLACK);
            b.setForeground(Color.YELLOW);

            b.sleep(500);
            b.setBackground(Color.WHITE);
            b.setForeground(Color.WHITE);

            b.sleep(500);

            b.setMessage("CHAMPION");
            b.setBackground(Color.BLACK);
            b.setForeground(Color.YELLOW);

            b.sleep(500);
            b.setBackground(Color.RED);
            b.setForeground(Color.RED);

            b.sleep(500);

            b.setMessage("ON EST CHAMPION ★★");
            b.setBackground(Color.BLACK);
            b.setForeground(Color.YELLOW);

          
        }
    }

}
