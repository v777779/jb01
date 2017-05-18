package ch22.ex13.codec;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Faces extends JFrame {
    private static Icon[] faces;
    private JButton jb = new JButton("Disable");
    private JButton jb2 = new JButton("Disable");
    private boolean mad = false;

    public Faces() {
//            URL loc = getClass().getProtectionDomain().getCodeSource().getLocation();
//            URL imageURL = new URL(loc+"/"+"images/Face0.gif");
//            URL loc = getClass().getResource("images/Face20.gif");

        faces = new ImageIcon[]{
                new ImageIcon(getClass().getResource("images/Face0.gif")),
                new ImageIcon(getClass().getResource("images/Face1.gif")),
                new ImageIcon(getClass().getResource("images/Face2.gif")),
                new ImageIcon(getClass().getResource("images/Face3.gif")),
                new ImageIcon(getClass().getResource("images/Face4.gif")),
        };
        jb = new JButton("JButton", faces[3]);

//layout
        setLayout(new FlowLayout());
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mad) {
                    jb.setIcon(faces[3]);
                    mad = false;
                } else {
                    jb.setIcon(faces[0]);
                    mad = true;
                }
                jb.setVerticalAlignment(JButton.TOP);
                jb.setHorizontalAlignment(JButton.LEFT);
            }
        });
        jb.setRolloverEnabled(true);  // Rollover Support поддержка <Over>
        jb.setRolloverIcon(faces[1]); // rollover icons при наезде мыши <Over>
        jb.setPressedIcon(faces[2]);  // при нажатии
        jb.setDisabledIcon(faces[4]); // при запрете
        jb.setToolTipText("Yow!");    //  toolTipText Текст после 3х секунд на иконке
        add(jb);

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (jb.isEnabled()) {
                    jb.setEnabled(false);
                    jb2.setText("Enable");  // походу одна кнопка контролирует другую
                } else {
                    jb.setEnabled(true);
                    jb2.setText("Disable");  // походу одна кнопка контролирует другую
                }

            }
        });
        add(jb2);
    }

    public static void check() {
        SwingConsole.run(new Faces(), 250, 125); // FlowLayout()
    }
}
