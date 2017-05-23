package ch22.ex29.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JColorChooserTest extends JFrame {
    private JTextField jtOpen = new JTextField();
    private JTextField jtSave = new JTextField();
    private JButton jbOpen = new JButton("Open");
    private JButton jbSave = new JButton("Save");

    class OpenL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JColorChooser jColorChooser = new JColorChooser();
            Color rColor = jColorChooser.showDialog(JColorChooserTest.this,
                    "Color Chooser Dialog",  Color.BLUE);

            if (rColor != null) {
                jtOpen.setText(rColor.toString());
            }else {
                jtOpen.setText("You pressed cancel");
                jtSave.setText("");
            }
        }
    }

    class SaveL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JColorChooser jColorChooser = new JColorChooser();
            Color rColor = jColorChooser.showDialog(JColorChooserTest.this,
                    "Color Chooser Dialog",  Color.BLUE);

            if (rColor != null) {
                jtSave.setText(rColor.toString());
            }else {
                jtOpen.setText("You  pressed cancel");
                jtSave.setText("");
            }

        }
    }

    public JColorChooserTest() throws HeadlessException {
        JPanel jPanel = new JPanel();
        jbOpen.addActionListener(new OpenL());
        jPanel.add(jbOpen);
        jbSave.addActionListener(new SaveL());
        jPanel.add(jbSave);
        add(jPanel, BorderLayout.SOUTH);
        jtOpen.setEditable(false);
        jtSave.setEditable(false);
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 1));
        jPanel.add(jtOpen);
        jPanel.add(jtSave);
        add(jPanel, BorderLayout.NORTH);


    }

    public static void check() {
        SwingConsole.run(new JColorChooserTest(), 250, 150);
    }

}
