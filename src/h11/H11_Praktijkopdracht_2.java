package h11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H11_Praktijkopdracht_2  extends Applet {
    Button knop;
    int tafel;
    int uitkomst, y = 20;

    public void init() {
        setSize(600, 900);
        knop = new Button("Volgende tafel");
        knop.addActionListener(new knopListener());
        add(knop);
    }

    public void paint(Graphics g) {
        for (int i = 1; i < 40; i++) {

            uitkomst = tafel * i;
            g.drawString("" + uitkomst, 50, y);
            y += 20;
        }
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            y = 50;
            tafel++;
            repaint();
        }
    }
}