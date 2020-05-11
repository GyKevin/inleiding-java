package h11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht11_8  extends Applet {


    public void init(){
        setSize(600, 600);
    }

    public void paint(Graphics g){
        int invoer = 50;
        for(int i = 500; i >= 10; i -= 10) {

            g.drawOval(invoer, invoer, i, i);
        }
    }
}