package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_3 extends Applet {
    TextField tekstvak;
    String response;

    public void init() {
        setSize(600, 300);
        tekstvak = new TextField("", 20);
        add(tekstvak);
        tekstvak.addActionListener(new MaandListener());
        response = "...";

    }

    public void paint(Graphics g) {
        g.drawString(response, 50, 100);
    }

    class MaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            int maand = Integer.parseInt(userInput);

            if (maand < 1 || maand > 12) {
                response = "Geef een geldig getal.";
                repaint();
            }

            switch (maand) {
                case 1: response = "Januari heeft 31 dagen."; repaint(); break;
                case 2: response = "Februari heeft 28 of 29 dagen."; repaint(); break;
                case 3: response = "Maart heeft 31 dagen."; repaint(); break;
                case 4: response = "April heeft 30 dagen."; repaint(); break;
                case 5: response = "Mei heeft 31 dagen."; repaint(); break;
                case 6: response = "Juni heeft 30 dagen."; repaint(); break;
                case 7: response = "Juli heeft 31 dagen."; repaint(); break;
                case 8: response = "Augustus heeft 31 dagen."; repaint(); break;
                case 9: response = "September heeft 30 dagen."; repaint(); break;
                case 10: response = "Oktober heeft 31 dagen."; repaint(); break;
                case 11: response = "November heeft 30 dagen."; repaint(); break;
                case 12: response = "December heeft 31 dagen."; repaint(); break;

            }
        }
    }
}