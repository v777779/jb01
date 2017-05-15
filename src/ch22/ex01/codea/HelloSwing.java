package ch22.ex01.codea;

import javax.swing.*;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HelloSwing {
    public static void check() {
        JFrame frame = new JFrame("Hello Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрыть программу по закрытию окна
        frame.setSize(300, 100); // размер
        frame.setVisible(true); // включить окно
    }

}
