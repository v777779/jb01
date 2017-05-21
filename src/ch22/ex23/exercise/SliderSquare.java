package ch22.ex23.exercise;

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
public class SliderSquare extends JFrame {
    private JSlider jsSpeed = new JSlider(0, 100, 50);
    private JSlider jsSize = new JSlider(0, 100, 50);

    private Color color = new Color(255, 255, 255); // исходный цвет
    class CLSpeed implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            int value  = jsSpeed.getValue();
            repaint();
        }
    };
    class CLSize implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            int value  = jsSize.getValue();
            repaint();
        }
    };

    private JPanel jPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            jPanel.setBackground(color);
        }
    };

    public SliderSquare() throws HeadlessException {
        setLayout(new FlowLayout());
        jPanel.setBackground(color);
        jPanel.setPreferredSize(new Dimension(600, 250));
        jsSpeed.setPreferredSize(new Dimension(550, 20));
        jsSize.setPreferredSize(new Dimension(550, 20));
        jsSpeed.addChangeListener(new CLSpeed());
        jsSize.addChangeListener(new CLSize());

        add(new JLabel("Color JPanel with Sliders"));
        add(jPanel);
//        add(jsSpeed);
        JPanel jpRed = new JPanel();
        jpRed.add(new JLabel("Red  :"));
        jpRed.add(jsSpeed);
        add(jpRed);

//        add(jsSize);
        JPanel jpGreen = new JPanel();
        jpGreen.add(new JLabel("Green:"));
        jpGreen.add(jsSize);
        add(jpGreen);
    }

    public static void check() {
        SwingConsole.run(new SliderSquare(), 700, 450);
    }


}
