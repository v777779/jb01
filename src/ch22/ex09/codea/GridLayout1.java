package ch22.ex09.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class GridLayout1 extends JFrame {
    public GridLayout1() {
        setLayout(new GridLayout(7,3));
        for (int i = 0; i < 20; i++) {
            add(new JButton("Button " + i));
        }
    }

    public static void check() {
        SwingConsole.run(new GridLayout1(), 300, 300);
    }
}
