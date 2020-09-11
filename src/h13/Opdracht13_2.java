package h13;

import java.awt.*;
import java.applet.*;



public class Opdracht13_2 extends Applet {
    int y =  30;
    int x = 30;
    int hoogte = 30;
    int breedte = 60;


    public void init() {
        setSize(1250,350);
    }


    public void paint(Graphics g) {

        tekenMuur(g, x, y, hoogte, breedte);
    }


    void tekenMuur(Graphics g,int x, int y, int hoogte, int breedte) {
        for (int i = 0; i < 10; i++) {
            x = 20;
            for (int o = 0; o <20; o++) {
                g.setColor(Color.pink);
                g.fillRect(x, y, breedte, hoogte);
                g.setColor(Color.darkGray);
                g.drawRect(x, y, breedte, hoogte);
                x += breedte;
            }
            y += hoogte;
        }
    }
}