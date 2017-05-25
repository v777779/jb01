package ch22.ex34.codea;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class CBox extends JPanel implements Runnable {  // панель со своим потоком и локальной фоновой задаче
    private static int counter = 0;
    private final int id = counter++;

    private int pause;
    private Random rnd = new Random();
    private Color color = new Color(0);

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(color);
        Dimension dim = getSize(); // свои размеры
        g.fillRect(0, 0, dim.width, dim.height);
    }

    public CBox(int pause) {  // параметр только пауза
        this.pause = pause;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()) {
                color = new Color(rnd.nextInt(0xFFFFFF));
                repaint();                                  // асинхронный ??? запрос на перерисовку
                TimeUnit.MILLISECONDS.sleep(pause);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
