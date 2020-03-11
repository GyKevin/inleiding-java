package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_3 extends Applet {
    int a;
    int b;
    int uitkomst;

    public void init() {
        a = 1073741823;
        b = 1073741829;
        uitkomst = a + b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}