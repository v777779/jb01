package ch22.ex23.exercise.vertical;

import lib.swing.SwingConsole;

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
public class SliderSquare extends JFrame {
    private JSlider jsSpeed = new JSlider(1, 100, 50);
    private JSlider jsSize = new JSlider(1, 100, 50);
    private JTextField jtSpeed = new JTextField("50%", 5);
    private JTextField jtSize = new JTextField("50%", 5);

    private double angle;
    private int delay = 200;            // 200ms min
    private double scaleSize = 0.5;     // 50%
    private int scaleSpeed = 50;     // 50%

    public void changeAngle() {
        angle += Math.PI * 10 / 180; // p rad = 30
        repaint();
    }

    private Timer timer = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            changeAngle();
            delay =101-scaleSpeed;
            timer.setDelay(delay);
            timer.start(); // на начальную задержку,  timer.start на текущую
        }
    });

    class CLSpeed implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            scaleSpeed = jsSpeed.getValue();
            jtSpeed.setText(String.format("%2d%%",scaleSpeed));

        }
    }

    class CLSize implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            scaleSize = ((double)jsSize.getValue()/jsSize.getMaximum());
            jtSize.setText(String.format("%2d%%",(int)(scaleSize*100)));
        }
    }

    private JPanel jPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Graphics2D g2d = (Graphics2D) g; // скопировать объект g
            int size = (int) (scaleSize * (getWidth() > getHeight() ? getHeight() : getWidth()));

            Rectangle rect = new Rectangle(getWidth() / 2 - size / 2, getHeight() / 2 - size / 2, size, size);
            g2d.rotate(angle, getWidth() / 2, getHeight() / 2);
            g2d.draw(rect); //

        }
    };


    public SliderSquare() throws HeadlessException {
//        setLayout(new FlowLayout());

        jPanel.setPreferredSize(new Dimension(600, 400));

        jsSpeed.setPreferredSize(new Dimension(20, 400));
        jsSpeed.addChangeListener(new CLSpeed());
        jsSpeed.setOrientation(SwingConstants.VERTICAL);

        jtSpeed.setHorizontalAlignment(SwingConstants.CENTER);
        jtSpeed.setEditable(false);

        jsSize.setPreferredSize(new Dimension(20, 400));
        jsSize.addChangeListener(new CLSize());
        jsSize.setOrientation(SwingConstants.VERTICAL);


        jtSize.setHorizontalAlignment(SwingConstants.CENTER);
        jtSize.setEditable(false);


        JLabel jLabel = new JLabel("Color JPanel with Sliders");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(jLabel,BorderLayout.NORTH);
        add(jPanel);
//        add(jsSpeed);
        JPanel jpRed = new JPanel();
        jpRed.add(new JLabel("Red  :"));
        jpRed.add(jsSpeed);
        jpRed.add(jtSpeed);
        add(jpRed,BorderLayout.EAST);

//        add(jsSize);
        JPanel jpGreen = new JPanel();
        jpGreen.add(new JLabel("Green:"));
        jpGreen.add(jsSize);
        jpGreen.add(jtSize);
        add(jpGreen,BorderLayout.WEST);
        delay =(int)((double)2000*(1-scaleSpeed));
        timer.start();
    }


    public static void check() {
        SwingConsole.run(new SliderSquare(), 700, 450);
    }

    public static void main(String[] args) {
        check();
    }

}
