package ch22.ex14.exercise;

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
public class TextAreas extends JFrame {
    private JButton b = new JButton("Add Text");
    private JTextArea tp = new JTextArea();
    private static IGenerator sg = new GenRnd.GenStr(7);

    public TextAreas()  {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 10; i++) {
                    tp.setText(tp.getText()+sg.next()+"\n"); // добавлять по нажатию по 70 символов
                }
            }
        });

        add(new JScrollPane(tp));  // теперь добавляем TextArea
        add(BorderLayout.SOUTH, b); // кнопку вниз окна
    }

    public static void check() {
        SwingConsole.run(new TextAreas(),475,425);
    }

}
