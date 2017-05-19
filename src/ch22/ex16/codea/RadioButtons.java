package ch22.ex16.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class RadioButtons extends JFrame{
    private JTextField textField = new JTextField(15);
    private ButtonGroup buttonGroup = new ButtonGroup();
    private JRadioButton rb1 = new JRadioButton("one",false);
    private JRadioButton rb2 = new JRadioButton("two",false);
    private JRadioButton rb3 = new JRadioButton("three",false);

    private ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Radio button "+((JRadioButton)e.getSource()).getText());
        }
    };

    public RadioButtons() throws HeadlessException {
        rb1.addActionListener(al);
        rb2.addActionListener(al);
        rb3.addActionListener(al);
        buttonGroup.add(rb1);  // группа только для логики работы
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
        setLayout(new FlowLayout());
        add(textField);
        add(rb1);
        add(rb2);
        add(rb3);
    }

    public static void check() {
        SwingConsole.run(new RadioButtons(),200,125);
    }

}
