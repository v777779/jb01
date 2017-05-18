package ch22.ex13.exercise.document;

import ch22.ex13.coded.UpperCaseDocument;
import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TextFields extends JFrame {
    private JButton b1 = new JButton("Get Text");
    private JButton b2 = new JButton("Set Text");

    private JTextField t1 = new JTextField(30);
    private JTextField t2 = new JTextField(30);
    private JTextField t3 = new JTextField(30);

    private String s = "";
    private UpperCaseDocument ucd = new UpperCaseDocument();

    class T1 implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            t2.setText(t1.getText()); // вставить в поле t2 текст из t1
            t3.setText("Text: " + t1.getText()); // тоже но с надписью
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            t2.setText(t1.getText());
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
        }
    }

    class T1A implements ActionListener {
        private int count = 0;
        @Override
        public void actionPerformed(ActionEvent e) {
            t3.setText("t1 Action Event " + count++); // подсчитывает число событий t1
        }
    }

    class B1 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (t1.getSelectedText() == null) {
                s = t1.getText(); // полный текст если нет выделения
            } else {
                s = t1.getSelectedText(); // выделение
            }
            t1.setEditable(true); // открыть t1 для редактирования
        }
    }

    class B2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
//            ucd.setUpperCase(false); // запретить перевод в UpperCase
            t1.setText("Inserted by Button2: " + s);
//            ucd.setUpperCase(true); // восстановить UpperCase
            t1.setEditable(false); // запрет редактирования t1 пока не нажата b1
        }
    }

    public TextFields() {
        t1.setDocument(ucd); // подключено к документу ucd
        ucd.addDocumentListener(new T1());
        ucd.setUpperCase(false);
        b1.addActionListener(new B1());  // читает строку s  из t1
        b2.addActionListener(new B2());  // пишет строку s в t1 без UpperCase по b2 запрет t1
        t1.addActionListener(new T1A()); // пишет счетчик изменений t1
        setLayout(new FlowLayout());
        add(b1);
        add(b2);
        add(t1);
        add(t2);
        add(t3);
    }

    public static void check() {
        SwingConsole.run(new TextFields(),375,200);
    }

}
