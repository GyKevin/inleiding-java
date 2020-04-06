package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 10;
        int x = 0;

        while(teller < 20) {
            x += 20;
            g.drawLine(x, 0,x,0);
            g.drawString("" + teller, x, 250 );
            teller++;
        }
    }
}