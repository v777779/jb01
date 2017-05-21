package ch22.ex21.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Popup extends JFrame {
    private JPopupMenu jPopupMenu = new JPopupMenu();
    private JTextField textField = new JTextField(10);

    class PopupListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            maybeShowPopup(e);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            maybeShowPopup(e);
        }
    }

    public Popup() {
        setLayout(new FlowLayout());
        add(textField);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(((JMenuItem) e.getSource()).getText());
            }
        };

        JMenuItem jMenuItem = new JMenuItem("Hinter");
        jMenuItem.addActionListener(al);
        jMenuItem = new JMenuItem("Yon");
        jMenuItem.addActionListener(al);
        jMenuItem = new JMenuItem("Afar");
        jMenuItem.addActionListener(al);
        jMenuItem = new JMenuItem("Stay here");
        jMenuItem.addActionListener(al);
        PopupListener pl = new PopupListener();
        this.addMouseListener(pl);  // к JFrame
        textField.addMouseListener(pl);
    }

    private void maybeShowPopup(MouseEvent e) {
        if (e.isPopupTrigger()) {
            jPopupMenu.show(e.getComponent(),e.getX(),e.getY());
        }
    }

    public static void check() {
        SwingConsole.run(new Popup(),300 ,200 );
    }

}
