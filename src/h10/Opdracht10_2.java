package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_2 extends Applet {

    TextField tekstvak;
    int hoogstecijfer;
    int laagstecijfer;
    boolean eerstecijfer;

    public void init() {
        setSize(600, 300);
        tekstvak = new TextField("", 20);
        eerstecijfer = true;
        hoogstecijfer = 0;
        laagstecijfer = 0;
        Button knop = new Button("Ok");
        knop.addActionListener(new knopListener());

        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {

        g.drawString("Hoogste Getal: " + hoogstecijfer, 200, 50);
        g.drawString("Laagste Getal: " + laagstecijfer, 200, 70);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            int invoer = Integer.parseInt(s);
            if (eerstecijfer) {
                eerstecijfer = false;
                hoogstecijfer = invoer;
                laagstecijfer = invoer;
            }
            else {
                if(invoer > hoogstecijfer) {
                    hoogstecijfer = invoer;
                }
                else {
                    if (invoer < laagstecijfer) {
                        laagstecijfer = invoer;
                    }
                }
            }
            repaint();
        }
    }
}