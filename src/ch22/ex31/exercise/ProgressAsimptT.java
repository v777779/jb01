package ch22.ex31.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ProgressAsimptT extends JFrame {
    private final int MAXVALUE = 100;
    private JProgressBar jProgressBar = new JProgressBar(0, MAXVALUE);
    private JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, MAXVALUE, 60);
    JLabel jLabel = new JLabel("Timer started", SwingConstants.CENTER);

    private Random rnd = new Random();
    Timer timer = new Timer(50, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            jSlider.setValue(jSlider.getValue() + 1);
            if (jSlider.getValue() == jSlider.getMaximum()) {
                timer.stop();
                jLabel.setText("Timer stopped");
            }
        }
    });

    public ProgressAsimptT() throws HeadlessException {
        setLayout(new GridLayout(3, 1));
        jSlider.setValue(0);
        jSlider.setPaintTicks(true);
        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(5);
        jSlider.setBorder(new TitledBorder("Slide Me"));
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
                if (value < 0) {
                    jProgressBar.setValue(0); // ProgressMonitor по JSlider}
                } else {
                    jProgressBar.setValue(value); // ProgressMonitor по JSlider}

                }
            }
        });

        add(jLabel);
        add(jProgressBar);
        add(jSlider);
        timer.start();
    }

    public static void check() {
        SwingConsole.run(new ProgressAsimptT(), 300, 200);
    }

}
