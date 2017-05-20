package ch22.ex19.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MenusRadio extends JFrame {
    private String[] flavors = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    private JTextField textField = new JTextField("No flavor", 30);
    //JMenuBar1
    private JMenuBar jMenuBar1 = new JMenuBar();
    private JMenu jMenuF = new JMenu("File");
    private JMenu jMenuM = new JMenu("Flafors");
    private JMenu jMenuS = new JMenu("Safety");
    private JRadioButtonMenuItem[] safety = {
            new JRadioButtonMenuItem("Guard"),
            new JRadioButtonMenuItem("Hide")
    };


    private JMenuItem[] itemFiles = {new JMenuItem("Open")};
    //JMenuBar2
    private JMenuBar jMenuBar2 = new JMenuBar();
    private JMenu jMenuFoo = new JMenu("FooBar");
    private JMenuItem[] other = {
            new JMenuItem("Foo", KeyEvent.VK_F),
            new JMenuItem("Bar", KeyEvent.VK_A),
            new JMenuItem("Baz"),
    };

    private JButton button = new JButton("Swap Menus");


    class BL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuBar jMenuBar = getJMenuBar();
            setJMenuBar(jMenuBar == jMenuBar1 ? jMenuBar2 : jMenuBar1);
            validate();
        }
    }

    class ML implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem target = (JMenuItem) e.getSource();
            String actionCommand = target.getActionCommand();
            if (actionCommand.equals("Open")) {
                String s = textField.getText();
                boolean chosen = false;
                for (String flavor : flavors) {
                    if (s.equals(flavor)) {
                        chosen = true;
                    }
                }
                if (!chosen) {
                    textField.setText("Choose a flavor first!");
                } else {
                    textField.setText("Opening " + s + ". Mmm, mm!");
                }
            }
        }
    }

    class FL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem target = (JMenuItem) e.getSource();
            textField.setText(target.getText());
        }
    }

    class FooL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Foo selected");
        }
    }

    class BarL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Bar selected");
        }
    }

    class BazL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText("Baz selected");
        }
    }

    class CMIL implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            JRadioButtonMenuItem target = (JRadioButtonMenuItem) e.getSource();
            String actionCommand = target.getActionCommand();
            if (actionCommand.equals("Guard")) {
                textField.setText("Guard the Ice Cream! " +
                        "Guarding is " + target.isSelected());// setState() может менять
            } else if (actionCommand.equals("Hide")) {
                textField.setText("Hide the Ice Cream! " +
                        "Hiding is " + target.isSelected());
            }
        }
    }


    public MenusRadio() {
        ML ml = new ML();
        CMIL cmil = new CMIL();
        safety[0].setActionCommand("Guard");
        safety[0].setMnemonic(KeyEvent.VK_G);
        safety[0].setAccelerator(KeyStroke.getKeyStroke('J'));
        safety[0].addItemListener(cmil);
        safety[1].setActionCommand("Hide");
        safety[1].setAccelerator(KeyStroke.getKeyStroke('X'));
        safety[1].setMnemonic(KeyEvent.VK_H);
        safety[1].addItemListener(cmil);


        other[0].addActionListener(new FooL());
        other[1].addActionListener(new BarL());
        other[1].setAccelerator(KeyStroke.getKeyStroke('L'));
        other[2].addActionListener(new BazL());
        FL fl = new FL();
        int n = 0;
// JMenu
        for (String flavor : flavors) {
            JMenuItem mItem = new JMenuItem(flavor);
            mItem.addActionListener(fl);
            jMenuM.add(mItem);
            if ((n++ + 1) % 3 == 0) {
                jMenuM.addSeparator();
            }
        }
//JCheckBox
        for (JRadioButtonMenuItem itemSafety : safety) {
            jMenuS.add(itemSafety);
        }
//JMenuS
        jMenuS.setMnemonic(KeyEvent.VK_A);
//JMenuF
        jMenuF.add(jMenuS);
        jMenuF.setMnemonic(KeyEvent.VK_F);
        for (int i = 0; i < itemFiles.length; i++) {
            itemFiles[i].addActionListener(ml);
            jMenuF.add(itemFiles[i]); // добавить пункт меню.
        }
//JMenuBar1
        jMenuBar1.add(jMenuF);
        jMenuBar1.add(jMenuM);
        setJMenuBar(jMenuBar1);
//textField
        textField.setEditable(false);
        add(textField, BorderLayout.CENTER);
        button.addActionListener(new BL());
        button.setMnemonic(KeyEvent.VK_S);
        add(button, BorderLayout.NORTH);
//JMenuFoo
        for (JMenuItem itemFBar : other) {
            jMenuFoo.add(itemFBar);
        }
        jMenuFoo.setMnemonic(KeyEvent.VK_B);
//JMenuBar2
        jMenuBar2.add(jMenuFoo);
    }


    public static void check() {
        SwingConsole.run(new MenusRadio(), 300, 200);
    }

}
