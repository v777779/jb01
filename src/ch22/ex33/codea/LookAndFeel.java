package ch22.ex33.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LookAndFeel extends JFrame {
    private String[] choices = "Eeny Meeny Minnie Mickey Мое Larry Curly".split(" ");
    private Component[] samples = {
            new JButton("JButton"),
            new JTextField("JTextField"),
            new JLabel("JLabel"),
            new JCheckBox("JCheckBox"),
            new JRadioButton("JRadioButton"),
            new JComboBox(choices),
            new JList(choices)
    };

    public LookAndFeel() throws HeadlessException {
        super("Look And Feel");
        setLayout(new FlowLayout());
        for (Component component : samples) {
            add(component);
        }
    }

    private static void usageError() {
        System.out.println("Usage: LookAndFeel [cross|system|motiff]");
        //System.exit(1);
    }

    public static void check(String[] args) {
        Random rnd = new Random();
        if (args.length == 0) {
            usageError();
            args = new String[]{"cross"};
//            args = new String [] {"system"};
//            args = new String [] {"motif"};
        }
        if (args[0].equals("cross")) {
            try {
                UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (args[0].equals("system")) {
            try {

                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (args[0].equals("motif")) {
            try {

                UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            usageError();
        }
        SwingConsole.run(new LookAndFeel(), 300, 300);

    }
}
