package lib.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 10-Mar-17.
 */
public class ShowMethods extends JFrame {

    private JTextField nameField = new JTextField(25); // поле метода
    private JTextField wordField = new JTextField(10); // поле слова в методе

    private JLabel nameLabel = new JLabel("Class (press Enter):"); // поле слова в методе
    private JLabel wordLabel = new JLabel("Word:"); // поле слова в методе

    private JTextArea results = new JTextArea(40, 65); // поле результата
    private static Pattern qualifier = Pattern.compile("\\w+\\.");  // words.
    private int lines = 0;

    class NameMethod implements ActionListener {  // обработчик сообщений
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameClass = nameField.getText().trim(); // сжать пробелы
            String wordMethod = wordField.getText().trim(); // сжать пробелы

            if (nameClass.length() == 0) {
                results.setText("No match"); // не нашли
                return;
            }
            lines = 0;
            try {
                Class<?> c = Class.forName(nameClass);
                Method[] methods = c.getMethods();
                Constructor[] ctors = c.getConstructors();
                results.setText("");

                if (wordMethod.length() == 0) {  // поле поиска не заполнено
                    for (Method method : methods) {
                        results.append(qualifier.matcher(method.toString()).replaceAll("") + "\n"); // убрать все <word.>
                    }
                    for (Constructor ctor : ctors) {
                        results.append(qualifier.matcher(ctor.toString()).replaceAll("") + "\n"); // убрать все <word.>
                    }
                    lines =  methods.length+ctors.length;
                } else {
                    for (Method method : methods) {
                        if (method.toString().indexOf(wordMethod) != -1) {  // только методы с wordMethod
                            results.append(qualifier.matcher(method.toString()).replaceAll("") + "\n"); // убрать все <word.>
                        lines++;
                        }
                    }
                    for (Constructor ctor : ctors) {
                        if (ctor.toString().indexOf(wordMethod) != -1) {
                            results.append(qualifier.matcher(ctor.toString()).replaceAll("") + "\n"); // убрать все <word.>
                        lines++;
                        }
                    }
                }

                nameLabel.setText(String.format("Class ( lines %02d ):", lines));


            } catch (ClassNotFoundException ex) {
                results.setText("No match"); // не нашли
                return;
            }

        }
    }

    public ShowMethods() {
        NameMethod nameMethod = new NameMethod();   // listener
        nameField.addActionListener(nameMethod);    // добавили в поле обработчик, срабатывает по Enter
        wordField.addActionListener(nameMethod);
        JPanel top = new JPanel();
        top.add(wordLabel);
        top.add(wordField);
        top.add(nameLabel);
        top.add(nameField);
        add(BorderLayout.NORTH, top);
        nameField.setText("ch22.ex09.codeb.ShowAddListeners");
        wordField.setText("add");

        add(new JScrollPane(results)); // textArea в панель по центру
        nameMethod.actionPerformed(new ActionEvent("", 0, "")); // провоцируем срабатывание

    }


    public static void check() {
        SwingConsole.run(new ShowMethods(), 600, 400);
    }

    public static void main(String[] args) {
        check();
    }
}
