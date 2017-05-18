package ch22.ex15.exercise;

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
public class Button4 extends JFrame {
    private JButton b1 = new JButton("Button1");
    private JButton b2 = new JButton("Button2");
    private JButton b3 = new JButton("Button3");
    private JCheckBox cb1 = new JCheckBox("CheckBox");

    private JTextField textField = new JTextField(10); // длина текста

    class ButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText(); // получить текст кнопки
            textField.setText(name); // по нажатию кнопки вписать ее текст в поле
        }
    }
    class ButtonListener2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = ((JButton) e.getSource()).getText()+": special"; // получить текст кнопки
            textField.setText(name); // по нажатию кнопки вписать ее текст в поле
        }
    }

    class CheckBoxListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Checkbox cb = (Checkbox)e.getSource();
            String name = cb.getName()+": "+(cb.getState()?"On":"Off"); // получить текст кнопки
            textField.setText(name); // по нажатию кнопки вписать ее текст в поле
        }
    }

    private ButtonListener bListener = new ButtonListener(); // один перехватчик
    private ButtonListener2 bListener2 = new ButtonListener2(); // один перехватчик
    private CheckBoxListener cbListener = new CheckBoxListener();

    public Button4() {
        class ButtonListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = ((JButton) e.getSource()).getText(); // получить текст кнопки
                textField.setText(name); // по нажатию кнопки вписать ее текст в поле
            }
        }

        b1.addActionListener(new ButtonListener());
        b2.addActionListener(new ButtonListener());
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = ((JButton) e.getSource()).getText()+": special"; // получить текст кнопки
                textField.setText(name); // по нажатию кнопки вписать ее текст в поле
            }
        });
        cb1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JCheckBox cb = (JCheckBox)e.getSource();
                String name = cb.getText()+": "+(cb.isSelected()?"On":"Off"); // получить текст кнопки
                textField.setText(name); // по нажатию кнопки вписать ее текст в поле
            }
        });
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(b3);
        add(cb1);
        add(textField);
    }

    public static void check() {
        SwingConsole.run(new Button4(),400,150);
    }
}
