package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht10_5 extends Applet {
    TextField eerstecijfer;
    TextField tweedecijfer;
    TextField derdecijfer;
    TextField vierdecijfer;
    TextField vijfdecijfer;
    double cijfer1;
    double cijfer2;
    double cijfer3;
    double cijfer4;
    double cijfer5;
    double gemiddelde;
    String eindcijfer = "";
    String gemiddeldeCijfer = "";
    Button button;


    public void init() {
        setSize(600, 300);
        button = new Button("Ok");
        button.addActionListener(new gemmideldelistener());
        add(button);

        eerstecijfer = new TextField(5);
        add(eerstecijfer);
        tweedecijfer = new TextField(5);
        add(tweedecijfer);
        derdecijfer = new TextField(5);
        add(derdecijfer);
        vierdecijfer = new TextField(5);
        add(vierdecijfer);
        vijfdecijfer = new TextField(5);
        add(vijfdecijfer);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde, 100, 100);
        g.drawString("Je bent " + eindcijfer, 100, 120);
        g.drawString("Jouw gemmidelde cijfers zijn " + gemiddeldeCijfer, 100, 50);
    }

    class gemmideldelistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            cijfer1 = Double.parseDouble(eerstecijfer.getText());
            cijfer2 = Double.parseDouble(tweedecijfer.getText());
            cijfer3 = Double.parseDouble(derdecijfer.getText());
            cijfer4 = Double.parseDouble(vierdecijfer.getText());
            cijfer5 = Double.parseDouble(vijfdecijfer.getText());

            if (cijfer1 > 5.5 || cijfer2 > 5.5 || cijfer3 > 5.5 || cijfer4 > 5.5 || cijfer5 > 5.5) {
                gemiddeldeCijfer = "voldoende";
            } else {
                gemiddeldeCijfer = "onvoldoende";
            }
            gemiddelde = (cijfer1 + cijfer2 + cijfer3 + cijfer4 + cijfer5) / 5;
            if (gemiddelde > 5.5) {
                eindcijfer = "geslaagd!";
            } else {
                eindcijfer = "gezakt!";
            }

            repaint();
        }
    }
}