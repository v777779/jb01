package ch22.ex21.exercise;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SineDrawBean extends JPanel {
    private static final int SCALEFACTOR = 200;

    private int cycles;
    private int points;
    private double[] sines;
    private int[] pts;

    public SineDrawBean() {
        setCycles(5); // начальная установка
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

    public void setCycles(int cycles) {  // меняет число периодов  JSlider
        this.cycles = cycles;
        points = SCALEFACTOR * cycles * 2; // 2*PI*cycles
        sines = new double[points];
        for (int i = 0; i < points; i++) {
            double radians = (Math.PI / SCALEFACTOR) * i;
            sines[i] = Math.sin(radians);
        }
        repaint();                      // перерисовать окно
    }

    // This is the only change for JavaBean Component Compatibility
    public int getCycles() {
        return cycles;
    }
}
