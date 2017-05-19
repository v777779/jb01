package ch22.ex16.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Lists2 extends JFrame {
    private String[] flavors = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
//    private DefaultListModel listItems = new DefaultListModel();
    private JList list = new JList(flavors);
    private JTextArea textArea = new JTextArea(flavors.length,20);

    private ListSelectionListener listListener = new ListSelectionListener() {
        @Override
        public void valueChanged(ListSelectionEvent e) {
            if (e.getValueIsAdjusting()) {
                return;
            }
            textArea.setText("");
            for (Object item : list.getSelectedValuesList()) {
                textArea.append(item+"\n");
            }
        }
     };

    public Lists2() {
        textArea.setEditable(false);
        setLayout(new FlowLayout());
        Border border = BorderFactory.createMatteBorder(1, 1, 2, 2, Color.BLACK);
        list.setBorder(border);
        list.addListSelectionListener(listListener);
        textArea.setBorder(border);

//        for (int i = 0; i < flavors.length; i++) {
//            listItems.addElement(flavors[i]);
//        }
       add(textArea);
        add(list);
    }


    public static void check() {
        SwingConsole.run(new Lists2(),250,375);
    }
}
