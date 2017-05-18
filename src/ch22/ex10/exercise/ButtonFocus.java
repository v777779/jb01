package ch22.ex10.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ButtonFocus extends JFrame {
    JButton button = new JButton("Click and Type");
    JTextField textField = new JTextField();
    JLabel label = new JLabel("<Please click on button and type the text>", JLabel.LEFT);
    JLabel label2 = new JLabel("Input text(click on button to erase):", JLabel.LEFT);



    class BMListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            textField.setText("");
        }

    }

    class BKListener extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            textField.setText(textField.getText()+e.getKeyChar());
        }
    }

    public ButtonFocus() {
        setLayout(new GridLayout(5, 1)); // целая туча событий

        button.addMouseListener(new BMListener()); // FocusListener
        button.addKeyListener(new BKListener());
        button.setBackground(Color.CYAN);
        textField.setEditable(true);
        add(label);
        add(button);
        add(label2);
        add(textField);
    }

    public static void check() {
        SwingConsole.run(new ButtonFocus(), 400, 200); // размещение по сетке
    }
}

