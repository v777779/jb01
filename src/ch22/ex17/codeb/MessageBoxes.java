package ch22.ex17.codeb;

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
public class MessageBoxes extends JFrame {
    private JButton[] buttons = {
            new JButton("Alert"), new JButton("Yes/No"),
            new JButton("Color"), new JButton("Input"),
            new JButton("3 Vals")
    };
    private JTextField textField = new JTextField(15);
    private ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String id = ((JButton) e.getSource()).getText();

            if (id.equals("Alert")) {
                JOptionPane.showMessageDialog(null,
                        "There's a bug on you!", "Hey!",
                        JOptionPane.ERROR_MESSAGE);
            } else if (id.equals("Yes/No")) {
                JOptionPane.showConfirmDialog(null,
                        "Yes or No", "choose yes",
                        JOptionPane.YES_NO_OPTION);
            } else if (id.equals("Color")) {
                Object[] options = {"Red", "Green"};
                int sel = JOptionPane.showOptionDialog(null,
                        "Choose a Color!", "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
                if (sel != JOptionPane.CLOSED_OPTION) { // если был сделан выбор
                    textField.setText("Color selected:" + options[sel]);
                }
            } else if (id.equals("Input")) {
                String val = JOptionPane.showInputDialog("How many lists do you see?");
                textField.setText(val);
            } else if (id.equals("3 Vals")) {
                Object[] selections = {"First", "Second","Third"};
                Object val = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE,
                        null, selections, selections[0]);
                if (val != null) { // если был сделан выбор
                    textField.setText(val.toString());
                }
            }
        }
    };

    public MessageBoxes() {
        setLayout(new FlowLayout());
        for (int i = 0; i < buttons.length; i++) {
            buttons[i].addActionListener(actionListener); // на каждую кнопку тот же ActionListener
            add(buttons[i]);
        }
        add(textField);
    }

    public static void check() {
        SwingConsole.run(new MessageBoxes(),200 ,200 );
    }

}
