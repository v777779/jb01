package ch22.ex15.codea;

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
public class CheckBoxes extends JFrame {
    private JTextArea textArea = new JTextArea(6, 15);
    private JCheckBox cb1 = new JCheckBox("Check Box 1");
    private JCheckBox cb2 = new JCheckBox("Check Box 2");
    private JCheckBox cb3 = new JCheckBox("Check Box 3");

    public CheckBoxes() {
        cb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trace("1", cb1);
            }
        });

        cb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trace("2", cb2);
            }
        });
        cb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trace("3", cb3);
            }
        });
        setLayout(new FlowLayout());
        add(new JScrollPane(textArea));
        add(cb1);
        add(cb2);
        add(cb3);
    }

    public void trace(String b, JCheckBox cb) {
        if (cb.isSelected()) {
            textArea.append("Box " + b + " Set\n");
        } else {
            textArea.append("Box " + b + " Cleared\n");
        }
    }

    public static void check() {
        SwingConsole.run(new CheckBoxes(), 200, 300);
    }
}
