package ch22.ex11.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ButtonColor extends JFrame {

    private class MyButtonColor extends JButton {
        private Color[] colors = new Color[]{
                Color.ORANGE, Color.PINK, Color.WHITE,
                Color.CYAN, Color.MAGENTA, Color.YELLOW,
                Color.BLACK, Color.PINK, Color.RED,
                Color.ORANGE, Color.BLUE, Color.DARK_GRAY,
                Color.GRAY, Color.GREEN, Color.LIGHT_GRAY
        };

        private Random rnd = new Random();


        class BMListener extends MouseAdapter {
            @Override
            public void mouseClicked(MouseEvent e) {
                Color color = colors[rnd.nextInt(colors.length)];
                setBackground(color);
            }
        }

        private Color getColor() {
            return colors[rnd.nextInt(colors.length)];
        }


        public MyButtonColor(String name) {
            super(name);
            setBackground(getColor());  // случайный цвет
            addMouseListener(new BMListener());
        }
    }

    private JLabel jLabel = new JLabel("< Colored buttons array > ");
//    private JLabel jLabel2 = new JLabel("<> ",JLabel.CENTER);
//    MyButtonColor button = new MyButtonColor("Click to change color");

    public ButtonColor() {
        setLayout(new GridLayout(10,3));
        add(new JLabel("<> ",JLabel.LEFT));
        add(jLabel);
        add(new JLabel("<> ",JLabel.RIGHT));

        for (int i = 0; i < 18; i++) {
            add(new MyButtonColor("Press to Color"));
        }
    }

    public static void check() {
        SwingConsole.run(new ButtonColor(),400,300);
    }

}
