package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdracht8_2 extends Applet {

    Button knopVrouwen;
    Button knopMannen;
    Button knopMeisjes;
    Button knopJongens;

    int aantalVrouwen;
    int aantalMannen;
    int aantalMeisjes;
    int aantalJongens;
    int totaal;


    public void init() {
        setSize(600, 300);
        knopMannen = new Button("Mannen");
        knopMannen.addActionListener( new MannenListener() );
        knopVrouwen = new Button("Vrouwen");
        knopVrouwen.addActionListener( new VrouwenListener() );
        knopMeisjes = new Button("Meisjes");
        knopMeisjes.addActionListener( new MeisjesListener() );
        knopJongens = new Button("Jonges");
        knopJongens.addActionListener( new JongensListener() );

        aantalJongens = 0;
        aantalMannen = 0;
        aantalMeisjes = 0;
        aantalVrouwen = 0;
        totaal = 0;

        add(knopMannen);
        add(knopVrouwen);
        add(knopMeisjes);
        add(knopJongens);
    }

    public void paint(Graphics g) {
        g.drawString("Mannen: "+ aantalMannen, 200, 50);
        g.drawString("vrouwen: "+ aantalVrouwen, 200, 100);
        g.drawString("meisjes: " + aantalMeisjes, 200, 150);
        g.drawString("jonges: " + aantalJongens, 200, 200);
        g.drawString("totaal: " + totaal, 200, 250);

    }

    class MannenListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            aantalMannen++;
            totaal++;
            repaint();
        }
    }
    class VrouwenListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            aantalVrouwen++;
            totaal++;
            repaint();
        }
    }
    class MeisjesListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            aantalMeisjes++;
            totaal++;
            repaint();
        }
    }
    class JongensListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {

            aantalJongens++;
            totaal++;
            repaint();
        }
    }
}
