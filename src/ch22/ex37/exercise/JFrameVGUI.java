package ch22.ex37.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 26-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JFrameVGUI extends JFrame {
    private JButton button1;
    private JButton button2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private Valve valve;
    private JPanel jPanel;

    public JFrameVGUI() throws HeadlessException {
        add(jPanel);
    }

//    private void createUIComponents() {
//
//    }

    public static void check() {
        SwingConsole.run(new JFrameVGUI(), 600, 500);
    }

}
