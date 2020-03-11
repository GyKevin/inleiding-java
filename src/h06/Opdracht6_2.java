package h06;

import java.awt.*;
import java.applet.*;


public class Opdracht6_2 extends Applet {
    int seconden;
    int uur;
    int dag;
    int jaar;
    int uitkomstUur;
    int uitkomstDag;
    int uitkomstJaar;

    public void init() {
        seconden = 60;
        uur = 60;
        dag = 24;
        jaar = 365;

        uitkomstUur = seconden * 60;
        uitkomstDag = dag * 3600;
        uitkomstJaar = jaar * 86400;

    }

    public void paint(Graphics g) {
        g.drawString("Een uur heeft zoveel seconden: " + uitkomstUur, 20, 20);
        g.drawString("Een dag heeft zoveel seconden: " + uitkomstDag, 20, 40);
        g.drawString("Een jaar heeft zoveel seconden: " + uitkomstJaar, 20, 60);

    }
}