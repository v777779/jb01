package ch22.ex21.codeb;

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
public class SineWave extends JFrame {

    private SineDraw sines = new SineDraw();
    private JSlider adjustCycles = new JSlider(1,30,5);

    public SineWave() throws HeadlessException {
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
        SwingConsole.run(new SineWave(),700 ,400 );
    }


}
