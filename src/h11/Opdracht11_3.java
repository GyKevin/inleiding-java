package h11;

import java.awt.*;
import java.applet.*;


public class Opdracht11_3 extends Applet {
    int a, b, uitkomst, y;

    public void init() {
        setSize(300, 1080);
        a = 0;
        b = 0;
        uitkomst = 1;
        y = 50;
    }

    public void paint(Graphics g) {

        for (int i = 0; i < 100; i++) {
            g.drawString(uitkomst + "", 50, y);
            y += 30;
            a = b;
            b = uitkomst;
            uitkomst = a + b;

        }
    }
}