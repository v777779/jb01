package ch22.ex31.exercise.office;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ProgressOffice extends JFrame {
    JProgressBar jProgressBar = new JProgressBar(0, 100);
    JLabel jLabel = new JLabel("Making progress now!");
    Timer timer = new Timer(50, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (jProgressBar.getValue() == jProgressBar.getMaximum()) {
                timer.stop();
                jLabel.setText("Progress finished");
            }

            double percent = (double)jProgressBar.getValue()/jProgressBar.getMaximum();
            timer.setDelay((int)(timer.getDelay()*(1+percent*0.07))); // задержка растет
            jProgressBar.setValue(jProgressBar.getValue()+1);
            if (percent > 0.9) {
                if (Math.random() < 0.25) {
                    jProgressBar.setValue(jProgressBar.getValue()-10);  // отбросить если есть возможность
                }
            }
        }
    });

    public ProgressOffice() throws HeadlessException {
        setLayout(new FlowLayout());
        add(jProgressBar);
        add(jLabel);
        jProgressBar.setValue((int)(jProgressBar.getMaximum()*0.25)); // начать с 25%
        timer.start();
    }

    public static void check() {
        SwingConsole.run(new ProgressOffice(), 300, 200);
    }

}
