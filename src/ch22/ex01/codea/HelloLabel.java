package ch22.ex01.codea;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HelloLabel {
    public static void check() {
        JFrame frame = new JFrame("Hello SwingL");
        JLabel label = new JLabel("A label");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // закрыть окно
        frame.setSize(300, 100); // размер
        frame.setVisible(true); // включить окно
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        label.setText("Hey! This is Different!");

    }

}
