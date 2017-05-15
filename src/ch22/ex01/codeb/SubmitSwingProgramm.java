package ch22.ex01.codeb;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SubmitSwingProgramm extends JFrame {
    private static SubmitSwingProgramm ssp; // этот объект
    private JLabel label;

    public SubmitSwingProgramm() {
        super("Hello SwingM"); // открываем frame  new JFrame("Hello")
        label = new JLabel("A label");
        add(label); // frame.add(label)
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
     } // конструктор завершил работу

    public static void check() {
// головной поток
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new SubmitSwingProgramm(); // просто создали frame в потоке
            }
        });

        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

// вспомогательный поток
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("Hey! This is Different");
            }
        });

    }

    public static void main(String[] args) {
        check();
    }

}
