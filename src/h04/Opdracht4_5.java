package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_5 extends Applet {

    //Opdracht 4.4
    public void init() {
        setSize(900, 900);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillArc(20, 20, 200, 100, 360, 360);

    }
}