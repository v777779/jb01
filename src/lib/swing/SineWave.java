package lib.swing;

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
    private static final int MAXOFFSET = 200;

    private SineDraw sines = new SineDraw();
    private JSlider adjustCycles = new JSlider(1,30,5);
    private JSlider adjustOffset = new JSlider(1,200,1);

    public SineWave() throws HeadlessException {
        add(sines);
        adjustCycles.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sines.setCycles(((JSlider)e.getSource()).getValue());
                System.out.println(((JSlider)e.getSource()).getValue());
            }
        });
        adjustOffset.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                sines.setOffset(((JSlider)e.getSource()).getValue());
                System.out.println(((JSlider)e.getSource()).getValue());
            }
        });
        JPanel jp = new JPanel();
        jp.add(adjustCycles,BorderLayout.NORTH);
        jp.add(adjustOffset,BorderLayout.SOUTH);
        add(jp,BorderLayout.SOUTH);
//        add(adjustCycles,BorderLayout.SOUTH);
//        add(adjustOffset,BorderLayout.NORTH);
    }

    public static void check() {
        SwingConsole.run(new SineWave(),700 ,400 );
    }


}
