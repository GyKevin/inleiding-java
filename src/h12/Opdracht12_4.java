package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht12_4 extends Applet {
    TextField tekstvak;
    TextField[] tabel;
    //Double getallen;
    Button knop;
    Label label;

    public void init() {
        setSize(850, 300);
        tekstvak = new TextField("", 5);
        label = new Label("type een nummer in");
        knop = new Button("Ok");
        knop.addActionListener(new knopListener());
        add (label);
        add (tekstvak);
        add (knop);
        tabel= new TextField[20];
        for (int i = 0; i < tabel.length; i++) {
            tabel[i] = new TextField("");
            add (tabel[i]);
        }
    }

    public void paint(Graphics g) {
        
    }

    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }
}