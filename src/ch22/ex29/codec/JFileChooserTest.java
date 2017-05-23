package ch22.ex29.codec;

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
public class JFileChooserTest extends JFrame {
    private JTextField jtFileName = new JTextField();
    private JTextField jtDir = new JTextField();
    private JButton jbOpen = new JButton("Open");
    private JButton jbSave = new JButton("Save");

    class OpenL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            int rVal = jFileChooser.showOpenDialog(JFileChooserTest.this); // внешний класс  зачем ?
            if (rVal == JFileChooser.APPROVE_OPTION) {
                jtFileName.setText(jFileChooser.getSelectedFile().getName());
                jtDir.setText(jFileChooser.getCurrentDirectory().toString());
            }
            if (rVal == JFileChooser.CANCEL_OPTION) {
                jtFileName.setText("You pressed cancel");
                jtDir.setText("");
            }
        }
    }

    class SaveL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser jFileChooser = new JFileChooser();
            int rVal = jFileChooser.showOpenDialog(JFileChooserTest.this); // внешний класс  зачем ?
            if (rVal == JFileChooser.APPROVE_OPTION) {
                jtFileName.setText(jFileChooser.getSelectedFile().getName());
                jtDir.setText(jFileChooser.getCurrentDirectory().toString());
            }
            if (rVal == JFileChooser.CANCEL_OPTION) {
                jtFileName.setText("You pressed cancel");
                jtDir.setText("");
            }

        }
    }

    public JFileChooserTest() throws HeadlessException {
        JPanel jPanel = new JPanel();
        jbOpen.addActionListener(new OpenL());
        jPanel.add(jbOpen);
        jbSave.addActionListener(new SaveL());
        jPanel.add(jbSave);
        add(jPanel, BorderLayout.SOUTH);
        jtDir.setEditable(false);
        jtFileName.setEditable(false);
        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 1));
        jPanel.add(jtFileName);
        jPanel.add(jtDir);
        add(jPanel, BorderLayout.NORTH);


    }

    public static void check() {
        SwingConsole.run(new JFileChooserTest(), 250, 150);
    }

}
