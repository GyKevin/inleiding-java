package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht12_5 extends Applet {
    int[] getallen = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    boolean found;
    boolean clicked;
    TextField tekstvak;
    Button knop;
    int index;


    public void init() {
        tekstvak = new TextField("", 5);
        knop = new Button("OK");
        knop.addActionListener(new knopListener());
        found = false;
        add(tekstvak);
        add(knop);
    }


    public void paint(Graphics g) {
        if (clicked) {
            if (found) {
                g.drawString("De waarde is gevonden op index " + index, 50, 80);
            } else {
                g.drawString("De waarde is niet gevonden", 50, 80);
            }
        }
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            found = false;
            int s = Integer.parseInt(tekstvak.getText());
            clicked = true;
            int i = 0;
            while ((i<getallen.length)&&(found==false)) {
                if (getallen[i]==s) {
                    found=true;
                    index = i;
                    break;
                } else {
                    found = false;

                }
                i++;
            }
            repaint();
        }
    }
}