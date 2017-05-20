package ch22.ex19.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SimpleMenus extends JFrame {
    private JTextField textField = new JTextField(15);
    private ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuBar jMenuBar = getJMenuBar();
            textField.setText(((JMenuItem) e.getSource()).getText());
        }
    };

    private JMenu[] menus = {
            new JMenu("Winken"),
            new JMenu("Blinken"),
            new JMenu("Nod")
    };
    private JMenuItem[] items = {
            new JMenuItem("Fee"), new JMenuItem("Fi"), new JMenuItem("Fo"),
            new JMenuItem("Zip"), new JMenuItem("Zap"), new JMenuItem("Zot"),
            new JMenuItem("Olly"), new JMenuItem("Oxen"), new JMenuItem("Free")
    };

    public SimpleMenus() {

        for (int i = 0; i < items.length; i++) {
            items[i].addActionListener(al);
            menus[i % 3].add(items[i]); // раскидать по трем меню
        }
        JMenuBar jMenuBar = new JMenuBar();
        for (JMenu menu : menus) {
            jMenuBar.add(menu);  // меню в менюбар
        }
        setJMenuBar(jMenuBar); // задать активный
        setLayout(new FlowLayout());
        add(textField);
    }


    public static void check() {
        SwingConsole.run(new SimpleMenus(), 200, 150);
    }

}
