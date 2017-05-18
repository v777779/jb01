package ch22.ex09.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ShowAddListeners extends JFrame {
    private JTextField nameField = new JTextField(25); // поле метода
    private JTextArea results = new JTextArea(40, 65); // поле результата
    private static Pattern pattern = Pattern.compile("(add\\w+?Listener\\(.*?\\))");
    private static Pattern qualifier = Pattern.compile("\\w+\\.");  // words.

    class NameL implements ActionListener {  // обработчик сообщений
        @Override
        public void actionPerformed(ActionEvent e) {
            String nameClass = nameField.getText().trim(); // сжать пробелы
            if (nameClass.length() == 0) {
                results.setText("No match"); // не нашли
                return;
            }
            Class<?> kind;
            try {
                kind = Class.forName("javax.swing." + nameClass);
            } catch (ClassNotFoundException ex) {

                results.append("No match\n"); // нет такого класса
                return;
            }

            results.setText(""); // сбросить текст окна перед отработкой методов
            for (Method method : kind.getMethods()) {
                Matcher matcher = pattern.matcher(method.toString()); // отрабатывает имена методов
                if (matcher.find()) {
                    String methodName = matcher.group();
                    results.append(qualifier.matcher(methodName).replaceAll("") + "\n"); // замещаеи группы <fssdf.>
                }
            }
        }
    }

    public ShowAddListeners() {
        NameL nameListener = new NameL();
        nameField.addActionListener(nameListener);  // добавили в поле обработчик, срабатывает по Enter
        JPanel top = new JPanel();
        top.add(new JLabel("Swing class name (press Enter):"));
        top.add(nameField);
        add(top,BorderLayout.NORTH);
        add(new JScrollPane(results)); // textArea в панель по центру

        nameField.setText("JLabel");
        nameListener.actionPerformed(new ActionEvent("", 0, "")); // провоцируем срабатывание

    }

    public static void check() {
        SwingConsole.run(new ShowAddListeners(), 500, 400);

    }

}
