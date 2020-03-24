package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_1 extends Applet {

    TextField tekstvak;
    int hoogstecijfer;

    public void init() {
        setSize(600, 300);
        tekstvak = new TextField("", 20);
        hoogstecijfer = 0;
        Button knop = new Button("Ok");
        knop.addActionListener(new knopListener());

        add(tekstvak);
        add(knop);

    }

    public void paint(Graphics g) {

        g.drawString("Hoogste Getal: " + hoogstecijfer, 200, 50);
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String s = tekstvak.getText();
            int invoer = Integer.parseInt( s );
            if (invoer > hoogstecijfer) {

                hoogstecijfer = invoer;
            }
            repaint();
        }
    }
}