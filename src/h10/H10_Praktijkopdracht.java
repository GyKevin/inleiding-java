package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H10_Praktijkopdracht extends Applet {
    Button ok;
    TextField tekstvak;
    String geldig;

    public void init() {
        setSize(600, 300);
        ok = new Button("Ok");
        ok.addActionListener(new CijferListener());
        add(ok);

        tekstvak = new TextField("", 10);
        add(tekstvak);
        
        geldig = "";
    }

    public void paint(Graphics g) {
        g.drawString("Het cijfer is " + geldig, 50, 100);
    }

    class CijferListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = tekstvak.getText();
            int cijfer = Integer.parseInt(userInput);

            if (cijfer < 1 || cijfer > 10) {
                geldig = "ongeldig.";
            }
            if (cijfer == 1) {
                geldig = "slecht.";
            }
            if (cijfer == 2) {
                geldig = "slecht.";
            }
            if (cijfer == 3) {
                geldig = "slecht.";
            }
            if (cijfer == 4) {
                geldig = "onvoldoende.";
            }
            if (cijfer == 5) {
                geldig = "matig.";
            }
            if (cijfer == 6) {
                geldig = "voldoende.";
            }
            if (cijfer == 7) {
                geldig = "voldoende.";
            }if (cijfer == 8) {
                geldig = "goed.";
            }
            if (cijfer == 9) {
                geldig = "goed.";
            }
            if (cijfer == 10) {
                geldig = "goed.";
            }
            repaint();
        }
    }
}