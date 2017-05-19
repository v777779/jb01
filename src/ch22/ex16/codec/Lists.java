package ch22.ex16.codec;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Lists extends JFrame {
    private String[] flavors = {
            "Chocolate", "Strawberry", "Vanilla Fudge Swirl",
            "Mint Chip", "Mocha Almond Fudge", "Rum Raisin",
            "Praline Cream", "Mud Pie"
    };
    private DefaultListModel listItems = new DefaultListModel(); // нужен для добавлений в список элементов по одному
    private JList list = new JList(listItems);                              // listItems это Component прокладка
    private JTextArea textArea = new JTextArea(flavors.length,20);   // между массивом String и JList
    private JButton button = new JButton("Add items");       // фиксированный список можно new JList(String[])
    private ActionListener bListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count < flavors.length) {
                listItems.add(0,flavors[count++]);
            }else {
                button.setEnabled(false); // отключить кнопку если нет новых элементов
            }

        }
    };

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

    private int count = 0;

    public Lists() {
        textArea.setEditable(false);
        setLayout(new FlowLayout());
        Border border = BorderFactory.createMatteBorder(1, 1, 2, 2, Color.BLACK);
        list.setBorder(border);
        list.addListSelectionListener(listListener);
        textArea.setBorder(border);
        button.addActionListener(bListener);
        for (int i = 0; i < 4; i++) {
            listItems.addElement(flavors[count++]);  // добавление String в объект Component
        }
        add(textArea);
        add(list);
        add(button);


    }


    public static void check() {
        SwingConsole.run(new Lists(),250,375);
    }
}
