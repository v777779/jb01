package ch22.ex16.codeb;

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
public class ComboBoxes extends JFrame {
    private String[] description = {
            "Ebullient", "Obtuse", "Recalcitrant", "Brilliant",
            "Somnescent", "Timorous", "Florid", "Putrescent"
    };
    private JTextField textField = new JTextField(15);
    private JComboBox comboBox = new JComboBox();
    private JButton button = new JButton("Add items");
    private int count = 0;

    public ComboBoxes() {
        for (int i = 0; i < 4; i++) {
            comboBox.addItem(description[count++]);
        }
        textField.setEditable(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < description.length) {
                    comboBox.addItem(description[count++]);
                }
            }
        });

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("index: " + comboBox.getSelectedItem() + " " +
                        ((JComboBox) e.getSource()).getSelectedItem());
            }
        });
        setLayout(new FlowLayout());
        add(textField);
        add(comboBox);
        add(button);
    }

    public static void check() {
        SwingConsole.run(new ComboBoxes(), 200, 175);
    }
}
