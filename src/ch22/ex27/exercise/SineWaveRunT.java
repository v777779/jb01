package ch22.ex27.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SineWaveRunT extends JFrame {
    private static final int MAXOFFSET = 200;

    private SineDrawRunT sines = new SineDrawRunT();
    private JSlider jsCycles = new JSlider(1, 30, 10);
    private JSlider jsOffset = new JSlider(1, MAXOFFSET, 50);
    private int delay = 50;  // 1 сек
    private JTextField jtCycles = new JTextField("", 5);
    private JTextField jtOffset = new JTextField("", 5);

    private Timer timer = new Timer("T1", true); // это daemon

    TimerTask timerTask = new TimerTask() {
        @Override
        public void run() {
            sines.setOffset(); // постоянная составляющая
         }
    };


    public SineWaveRunT() throws HeadlessException {
        jsCycles.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = ((JSlider) e.getSource()).getValue();
                jtCycles.setText(String.format("%2d", value));
                sines.setCycles(value);
                sines.setCycles();
             }
        });
        jsOffset.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = ((JSlider) e.getSource()).getValue();
                jtOffset.setText(String.format("%2d", value));
                sines.setOffset(value);     // задать новое значение
                sines.setOffset();          // нарисовать
            }
        });
        jtCycles.setText(String.format("%2d", jsCycles.getValue()));
        jtCycles.setEditable(false);
        jtOffset.setText(String.format("%2d", jsOffset.getValue()));
        jtOffset.setEditable(false);

        sines.setCycles(jsCycles.getValue()); // задать начальное значение
        sines.setOffset(jsOffset.getValue()); // задать начальное значение
        sines.setCycles();
        add(sines);

        JPanel jp = new JPanel(new FlowLayout());
        jp.add(jsCycles);
        jp.add(jtCycles);
        jp.add(jsOffset);
        jp.add(jtOffset);
        add(jp, BorderLayout.SOUTH);
        timer.scheduleAtFixedRate(timerTask,0,delay);

    }

    public static void check() {
        SwingConsole.run(new SineWaveRunT(), 700, 400);
    }


}
