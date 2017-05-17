package ch22.ex09.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class FlowLayout1 extends JFrame {
    public FlowLayout1() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 4; i++) {
            add(new JButton("Button " + i));

        }
    }

    public static void check() {
        SwingConsole.run(new FlowLayout1(), 300, 300);
    }
}
