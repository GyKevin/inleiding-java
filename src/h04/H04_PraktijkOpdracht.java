package h04;

import java.applet.Applet;
import java.awt.*;

public class H04_PraktijkOpdracht extends Applet {

    //Opdracht 4.4
    public void init() {
        setSize(1280, 720);
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        //Lijn
        g.drawLine(50, 50, 200, 50);
        g.drawString("Lijn", 100, 65);
        //Rechthoek
        g.drawRect(50, 100, 150, 75);
        g.drawString("Rechthoek", 100, 200);
        //Gevulde recthoek met oval
        g.setColor(Color.magenta);
        g.fillRect(250, 100, 150, 75);
        g.setColor(Color.BLACK);
        g.drawArc(250, 100, 150, 75, 360, 360);
        g.drawString("Gevulde recthoek met oval", 250, 200);
        //Taartpunt met ovaal eromheen
        g.drawArc(450, 100, 150, 75, 360, 360);
        g.setColor(Color.magenta);
        g.fillArc(450, 100, 150, 75, 360, 50);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen", 450, 200);
        //Afgeronde rechthoek
        g.drawRoundRect(50, 250, 150, 75, 30, 30);
        g.drawString("Afgeronde rechthoek", 70, 350);
        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillArc(250, 250, 150, 75, 360, 360);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal", 280, 350);
        //Cirkel
        g.drawArc(500, 250, 75, 75, 360, 360);
        g.drawString("Cirkel", 520, 350);


    }
}