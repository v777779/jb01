package ch22.ex21.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SineWaveBean extends JFrame {

    private SineDrawBean sines = new SineDrawBean();
    private JSlider adjustCycles = new JSlider(1,30,5);

    public SineWaveBean() throws HeadlessException {
        add(sines);
        adjustCycles.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {                   // отрабатывает JSlider
                sines.setCycles(((JSlider)e.getSource()).getValue());
                System.out.println(((JSlider)e.getSource()).getValue());
            }
        });
        add(adjustCycles,BorderLayout.SOUTH);
    }

    public static void check() {
        SwingConsole.run(new SineWaveBean(),700 ,400 );
    }


}
