package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_4 extends Applet {

    //Opdracht 4.4
    public void init() {
        setSize(900, 900);
        setBackground(Color.darkGray);
    }
    public void paint(Graphics g) {

        g.setColor(Color.white);
        //outline
        g.drawLine(200, 200, 200, 800);
        g.drawLine(200, 800, 800, 800);
        //stats (20kg=100px)
        g.fillRect(250, 600, 50, 200);
        g.fillRect(350, 400, 50, 400);
        g.fillRect(450, 300, 50, 500);
        //text
        g.drawString("Valerie 40kg", 240, 830);
        g.drawString("Hans 80kg", 340, 830);
        g.drawString("Jeroen 100kg", 440, 830);



    }

}
