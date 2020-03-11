package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_1 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 113;
        b = 4;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Jan verdient: " + uitkomst, 20, 40);
        g.drawString("Ali verdient: " + uitkomst, 20, 60);
        g.drawString("Jeannette verdient: " + uitkomst, 20, 80);
        g.drawString("Kevin verdient: " + uitkomst, 20, 100);
    }
}