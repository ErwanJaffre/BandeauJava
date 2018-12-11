
package projetbandeau;

import javax.swing.*;
import java.awt.*;
import java.awt.RenderingHints;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.geom.AffineTransform;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.FontMetrics;


public class Scenario {
    
    private final Bandeau monBandeau = new Bandeau();

    public static void main(String[] args) {
        new Scenario().pub();
    }

    public void pub() {
        
        monBandeau.setMessage("ON");
        monBandeau.sleep(200);
        monBandeau.setMessage("EST");
        monBandeau.sleep(200);
        monBandeau.setMessage("CHAMPION ★★");
        monBandeau.sleep(1000);
        monBandeau.setMessage("ON");
        monBandeau.sleep(200);
        monBandeau.setMessage("EST");
        monBandeau.sleep(200);
        monBandeau.setMessage("TOUS");
        monBandeau.sleep(200);
        monBandeau.setMessage("ENSEMBLE");
        monBandeau.sleep(1000);
        monBandeau.setMessage("C'EST");
        monBandeau.sleep(200);
        monBandeau.setMessage("LE GRAND JOUR");
        monBandeau.sleep(1000);
        
    }
    
}
