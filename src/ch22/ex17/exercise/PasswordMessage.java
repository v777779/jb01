package ch22.ex17.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Vadim Voronov
 * Created: 19-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class PasswordMessage extends JFrame {
    private JButton[] buttons = {
            new JButton("Alert"), new JButton("Yes/No"),
            new JButton("Color"), new JButton("Input"),
            new JButton("3 Vals")
    };
    private JTextField textField = new JTextField(30);
    private JPasswordField passwordField = new JPasswordField("Password", 30);
    private String stringPassword = "111111";


    private JTextArea textArea = new JTextArea(200, 50);
    private JPanel[] jPanels = {   //place Holders
            new JPanel(), new JPanel(), new JPanel(),
            new JPanel(), new JPanel()
    };

    private boolean focusFirst = false;

    public PasswordMessage() {

        passwordField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = new String(passwordField.getPassword());
                if (s.equals(stringPassword)) {
                    JOptionPane.showMessageDialog(null,
                            "Access granted!", "System Message",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Access denied!", "System Message",
                            JOptionPane.ERROR_MESSAGE);
                }
//                textField.requestFocus(); // focus on textField
                textField.setText(s);
                focusFirst = false; // focus lost
            }
        });

        passwordField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                if(!focusFirst) {
                    passwordField.setText(""); // стереть и добавить первый символ
                    focusFirst = true;
                }
            }
        });


        setLayout(new GridLayout(5, 1));

        jPanels[0].add(new JLabel("Please input password:"));
        jPanels[1].add(passwordField);
        jPanels[4].add(textField); // at last position

        for (JPanel jPanel : jPanels) {
            add(jPanel);
        }

    }

    public static void check() {
        SwingConsole.run(new PasswordMessage(), 400, 240);
    }

}
