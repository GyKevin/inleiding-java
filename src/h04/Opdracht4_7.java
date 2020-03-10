package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_7 extends Applet {

    //Opdracht 4.4
    public void init() {
        setSize(900, 900);
        setBackground(Color.darkGray);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRoundRect(400, 400, 200, 200, 20, 20);
        g.setColor(Color.BLACK);
        g.fillArc(420, 420, 40, 40, 360, 360);
        g.fillArc(540, 420, 40, 40, 360, 360);
        g.fillArc(540, 540, 40, 40, 360, 360);
        g.fillArc(420, 540, 40, 40, 360, 360);

    }
}