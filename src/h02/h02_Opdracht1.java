import java.awt.*;
import java.applet.*;

public class h02_Opdracht1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Kevin Gyori", 50, 60 );
    }
}