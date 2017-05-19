package ch22.ex18.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MessageBoxes2 extends JFrame {
    private JButton[] buttons = {
            new JButton("Alert"), new JButton("Yes/No"),
            new JButton("Color"), new JButton("Input"),
            new JButton("3 Vals")
    };
    private JTextField textField = new JTextField(15);
    private ActionListener[] aListeners = new ActionListener[5];



    public MessageBoxes2() {
        aListeners[0] = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "There's a bug on you!", "Hey!",
                        JOptionPane.ERROR_MESSAGE);
            }
        };
        aListeners[1]   = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null,
                        "Yes or No", "choose yes",
                        JOptionPane.YES_NO_OPTION);
            }
        };
        aListeners[2] = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] options = {"Red", "Green"};
                int sel = JOptionPane.showOptionDialog(null,
                        "Choose a Color!", "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
                if (sel != JOptionPane.CLOSED_OPTION) { // если был сделан выбор
                    textField.setText("Color selected:" + options[sel]);
                }
            }
        };
        aListeners[3]  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String val = JOptionPane.showInputDialog("How many lists do you see?");
                textField.setText(val);
            }
        };
        aListeners[4]  = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object[] selections = {"First", "Second", "Third"};
                Object val = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE,
                        null, selections, selections[0]);
                if (val != null) { // если был сделан выбор
                    textField.setText(val.toString());
                }
            }
        };



        setLayout(new FlowLayout());
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(aListeners[i]); // на каждую кнопку тот же ActionListener
            add(buttons[i]);
        }
        add(textField);
    }

    public static void check() {
        SwingConsole.run(new MessageBoxes2(), 400, 200);
    }

}
