package ch22.ex10.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ButtonFocus extends JFrame {
    JButton button = new JButton("Click and Type");
    JTextField textField = new JTextField();
    JLabel label = new JLabel("<Please Click on Button and Type the Text>",JLabel.LEFT);
    JLabel label2 = new JLabel("Input text:",JLabel.LEFT);

    class BFListener implements FocusListener {

        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {

        }
    }



    public ButtonFocus() {
        button.addFocusListener(new BFListener()); // FocusListener
        setLayout(new FlowLayout()); // целая туча событий

        add(label);
        add(button);
        add(label2);
        add(textField);
    }

    public static void check() {
        SwingConsole.run(new ButtonFocus(),400,200); // размещение по сетке
    }
}

