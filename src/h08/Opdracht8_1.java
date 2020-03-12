package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button reset;
    String s;

    public void init() {
        tekstvak = new TextField("", 20);
        knop = new Button("Ok");
        knop.addActionListener( new KnopListener() );
        reset = new Button("Reset");
        reset.addActionListener( new ResetListener() );
        add(tekstvak);
        add(knop);
        add(reset);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("Type iets hier.", 50, 60 );
        g.drawString(s, 50, 100 );
    }

    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class ResetListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText("");
            repaint();
        }
    }
}
