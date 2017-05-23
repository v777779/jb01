package ch22.ex29.codea;

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
public class Dialogs extends JFrame{
    private JButton jButton = new JButton("Dialog Box");
    private MyDialog myDialog = new MyDialog(null); // null это parent JFrame

    public Dialogs() throws HeadlessException {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myDialog.setVisible(true); // открыть диалог
            }
        });
        add(jButton);
    }

    public static void check() {
        SwingConsole.run(new Dialogs(), 125, 75);
    }

}
