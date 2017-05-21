package ch22.ex20.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ListenerClass extends JFrame {
    File file;
    private JFileChooser fileChooser = new JFileChooser("D:\\temp2\\");
    private JButton button = new JButton("Switch menu bar");
    private JTextField textField = new JTextField("File:", 20);
    private JMenuBar jMenuBar = new JMenuBar();
    private JMenuBar jMenuBar2 = new JMenuBar(); // from file
    private JMenu jMenuFile = new JMenu("File");
    private JMenuItem jItemFile[] = {
            new JMenuItem("Open"),
            new JMenuItem("Exit")
    };
    private List<JMenu> listMenus = new ArrayList<>();
    private JFrame jFrame;
    private boolean currentBar = false;

    class BL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (listMenus.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Menu not imported",
                        "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
//                JOptionPane.showMessageDialog(null, "Menu imported",
//                        "Info", JOptionPane.INFORMATION_MESSAGE);
                if (!currentBar) {
                    if (jMenuBar2.getMenuCount() > 0) {
                        currentBar = true;
                        setJMenuBar(jMenuBar2);
                        validate();
                    }
                } else {
                    currentBar = false;
                    setJMenuBar(jMenuBar);
                    validate();

                }
            }
        }
    }

    class FL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = (JFileChooser) e.getSource();
            file = fileChooser.getSelectedFile();
            System.out.println("selected file:" + fileChooser.getSelectedFile().getName());
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "CP1251"));
                List<String> list = new ArrayList<>();
                String s;
                while ((s = br.readLine()) != null) {
                    if (s.length() > 2) {
                        list.add(s);  // набрать полный список пунктов
                    }
                }

                String[] sMenus = list.get(0).split("\\W+"); // все меню
                int size = sMenus.length;
                for (int i = 0; i < size; i++) {
                    s = sMenus[i].trim();
                    if (s.length() < 2) {  //
                        s = "Empty";
                    }
                    listMenus.add(new JMenu(s));
                }
                if (list.size() > size + 1) {
                    for (int i = 0; i < list.size() - size - 1; i++) {
                        listMenus.add(new JMenu("MenuAdd" + (i + 1))); // дополнительные меню
                    }
                }
//menuItems
                list.remove(0); // удалили строку меню
                for (int i = 0; i < list.size(); i++) {
                    String[] items = list.get(i).split("\\W+");
                    for (int j = 0; j < items.length; j++) {
                        String item = items[j].trim();
                        if (item.length() < 1) {
                            item = "Empty" + (j + 1);
                        }
                        JMenu jMenu = listMenus.get(i);
                        JMenuItem jMenuItem = new JMenuItem(item);
                        jMenuItem.addActionListener(new MListener());
                        jMenu.add(jMenuItem); // добавили пункт меню
                    }
                }
                jMenuBar2 = new JMenuBar();
                for (JMenu jMenu : listMenus) {
                    jMenuBar2.add(jMenu);
                }
//                        setJMenuBar(jMenuBar);
                textField.setText("JMenuBar2: " + jMenuBar2.getMenuCount());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

        }
    }

    class MFListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem jItem = (JMenuItem) e.getSource();
            //new JPanel(fileChooser)
            fileChooser.showOpenDialog(null);
            System.out.println(fileChooser.getSelectedFile());
        }
    }

    class MEListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            jFrame.dispose(); // закрыть
        }
    }
    class MListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            textField.setText(((JMenuItem)e.getSource()).getText());
        }
    }

    public ListenerClass() {
        button.addActionListener(new BL());
//fileChooser listener
        fileChooser.addActionListener(new FL());


//adding
        setLayout(new FlowLayout());
        add(button);
        add(textField);
        jItemFile[0].addActionListener(new MFListener());
        jItemFile[1].addActionListener(new MEListener());

        jMenuFile.add(jItemFile[0]);
        jMenuFile.add(jItemFile[1]);
        jMenuBar.add(jMenuFile);
        setJMenuBar(jMenuBar);
        jFrame = this; // ссылку на JFrame

    }

    public static void check() {
        SwingConsole.run(new ListenerClass(), 800, 400);
    }
}
