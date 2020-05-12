package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_9  extends Applet {


    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //tweede rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //derde rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //vierde rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //vijfde rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //zesde rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //zevende rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 0  || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
        //achtste rij
        x = 50;
        y += 50;
        for (int kolom = 0; kolom < 8; kolom++) {
            g.drawRect(x, y, 50, 50);

            if(kolom == 1 || kolom == 3 || kolom == 5 || kolom == 7) {
                g.setColor(Color.black);
                g.fillRect(x,y,50,50);
            } else {
                g.drawRect(x,y,50,50);

            }
            x += 50;
        }
    }
}