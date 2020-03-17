package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H08_Praktijkopdracht extends Applet {
    TextField tekstvak;
    TextField tekstvak2;
    double Plus;
    double Min;
    double vermenigvuldigen;
    double delen;

    public void init() {
        setSize(500, 300);

        tekstvak = new TextField("", 20);
        tekstvak2 = new TextField("", 20);

        Button Plus = new Button("+");
        Plus.addActionListener( new PlusListener() );

        Button Min = new Button("-");
        Min.addActionListener( new MinListener() );

        Button vermenigvuldigen = new Button("*");
        vermenigvuldigen.addActionListener( new vermenigvuldigenListener() );

        Button delen = new Button("/");
        delen.addActionListener( new delenListener() );

        add(tekstvak);
        add(tekstvak2);
        add(Plus);
        add(Min);
        add(vermenigvuldigen);
        add(delen);
    }

    public void paint(Graphics g) {

        g.drawString("Optellen: " + Plus, 50, 60 );
        g.drawString("Aftreken: " + Min, 50, 80 );
        g.drawString("Vermenigvuldigen: " + vermenigvuldigen, 50, 100 );
        g.drawString("Delen door: " + delen, 50, 120 );
    }

    class PlusListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            double invoer = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double invoer2 = Double.parseDouble(s2);
            Plus = invoer + invoer2;
            repaint();
        }
    }

    class MinListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            double invoer = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double invoer2 = Double.parseDouble(s2);
            Min = invoer - invoer2;
            repaint();
        }
    }

    class vermenigvuldigenListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            double invoer = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double invoer2 = Double.parseDouble(s2);
            vermenigvuldigen = invoer * invoer2;
            repaint();
        }
    }

    class delenListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            String s = tekstvak.getText();
            double invoer = Double.parseDouble(s);
            String s2 = tekstvak2.getText();
            double invoer2 = Double.parseDouble(s2);
            vermenigvuldigen = invoer / invoer2;
            repaint();
        }
    }
}
