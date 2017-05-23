package ch22.ex31.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ProgressAsimpt extends JFrame {
    private final int MAXVALUE = 100;
    private JProgressBar jProgressBar = new JProgressBar(0, MAXVALUE);
    private JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, MAXVALUE, 60);
    private Random rnd = new Random();

    public ProgressAsimpt() throws HeadlessException {
        setLayout(new GridLayout(2, 1));

        add(jProgressBar);
        jSlider.setValue(0);
        jSlider.setPaintTicks(true);
        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(5);
        jSlider.setBorder(new TitledBorder("Slide Me"));


        System.out.println(jProgressBar.getMaximum());
        add(jSlider);
        jSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = jSlider.getValue();
                if (value > 2) {
                    value += rnd.nextInt(10);
                }
                if (value > MAXVALUE) {
                    value = MAXVALUE;
                }
                value = (int) (MAXVALUE - MAXVALUE / Math.pow(1.05, value)) + 1;
//                System.out.println(jSlider.getValue() + ":" + value);
                if (value < 0) {
                    jProgressBar.setValue(0); // ProgressMonitor по JSlider}
                } else {
                    jProgressBar.setValue(value); // ProgressMonitor по JSlider}

                }
            }
        });
    }

    public static void check() {
        SwingConsole.run(new ProgressAsimpt(), 300, 200);
    }

}
