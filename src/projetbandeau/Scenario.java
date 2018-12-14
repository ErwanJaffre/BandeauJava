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
import java.util.ArrayList;
import java.util.LinkedList;

public class Scenario {

    private Bandeau monBandeau = new Bandeau();

    protected ArrayList<Effet> mesAnimations = new ArrayList<>();
    protected ArrayList<Integer> repetition = new ArrayList<>();

    public Scenario(Bandeau b) {
        this.monBandeau = b;
    }

    public void ajouterEffet(Effet e, int rep) {
        mesAnimations.add(e);
        repetition.add(rep);
    }

    public void Lancer() {
        for (Effet a : mesAnimations) {
            for (int i = 0; i < repetition.get(mesAnimations.indexOf(a)); i++) {
                a.afficheToiSur();
            }
        }
    }

}
