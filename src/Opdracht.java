import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht extends Applet {
    TextField tekstvak;
    int getal;
    String error="";
    int totaal;


    public void init (){
        setSize(400,800);

        tekstvak = new TextField("", 5);
        add(tekstvak);

        tekstvak.addActionListener(new EnterListener ());
    }

    public void paint (Graphics g) {
        totaal = 0;
        try {
            getal = Integer.parseInt(tekstvak.getText());
            for (int i = 1; i <= getal; i++) {
                if (i % 2 == 0) {

                    if (i % 6 == 0) {
                        totaal += i*i;
                        g.drawString("" + i*i,20,60+i*10);

                    }
                    else {
                        totaal += i;
                        g.drawString("" + i,20,60+i*10);
                    }
                }
            }
            System.out.println("totaal: " + totaal);
            g.drawString("totaal: " + totaal, 20, 60+(getal+2)*10);
            error = "";
        }

        catch (NumberFormatException i) {
            error = "no u";
        }
        g.drawString(""+error,20,70);
    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            repaint();
        }
    }
}
