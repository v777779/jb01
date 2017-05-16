package ch22.ex08.exercise;

import lib.maps.Countries;
import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TextArea extends JFrame {
    private JButton b1 = new JButton("Add Data");
    private JButton c1 = new JButton("Clear Data");
    private JButton c2 = new JButton("Change Cursor");
    private JButton c3 = new JButton("Restore Cursor");

    private Component component;
    private Cursor cursor = new Cursor(Cursor.CROSSHAIR_CURSOR);


    private JTextArea textArea = new JTextArea(20, 40); // текстовое поле
    private Map<String, String> map = new HashMap<>();

    public TextArea() { // как сработает Listener по кнопке b1 сразу же влепит всю Map в поле
        map.putAll(Countries.capitals()); // все столицы поместить в Map
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    textArea.append(entry.getKey() + " : " + entry.getValue() + "\n");
                }
            }
        });

        c1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(""); // стереть все поле
            }
        });

        c2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                component.setCursor(TextArea.this.cursor);

            }
        });


        c3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                component.setCursor(Cursor.getDefaultCursor());
            }
        });


        setLayout(new FlowLayout());
        add(new JScrollPane(textArea)); // добавить панель со скроллингом
        add(b1); // кнопка добавления текста
        add(c1); // кнопка стирания текста
        add(c2); // кнопка установки курсора
        add(c3); // кнопка восстановления курсора
        component= this;
    }

    public static void check() {
        SwingConsole.run(new TextArea(), 475, 425);
    }

}
