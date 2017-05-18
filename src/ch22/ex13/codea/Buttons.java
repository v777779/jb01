package ch22.ex13.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Buttons extends JFrame {
    private JButton jb = new JButton("JButton");
    private BasicArrowButton up = new BasicArrowButton(BasicArrowButton.NORTH);     // кнопка стрелки вверх
    private BasicArrowButton down = new BasicArrowButton(BasicArrowButton.SOUTH);   // кнопка стрелки вниз
    private BasicArrowButton left = new BasicArrowButton(BasicArrowButton.WEST);    // кнопка стрелки влево
    private BasicArrowButton right = new BasicArrowButton(BasicArrowButton.EAST);   // кнопка стрелки вправо
//    private JToggleButton toggleButton = new JToggleButton("JToggleButton");
//    private JCheckBox checkBox = new JCheckBox("JCheckBox");
//    private JRadioButton radioButton = new JRadioButton("JRadioButton");


    public Buttons() {
        setLayout(new FlowLayout());
        add(jb);
        add(new JToggleButton("JToggleButton"));
        add(new JCheckBox("JCheckBox"));
        add(new JRadioButton("JRadioButton"));
        JPanel jp = new JPanel();
        jp.setBorder(new TitledBorder("Directions")); // на панели
        jp.add(up);
        jp.add(down);
        jp.add(left);
        jp.add(right);
        add(jp);
    }

    public static void check() {
        SwingConsole.run(new Buttons(),350,200);
    }
}
