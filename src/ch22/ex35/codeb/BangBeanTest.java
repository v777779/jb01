package ch22.ex35.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TooManyListenersException;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BangBeanTest extends JFrame {
    private JTextField jTextField = new JTextField(20);

    class BBL implements ActionListener {
        private int count = 0;

        @Override
        public void actionPerformed(ActionEvent e) {
            jTextField.setText("BangBean action " + count++);
        }
    }

    public BangBeanTest() throws HeadlessException {
        BangBean bangBean = new BangBean();
        try {
            bangBean.addActionListener(new BBL());
        } catch (TooManyListenersException e) {
            jTextField.setText("Too many Listeners");
        }

        add(bangBean); // добавить в центр BorderLayout
        add(jTextField,BorderLayout.SOUTH); // текстовое поле внизу окна
    }

    public static void check() {
        SwingConsole.run(new BangBeanTest(), 400, 500);
    }

}
