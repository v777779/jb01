package ch22.ex36.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 26-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JFrameGUI extends JFrame{              // добавлено вручную  extends JFrame
    private JPanel jPanel4;
    private JButton button1;

    public JFrameGUI() throws HeadlessException {   // добавлено вручную конструктор
        add(jPanel4);
    }

    public static void check() {  // добавлено вручную вызов JFrame
        SwingConsole.run(new JFrameGUI(), 500, 400);
    }

}
