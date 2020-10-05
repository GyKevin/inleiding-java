import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht extends Applet {
    TextField tekstvak;
    int getal;
    String error="";


    public void init (){
        tekstvak = new TextField("", 5);
        add(tekstvak);

        tekstvak.addActionListener(new EnterListener ());
    }

    public void paint (Graphics g) {
        g.drawString(""+error,20,70);

    }

    class EnterListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                getal = Integer.parseInt(tekstvak.getText());
                for (int i = 1; i <= getal; i++) {
                    System.out.println(i);
                }
                error = "";
            }

            catch (NumberFormatException i) {
                error = "no u";
            }
            repaint();
        }
    }
}
