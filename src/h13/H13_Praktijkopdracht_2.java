package h13;

import java.awt.*;
import java.applet.*;


public class H13_Praktijkopdracht_2 extends Applet {
    int x;
    int y;
    int hoogte;
    int breedte;
    int bladeren;
    int aantal;
    int boomRij;

    public void init() {
        setSize(1200,500);
    }


    public void paint(Graphics g) {
        bladeren = 100;
        breedte = 30;
        hoogte = 100;
        aantal = 10;
        boomRij = 2;
        x = 50;
        y = 100;
        boomgaard(g, aantal, boomRij);
    }


    void boomgaard(Graphics g, int aantal ,int boomRij) {
        for (int i = 0; i < boomRij; i++) {
            x = 50;
            for (int o = 0; o < aantal; o++) {
                tekenboom(g, x, y, bladeren, hoogte, breedte);
                x += bladeren +10;
            }
            y += bladeren + hoogte +10;
        }
    }
    public void tekenboom(Graphics g, int x, int y, int bladeren, int hoogte, int breedte) {
        g.setColor(Color.green);
        g.fillOval(x,y,bladeren,bladeren);
        g.setColor(Color.orange);
        g. fillRect(x+bladeren/2 - (breedte /2), y +bladeren, breedte, hoogte);
    }
}