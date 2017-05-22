package ch22.ex26.exercise.sinewave;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SineWaveRun extends JPanel {
    private static final int MAXOFFSET = 200;

    private SineDrawRun sines = new SineDrawRun();
    private JSlider jsCycles = new JSlider(1, 30, 10);
    private JSlider jsOffset = new JSlider(1, MAXOFFSET, 50);
    private int delay = 50;  // 1 сек
    private JTextField jtCycles = new JTextField("", 5);
    private JTextField jtOffset = new JTextField("", 5);

    private Timer timer = new Timer(delay, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            sines.setOffset(); // постоянная составляющая
            timer.setDelay(delay);
            timer.start(); // на начальную задержку,  timer.start на текущую
        }
    });

    public SineWaveRun(int cycles, int offset) throws HeadlessException {
        initPanel(cycles, offset);
        timer.start();
    }

    public SineWaveRun() throws HeadlessException {
        initPanel(10, 50);  // по умолчанию
        timer.start();
    }

    private void initPanel(int cycles, int offset) {
        setLayout(new BorderLayout());
        jsCycles.setValue(cycles);
        jsCycles.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = ((JSlider) e.getSource()).getValue();
                jtCycles.setText(String.format("%2d", value));
                sines.setCycles(value);
                sines.setCycles();
            }
        });
        jsOffset.setValue(offset);
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
        timer.start();
    }

//    public static void check() {
//        SwingConsole.run(new SineWaveMul(1), 700, 400);
//    }


}
