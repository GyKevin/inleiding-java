package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class H12_Praktijkopdracht extends Applet {
    TextField namentekst;
    TextField telefoontekst;

    Label telefoonlabel;
    Label namenlabel;

    String[] namen;
    String[] telefoon;
    String namenstring;
    String telefoonstring;

    Button knop;

    int index;
    int aantal;
    int y = 100;


    public void init() {
        setSize(900,400);
        telefoontekst = new TextField("",10);
        namentekst = new TextField("",10);

        telefoonlabel = new Label ("Vul hier jouw telefoonnummer in");
        namenlabel = new Label("Vul hier jouw naam in");

        namen = new String[10];
        telefoon = new String[10];

        knop = new Button ("OK");
        knop.addActionListener(new knopListener());

        add(telefoonlabel);
        add(telefoontekst);
        add(namenlabel);
        add(namentekst);
        add(knop);

    }


    public void paint(Graphics g) {
        if (index == 10) {
            for(int i = 0; i < namen.length; i++){
                g.drawString("Naam: "+ namen[i],100,y);
                g.drawString("Nummer: "+ telefoon[i],300,y);
                y += 20;
            }
        }
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            telefoonstring = telefoontekst.getText();
            namenstring = namentekst.getText();

            if (index <= 10) {
                namen[index] = namenstring;
                telefoon[index] = telefoonstring;
                aantal++;
                index++;
            }
            repaint();
            telefoontekst.setText("");
            namentekst.setText("");
        }
    }
}