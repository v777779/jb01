package ch22.ex35.exercise;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class JavaBeanGUI extends JFrame {
    private JTextField textField1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JPanel rootPanel;
    private BangBean bangBean;

    public JavaBeanGUI() {
        checkBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("JavaBeanGUI.actionPerformed");
            }
        });

        add(rootPanel);

    }

}
