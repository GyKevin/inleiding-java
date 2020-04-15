package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_5  extends Applet {


    public void init(){
        setSize(600, 400);
    }

    public void paint(Graphics g){
        for(int i = 20; i < 120; i+= 20) {
            g.setColor(Color.darkGray);
            g.drawRect(i, i, 20, 20);
        }
    }
}