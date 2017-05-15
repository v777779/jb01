package ch22.ex05.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Button2 extends JFrame {
    private JButton b1 = new JButton("Button1");
    private JButton b2 = new JButton("Button2");
    private JTextField textField = new JTextField(10); // длина текста

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText(); // получить текст кнопки
            textField.setText(name); // по нажатию кнопки вписать ее текст в поле
        }
    }

    private ButtonListener bListener = new ButtonListener(); // один перехватчик

    public Button2() {
        b1.addActionListener(bListener); // перехватчик событий один и тот же
        b2.addActionListener(bListener);
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(textField);
    }

    public static void check() {
        SwingConsole.run(new Button2(),200,150);
    }
}
