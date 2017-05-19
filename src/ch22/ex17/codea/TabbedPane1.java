package ch22.ex17.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TabbedPane1 extends JFrame {
    private String[] flavors = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    private JTabbedPane tabbedPane = new JTabbedPane();
    private JTextField textField = new JTextField(20);

    public TabbedPane1() {
        int i = 0;
        for (String flavor : flavors) {
            tabbedPane.addTab(flavor, new JButton("Tabbed pane " + i++));
        }
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                textField.setText("Tab selected: "+tabbedPane.getSelectedIndex());
            }
        });
        add(BorderLayout.SOUTH,textField);
        add(tabbedPane);
    }

    public static void check() {
        SwingConsole.run(new TabbedPane1(), 400, 250);
    }
}
