package lib.swing;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SineDraw extends JPanel {
    private static final int SCALEFACTOR = 200;
    private static final int MAXOFFSET = 200;

    private int cycles;
    private int points;
    private double[] sines;
    private int[] pts;
    private int offset;

    public SineDraw() {
        setCycles(5); // начальная установка
        offset = 1;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int maxWidth = getWidth();
        int maxHeight = getHeight();
        double hStep = (double) maxWidth / (double) points;
        pts = new int[points];
        for (int i = 0; i < points; i++) {
            pts[i] = (int) (sines[i] * maxHeight / 2 * 0.95 + maxHeight / 2);
        }
        g.setColor(Color.RED);
        for (int i = 1; i < points; i++) {
            int x1 = (int) ((i - 1) * hStep);
            int x2 = (int) ((i) * hStep);
            int y1 = pts[i - 1];
            int y2 = pts[i];
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
        System.out.println(cycles);
        points = SCALEFACTOR * cycles * 2; // 2*PI*cycles
        sines = new double[points];
        for (int i = 0; i < points; i++) {
            double radians = (Math.PI / SCALEFACTOR) * i;
            sines[i] = Math.sin(radians);
        }
        repaint();
    }

    public void setOffset(int offset) {
        double[] clone = new double[points];

        int rOffset =  (offset - this.offset) * points / MAXOFFSET; // смещение delta

        if (rOffset >= points) {
            rOffset = rOffset - points;
        }
        if (rOffset < 0) {
            rOffset += points;
        }


        int j = 0;
        for (int i = rOffset; i < points; i++) {
            clone[j++] = sines[i];
        }
        for (int i = 0; i < rOffset; i++) {
            clone[j++] = sines[i];
        }
            sines = clone;
        this.offset = offset; // смещение по реальному массиву
        repaint();
    }

}
