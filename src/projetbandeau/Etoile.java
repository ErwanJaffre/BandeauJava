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
        b.setBackground(Color.WHITE);
    }

    @Override
    public void afficheToiSur() {
        b.setForeground(Color.YELLOW);
        b.setMessage("★");
        b.sleep(1000);
        b.setBackground(Color.BLACK);

        b.setMessage("★★");
        b.sleep(1000);

        b.setMessage("CHAMPION");
        b.sleep(1000);

        b.setMessage("CHAMPION ★★");

    }

}
