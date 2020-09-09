package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Opdracht12_6 extends Applet {
    int[] getallen = {1, 2, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 9, 9};
    int array;
    int index;

    TextField tekstvak;
    Button knop;

    public void init() {
        tekstvak = new TextField("");
        knop = new Button("ok");
        knop.addActionListener(new knopListener());
        add(tekstvak);
        add(knop);
    }


    public void paint(Graphics g) {
        g.drawString("Nummer "+array+" komt "+ index+" keer voor in het tabel.",100,80);
        g.drawString("1,2,2,2,3,4,4,5,6,6,7,8,9,9,9,9", 100, 100);
    }


    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            index = 0;
            array = Integer.parseInt(tekstvak.getText());
            for (int i = 0; i < getallen.length; i++) {
                if (array==getallen[i]) {
                    index++;
                }
            }
            repaint();
        }
    }
}