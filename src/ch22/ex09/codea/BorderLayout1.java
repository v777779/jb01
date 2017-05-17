package ch22.ex09.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BorderLayout1 extends JFrame {
    public BorderLayout1() {
        add(BorderLayout.NORTH, new JButton("North"));
        add(BorderLayout.SOUTH, new JButton("South"));
        add(BorderLayout.EAST, new JButton("East"));
        add(BorderLayout.WEST, new JButton("West"));
        add(BorderLayout.CENTER, new JButton("Center"));

    }


    public static void check() {
        SwingConsole.run(new BorderLayout1(),300,250);
    }
}
