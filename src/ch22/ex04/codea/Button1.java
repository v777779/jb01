package ch22.ex04.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Button1 extends JFrame {
    private JButton b1 = new JButton("Button1");
    private JButton b2 = new JButton("Button2");

    public Button1() {
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
    }

    public static void check() {
        SwingConsole.run(new Button1(),200,100); // запуск окна
    }
}
