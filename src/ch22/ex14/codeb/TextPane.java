package ch22.ex14.codeb;

import lib.generate.GenRnd;
import lib.swing.SwingConsole;
import lib.utils.IGenerator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TextPane extends JFrame {
    private JButton b = new JButton("Add Text");
    private JTextPane tp = new JTextPane();
    private static IGenerator sg = new GenRnd.GenStr(7);

    public TextPane()  {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 10; i++) {
                    tp.setText(tp.getText()+sg.next()+"\n"); // добавлять по нажатию по 70 символов
                }
            }
        });

        add(new JScrollPane(tp));
        add(BorderLayout.SOUTH, b); // кнопку вниз окна
    }

    public static void check() {
        SwingConsole.run(new TextPane(),475,425);
    }

}
