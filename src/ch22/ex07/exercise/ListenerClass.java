package ch22.ex07.exercise;

import ch22.ex03.codea.SwingConsole;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ListenerClass extends JFrame {
    String s = ("JTextField text String " +
            "Names File Description Listening Mode Selected File Man Ball " +
            " Goal Target Next Model Game").replaceAll(" ", "\n");


    private JButton button = new JButton("Timer Off");
    private JButton button2 = new JButton("TextField");
    private JMenuItem menuItem = new JMenuItem("JMenuItem text");
    private JCheckBox checkBox = new JCheckBox("JCheckBox text");
    private JComboBox<String> comboBox = new JComboBox(new String[]{"ComboItem 1", "ComboItem 2", "ComboItem 3"});
    private JFileChooser fileChooser = new JFileChooser("D:\\temp2\\");
    private JTextField textField = new JTextField("Press Enter to Action", 20);
    private JTextArea textArea = new JTextArea(s);
    private JLabel label = new JLabel("JLabel Text:_");

    private int timerCount = 0;
    private Timer timer = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (timerCount < 10) {
                System.out.println("Timer tick:" + timerCount++);
               label.setText("JLabel Text:"+timerCount);
            }
        }
    });

    //extra task
    DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> list = new JList<>(listModel); // через modelList



    public ListenerClass() {
//button listener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                if (button.getText().equals("Timer") || button.getText().equals("Timer Off")) {
                    String s = "Timer On";
                    button.setText(s);
                    System.out.println(s);
                    timer.start();
                } else {
                    String s = "Timer Off";
                    button.setText(s);
                    System.out.println(s);
                    timer.stop();
                }
            }
        });
//button listener
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Time" + Calendar.getInstance().getTime());
            }
        });

//menuItem listener
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("menuItem selected");
            }
        });
//checkBox listener
        checkBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("checkBox selected");
            }
        });
//comboBox listener
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> comboBox = (JComboBox<String>) e.getSource();
                System.out.println("comboBox selected :" + comboBox.getSelectedItem());
            }
        });
//fileChooser listener
        fileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = (JFileChooser) e.getSource();
                System.out.println("selected file:" + fileChooser.getSelectedFile().getName());
            }
        });

//textField listener
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("textField selected");
            }
        });
//textArea listener
        textArea.setColumns(20);
        textArea.setRows(5);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(400,100));
        textArea.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {
                System.out.println("textArea selected");
            }
            @Override
            public void ancestorRemoved(AncestorEvent event) {
                System.out.println("textArea selected");

            }

            @Override
            public void ancestorMoved(AncestorEvent event) {
                System.out.println("textArea selected");
            }
        });

//textField listener
        label.addAncestorListener(new AncestorListener() {
            @Override
            public void ancestorAdded(AncestorEvent event) {
                System.out.println("label selected");
            }

            @Override
            public void ancestorRemoved(AncestorEvent event) {
                System.out.println("label selected");
            }

            @Override
            public void ancestorMoved(AncestorEvent event) {
                System.out.println("label selected");
            }
        });

//extra task
        listModel.addElement("List Label 1");
        listModel.addElement("List Label 2");
        listModel.addElement("List Label 3");
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                JList list = (JList) e.getSource(); // получить объект выделения
                System.out.println("List element:" + list.getModel().getElementAt(e.getFirstIndex()));
            }
        });
        list.setVisible(true);
        list.setVisibleRowCount(-1);
        JScrollPane scrollPane2 = new JScrollPane(list);
        scrollPane2.setPreferredSize(new Dimension(250, 80));

//adding

        setLayout(new FlowLayout());
        add(label);
        add(button);
        add(button2);
        add(menuItem);
        add(checkBox);
        add(comboBox);
        add(textField);
        add(new JScrollPane(textArea));
        //add(scrollPane); // textArea
        add(fileChooser);


//extra task
//        add(new JScrollPane(list));
        add(scrollPane2);// list

    }

    public static void check() {
        System.out.println("Check ActionListeners For:");
        System.out.println("JLabel JButton JMenuItem JCheckBox JComboBox");
        System.out.println("JCheckBox JTextField JTextArea JFileChooser");
        System.out.println("JList JLabel");
        System.out.println();
        SwingConsole.run(new ListenerClass(), 800, 400);
    }
}
