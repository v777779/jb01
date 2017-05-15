package ch22.ex01.codeb;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SubmitManipulationTask {
    public static void check() {
        JFrame frame = new JFrame("Hello SwingB");
        final JLabel label = new JLabel("A label"); // фиксированное значение
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // закрыть программу по закрытию окна
        frame.setSize(300, 100); // размер
        frame.setVisible(true); // включить окно
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                label.setText("Hey! This is Different!");
            }
        });
    }

}
