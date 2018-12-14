package projetbandeau ;

import java.awt.Color;

/**
 *
 * @author rbonnafo
 */
public class Drapeau extends Effet {

    private Bandeau b;

    public Drapeau(Bandeau b) {
        this.b = b;
        b.setBackground(Color.WHITE);
    }

    @Override
    public void afficheToiSur() {

      

            b.setBackground(Color.BLUE);
            b.sleep(300);

            b.setBackground(Color.WHITE);
            b.sleep(300);

            b.setBackground(Color.RED);
            b.sleep(300);

        
    }

    }
