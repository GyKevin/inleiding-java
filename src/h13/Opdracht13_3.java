package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht13_3 extends Applet {
    int y = 100;
    int x = 100;
    int hoogte = 30;
    int betonHoogte = 60;
    int breedte = 60;
    Button rodeMuur;
    Button grijzeBeton;
    Boolean rodeMuurBoolean;
    Boolean grijzeBetonBoolean;

    public void init() {
        setSize(1280, 720);

        rodeMuur = new Button("Rode Muur");
        rodeMuur.addActionListener(new rodeMuurListener());

        grijzeBeton = new Button("Grijze Beton");
        grijzeBeton.addActionListener(new grijzeBetonListener());

        add(rodeMuur);
        add(grijzeBeton);
    }


    public void paint(Graphics g) {
        tekenMuur(g, x, y, hoogte, breedte);
        tekenBeton(g, x, y, betonHoogte, breedte);
    }


    class rodeMuurListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rodeMuurBoolean = true;
            grijzeBetonBoolean = false;
            repaint();
        }
    }


    class grijzeBetonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            rodeMuurBoolean = false;
            grijzeBetonBoolean = true;
            repaint();
        }
    }
    void tekenMuur(Graphics g,int x, int y, int hoogte, int breedte) {
        if (rodeMuurBoolean) {
            for (int i = 0; i < 10; i++) {
                x = 20;
                for (int o = 0; o < 20; o++) {
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

    void tekenBeton(Graphics g, int x, int y, int betonHoogte, int breedte) {
        if (grijzeBetonBoolean) {
            for (int i = 0; i < 10; i++) {
                x = 20;
                for (int o = 0; o < 20; o++) {
                    g.setColor(Color.gray);
                    g.fillRect(x, y, breedte, betonHoogte);
                    g.setColor(Color.lightGray);
                    g.drawRect(x, y, breedte, betonHoogte);
                    x += breedte;
                }
                y += betonHoogte;
            }
        }
    }
}