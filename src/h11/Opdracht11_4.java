package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_4  extends Applet {


    public void init(){
        setSize(300, 1080);
    }

    public void paint(Graphics g){
        int uitkomst, y = 20;
        int tafel = 3;

        for(int i = 1; i < 99; i ++){

            uitkomst = tafel * i;
            g.drawString("" + uitkomst, 50, y);
            y += 20;
        }
    }


}