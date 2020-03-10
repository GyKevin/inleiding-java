package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_6 extends Applet {

    //Opdracht 4.4
    public void init() {
        setSize(900, 900);
        setBackground(Color.cyan);
    }

    public void paint(Graphics g) {
        g.setColor(Color.darkGray);
        g.fillRect(200, 200, 200, 300);
        g.fillRect(260, 260, 80, 600);
        g.setColor(Color.red);
        g.fillArc(260, 210, 80, 80, 360, 360);
        g.setColor(Color.yellow);
        g.fillArc(260, 300, 80, 80, 360, 360);
        g.setColor(Color.green);
        g.fillArc(260, 400, 80, 80, 360, 360);

    }
}