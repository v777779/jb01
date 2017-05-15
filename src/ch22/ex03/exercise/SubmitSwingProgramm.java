package ch22.ex03.exercise;

import lib.swing.SwingConsole;
import lib.utils.Time;

import javax.swing.*;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SubmitSwingProgramm extends JFrame {
    private static SubmitSwingProgramm ssp; // этот объект
    private JLabel label;

    public SubmitSwingProgramm() {
        label = new JLabel("A label");
        add(label); // frame.add(label)
     }

    public static void check() {
// головной поток
        ssp = new SubmitSwingProgramm();
        SwingConsole.run(ssp,300,100);
        Time.sleep(1000);

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
