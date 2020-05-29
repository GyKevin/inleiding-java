package h12;

import java.awt.*;
import java.applet.*;

public class Opdracht12_1 extends Applet {
    double[] cijfers = {1,2,3,4,5,6,7,8,9,10};
    double gemiddelde;
    double plus = 0;


    public void init() {
        for (int teller = 0; teller < cijfers.length; teller++) {
            plus = plus + cijfers[teller];

        }
        gemiddelde = plus / cijfers.length;
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < cijfers.length; teller++) {
            g.drawString("" + cijfers[teller], 50, 20 * teller + 20);
            g.drawString("het gemiddelde is: " + gemiddelde, 100, 20);
        }
    }
}