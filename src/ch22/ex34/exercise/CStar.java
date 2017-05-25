package ch22.ex34.exercise;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CStar extends JPanel implements Runnable {  // панель со своим потоком и локальной фоновой задаче
    private static int counter = 0;
    private final int id = counter++;

    private int pause;
    private Random rnd = new Random();
    private Color color = new Color(0);
    private int[] pX;
    private int[] pY;
    private int nVertices;

    public CStar(int pause, int nVertices) {  // параметр только пауза
        this.pause = pause;
        this.nVertices = nVertices;
    }


    public void makePolygon() {
        System.out.println("Make Polygon "+this+" "+pause);
        double angle = rnd.nextInt(90);  // стартовый угол
        pX = new int[nVertices * 2];
        pY = new int[nVertices * 2];

        Dimension dim = this.getSize();         // свои размеры
        int cX = dim.width / 2;                   // по центру панели
        int cY = dim.height / 2;
        int radius = (dim.width > dim.height ? dim.height / 2 : dim.width / 2);
        int nPoints = pX.length;                // число точек

        for (int i = 0; i < nPoints; i++) {
            int len = (i % 2 == 0 ? radius : radius / 2);
            double x = Math.cos(2 * Math.PI * ((double) i / nPoints + angle / 360)) * len;
            double y = Math.sin(2 * Math.PI * ((double) i / nPoints + angle / 360)) * len;
            pX[i] = (int) x + cX;
            pY[i] = (int) y + cY;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);  // вызывать обязательно чтобы не было искажений
        color = new Color(rnd.nextInt(0xFFFFFF));
        if (pX == null) {
            makePolygon(); // обновить полигон
        }
        g.setColor(color);
        g.fillPolygon(pX, pY, pX.length);

    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                color = new Color(rnd.nextInt(0xFFFFFF));
                // getParent().repaint();      // если не используется super.paintComponent(g)
                repaint();                      // super.paintComponent(g) ОБЯЗАТЕЛЬНО
                TimeUnit.MILLISECONDS.sleep(pause);
            }
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
    }

    @Override
    public String toString() {
        return "CBox " + id;
    }
}
