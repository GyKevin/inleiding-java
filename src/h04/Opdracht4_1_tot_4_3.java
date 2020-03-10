import java.awt.*;
import java.applet.*;

public class Opdracht4_1_tot_4_3 extends Applet {

    //Opdracht 4.1
    public void init() {
    }
    public void paint(Graphics g) {
        setBackground(Color.cyan);
        g.setColor(Color.red);
        g.drawLine(50, 200, 200, 30);
        g.drawLine(50, 200, 300, 200);
        g.drawLine(300, 200, 200, 30);
        //Opdracht 4.2
        g.setColor(Color.white);
        g.fillRect(50, 200, 250, 200);
        g.setColor(Color.blue);
        g.fillRect(90, 250, 50, 50);
        g.setColor(Color.darkGray);
        g.fillRect(200, 300, 50, 100);
        g.setColor(Color.green);
        g.fillRect(00, 400, 600, 30);
        //opdracht 4.3
        g.setColor(Color.darkGray);
        g.fillRect(400, 200, 10, 200);
        g.setColor(Color.red);
        g.fillRect(410, 200, 100, 20);
        g.setColor(Color.white);
        g.fillRect(410, 220, 100, 20);
        g.setColor(Color.blue);
        g.fillRect(410, 240, 100, 20);


    }
}