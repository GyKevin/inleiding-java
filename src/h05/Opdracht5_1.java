package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_1 extends Applet {

    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    //Opdracht 4.4
    public void init() {
        setSize(1280, 720);
        setBackground(Color.white);
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 150;
        hoogte = 75;
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        //Lijn
        g.drawLine(50, 50, 200, 50);
        g.drawString("Lijn", 100, 65);
        //Rechthoek
        g.drawRect(50, 100, breedte, hoogte);
        g.drawString("Rechthoek", 100, 200);
        //Gevulde recthoek met oval
        g.setColor(opvulkleur);
        g.fillRect(250, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(250, 100, breedte, hoogte, 360, 360);
        g.drawString("Gevulde recthoek met oval", 250, 200);
        //Taartpunt met ovaal eromheen
        g.drawArc(450, 100, breedte, hoogte, 360, 360);
        g.setColor(opvulkleur);
        g.fillArc(450, 100, breedte, hoogte, 360, 50);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 450, 200);
        //Afgeronde rechthoek
        g.drawRoundRect(50, 250, breedte, hoogte, 30, 30);
        g.drawString("Afgeronde rechthoek", 70, 350);
        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillArc(250, 250, breedte, hoogte, 360, 360);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 280, 350);
        //Cirkel
        g.drawArc(500, 250, 75, 75, 360, 360);
        g.drawString("Cirkel", 520, 350);
    }
}