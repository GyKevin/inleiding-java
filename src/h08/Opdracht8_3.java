package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_3 extends Applet {
    TextField tekstvak;
    double bedragIncl;

    public void init() {
setSize(500, 300);
        tekstvak = new TextField("", 20);
        Button knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        Label label = new Label("Type bedrag");
        add(tekstvak);
        add(knop);
        add(label);

    }

    public void paint(Graphics g) {

        g.drawString("Bedrag incl. BTW: " + bedragIncl, 50, 60 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            double invoer = Double.parseDouble(s);
            bedragIncl = invoer * 1.21;
            repaint();
        }
    }
}
