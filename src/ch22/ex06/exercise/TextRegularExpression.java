package ch22.ex06.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TextRegularExpression extends JFrame{
    private JButton bStart = new JButton("Start Analyze");
    private JTextField textField = new JTextField(20);          // текстовое поле regex
    private JTextArea textAreaIn = new JTextArea(2, 40);    // текстовое поле text
    private JTextArea textAreaOut = new JTextArea(20, 40);  // текстовое поле

    public TextRegularExpression() throws HeadlessException {
        bStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = textAreaIn.getText(); // получить исходную строку
                String regex = textField.getText(); // получить текст
                if(s.length() == 0 || regex.length() == 0) {
                    textAreaOut.setText("Wrong Input Data, please repeat the input text ...");
                    return;
                }
                textAreaOut.setText(""); // очистить
                Matcher matcher = Pattern.compile(regex).matcher(s);
                while (matcher.find()) {
                    textAreaOut.append("Match \""+matcher.group()+"\" at positions "+
                            matcher.start()+"-"+(matcher.end()-1)+"\n");
                }
                if (textAreaOut.getText().equals("")) {
                    textAreaOut.setText("Match not found...");
                }
            }
        });

        setLayout(new FlowLayout());
        add(new JScrollPane(textAreaIn)); // добавить панель со скроллингом
        add(new JScrollPane(textAreaOut)); // добавить панель со скроллингом
        add(new JScrollPane(textField)); // добавить панель со скроллингом
        add(bStart); // кнопка добавления текста
//init fields
        textAreaIn.setText("abcabcabcdefabc");
        textField.setText("(abc)+");
    }

    public static void check() {
        String[] args = new String[] {
                "abcabcabcdefabc","abc+", "(abc)+","(abc){1,2}"
        };

        String s = args[0];
        System.out.println("Input: \""+s+"\"");
        for (String arg : args) {
            String regex = arg;
            Matcher matcher = Pattern.compile(regex).matcher(s);
            System.out.println("regex: "+arg+">>>");
            while (matcher.find()) {
                System.out.println("Match \""+matcher.group()+"\" at positions "+
                        matcher.start()+"-"+(matcher.end()-1));
            }
        }
        SwingConsole.run(new TextRegularExpression(),475,475);

    }
}
