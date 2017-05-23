package ch22.ex30.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HTMLComponents extends JFrame {
    String s = "<html><b><font size = +2<center>Hello!<br><i>Press me now!";
    private JButton jButton = new JButton("<html><center><i>JButton!");
    private JButton jButton2 = new JButton("<html><b><center>Hello2!");
    private JMenu[] jMenus = new JMenu[5];
    private JTabbedPane jTabbedPane = new JTabbedPane(JTabbedPane.TOP);
    private JToolTip jToolTipC = new JToolTip();
    private JRadioButton[] jRadioButtons = new JRadioButton[5];
    private JCheckBox[] jCheckBoxes = new JCheckBox[5];

    private JButton jButtonT = new JButton("<html><center><i>JButtonT!") {
        @Override
        public JToolTip createToolTip() {
            JToolTip jToolTip = new JToolTip() {
                @Override
                public String getTipText() {
                    String s = ("<html><b><center> Description for: <i>JButton: " + new Random().nextInt(100));
                    return s;
                }
            };
            JOptionPane.showMessageDialog(null, "ToolTip processed",
                    "Title", JOptionPane.INFORMATION_MESSAGE);
            return jToolTip;
        }
    };

    private JButton jButtonT2 = new JButton("<html><center><i>JButtonT2!") {
        @Override
        public JToolTip createToolTip() {
            JToolTip jToolTip = new JToolTip() {
                @Override
                public String getTipText() {
                    String s = ("<html><b><center> Description for: <i>JButtonT2: " + new Random().nextInt(100));
                    return s;
                }
            };
            return jToolTip;
        }
    };


    //  JRadioButton, JCheckBox

    private class AL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Button pressed",
                    "Title", JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public HTMLComponents() throws HeadlessException {
//menus
        for (int i = 0; i < jMenus.length; i++) {
            jMenus[i] = new JMenu("<html><b><center>Menu:" + i);
            for (int j = 0; j < 5; j++) {
                JMenuItem jMenuItem = new JMenuItem("<html><b><center>Menu:" + i + "<i> item:" + i + j) {
                    @Override
                    public JToolTip createToolTip() {
                        JToolTip jToolTip = new JToolTip() {
                            @Override
                            public String getTipText() {
                                String s = ("<html><b><center> Description for: <i>" + getText().replace("<html><b><center>", ""));
                                return s;
                            }
                        };
                        return jToolTip;
                    }
                };
                jMenuItem.setToolTipText("");
                jMenus[i].add(jMenuItem);
            }
        }
//JButtons
        jButton.addActionListener(new AL());
        jButton.setToolTipText("<html><b><center> Description for: <i>JButton");
        jButton2.addActionListener(new AL());
        jButton2.setToolTipText("<html><b><center> Description for: <i>JButton2");
        jButtonT.setToolTipText(""); // отрабатывает внутренняя функция
        jButtonT2.setToolTipText("");// отрабатывает внутренняя функция


        setLayout(new FlowLayout());
        JMenuBar jMenuBar = new JMenuBar();
        jMenuBar.setName("MTab");
        for (JMenu jMenu : jMenus) {
            jMenuBar.add(jMenu);
        }
        JPanel jPanel = new JPanel();
        jPanel.setName("BTab");
        jPanel.add(jButton);
        jPanel.add(jButton2);
        jPanel.add(jButtonT);
        jPanel.add(jButtonT2);

// radiobuttons
        JPanel jPanel2 = new JPanel();
        jPanel2.setName("RTab");

        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 0; i < jRadioButtons.length; i++) {
            jRadioButtons[i] = new JRadioButton("<html><b><center>RB:" + i);
            buttonGroup.add(jRadioButtons[i]);
            jPanel2.add(jRadioButtons[i]);
        }
        jRadioButtons[0].setSelected(true);
// checkbox
        Random rnd = new Random();
        JPanel jPanel3 = new JPanel();
        jPanel3.setName("CTab");


        ButtonGroup buttonGroup2 = new ButtonGroup();
        for (int i = 0; i < jCheckBoxes.length; i++) {
            jCheckBoxes[i] = new JCheckBox("<html><b><center>CB:" + i);
            buttonGroup2.add(jCheckBoxes[i]);
            jPanel3.add(jCheckBoxes[i]);
        }
        jCheckBoxes[0].setSelected(true);

        jTabbedPane.add(jMenuBar);
        jTabbedPane.add(jPanel);
        jTabbedPane.add(jPanel2);
        jTabbedPane.add(jPanel3);

    add(jTabbedPane);


    //       add(jMenuBar);

    //      add(jButton);

    //    add(jButton3);


}

    public static void check() {
        SwingConsole.run(new HTMLComponents(), 400, 200);
    }

}
