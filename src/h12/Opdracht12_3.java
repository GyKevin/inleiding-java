package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht12_3 extends Applet {
    TextField[] tekstvak;
    Double[] getallen;
    Button knop;

    public void init() {
        tekstvak = new TextField[5];
        getallen = new Double[5];
        for (int i = 0; i < tekstvak.length; i++) {
            tekstvak[i] = new TextField("");
            add(tekstvak[i]);
        }
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add (knop);
    }

    public void paint(Graphics g) {

    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < tekstvak.length; i++) {
                getallen[i] = Double.parseDouble(tekstvak[i].getText());
            }
            Arrays.sort(getallen);

            for (int i = 0; i < getallen.length; i++) {
                tekstvak[i].setText(String.valueOf(getallen[i]));
            }
            repaint();
        }
    }
}
