package ch22.ex29.codea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MyDialog extends JDialog {
    public MyDialog(Frame owner) {
        super(owner);
        setLayout(new FlowLayout());
        add(new JLabel("Here is my dialog"));
        JButton jBOK = new JButton("OK");
        jBOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // закрыть диалог
            }
        });
        add(jBOK);
        setSize(150,125); // размер диалога
    }
}
