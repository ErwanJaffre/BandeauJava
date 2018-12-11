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
    private final Etoile e = new Etoile(monBandeau);
    private final Drapeau dp = new Drapeau(monBandeau);
    private final Chanson c = new Chanson(monBandeau);
    private final Zoom z = new Zoom(monBandeau);

    public static void main(String[] args) {
        new Scenario().pub();
    }

    public void pub() {

        e.afficheToiSur(2);
        dp.afficheToiSur(2);
        c.afficheToiSur(1);
        z.afficheToiSur(1);
    }

}
