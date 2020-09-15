package h13;

import java.awt.*;
import java.applet.*;



public class H13_Praktijkopdracht_1 extends Applet {
    int x;
    int y;

    public void init() {
        setSize(600,500);
    }


    public void paint(Graphics g) {

        tekenDriehoek(g, x, y);
    }
    void tekenDriehoek(Graphics g, int x ,int y) {
        x = 300;
        y = 300;
        g.setColor(Color.ORANGE);
        g.fillRect(x,y,30,100);
        g.setColor(Color.GREEN);
        g.fillArc(265,250,100,100,360,360);
    }
}