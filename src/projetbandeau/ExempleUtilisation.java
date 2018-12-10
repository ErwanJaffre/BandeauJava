package projetbandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleUtilisation {

    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        new ExempleUtilisation().exemple();
    }

    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        monBandeau.sleep(3000);

        monBandeau.setMessage("PAUL");
        monBandeau.sleep(1000);
        monBandeau.setMessage("T'es");
        monBandeau.sleep(1000);
        monBandeau.setMessage("AU TAQUET NEGATIF");
        monBandeau.sleep(1000);
        for (int i = 5; i < 200; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(1000);

        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(700);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(400);

        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(200);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(100);

        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(50);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(25);

        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(10);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(5);

        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(5);
        monBandeau.setBackground(Color.BLACK);
        monBandeau.sleep(5);

        monBandeau.setBackground(Color.WHITE);
        monBandeau.sleep(5);

        monBandeau.setMessage("Monospaced 15 Bold");
        monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("SansSerif 15");
        monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
        monBandeau.sleep(1000);
        monBandeau.setMessage("On va zoomer");
        monBandeau.sleep(1000);
        monBandeau.setMessage("Zoom........");
        for (int i = 5; i < 60; i += 5) {
            monBandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);

        monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
        monBandeau.setMessage("On va tourner");
        monBandeau.sleep(1000);
        monBandeau.setMessage("On tourne...");
        for (int i = 0; i <= 100; i++) {
            monBandeau.setRotation(2 * Math.PI * i / 100);
            monBandeau.sleep(100);
        }

        monBandeau.setMessage("On va changer de couleur de fond");
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.DARK_GRAY);
        monBandeau.setMessage("On va changer de couleur");
        monBandeau.sleep(1000);
        monBandeau.setForeground(Color.YELLOW);
        monBandeau.sleep(1000);
        monBandeau.setFont(font);
        monBandeau.setForeground(fore);
        monBandeau.setBackground(back);
        monBandeau.setMessage("Termine");
        //System.exit(0);
    }
}
