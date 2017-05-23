package ch22.ex30.codea;

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
public class HTMLButton extends JFrame {
    private JButton jButton = new JButton("<html><b><font size = +2" +
            "<center>Hello!<br><i>Press me now!"
    );

    public HTMLButton() throws HeadlessException {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add(new JLabel("<html><i><font size = +4>WORLD!"));
                validate(); // перерисовать
            }
        });
        setLayout(new FlowLayout());
        add(jButton);
    }

    public static void check() {
        SwingConsole.run(new HTMLButton(), 200, 500);
    }

}
