package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht5_2 extends Applet {

    int hoogteValerie;
    int hoogteHans;
    int hoogteJeroen;
    //Opdracht 5.2
    public void init() {
        setSize(900, 900);
        setBackground(Color.darkGray);
        hoogteHans = 400;
        hoogteValerie = 200;
        hoogteJeroen = 500;
    }
    public void paint(Graphics g) {

        g.setColor(Color.white);
        //outline
        g.drawLine(200, 200, 200, 800);
        g.drawLine(200, 800, 800, 800);
        //stats (20kg=100px)
        g.fillRect(250, 600, 50, hoogteValerie);
        g.fillRect(350, 400, 50, hoogteHans);
        g.fillRect(450, 300, 50, hoogteJeroen);
        //text
        g.drawString("Valerie 40kg", 240, 830);
        g.drawString("Hans 80kg", 340, 830);
        g.drawString("Jeroen 100kg", 440, 830);



    }

}
