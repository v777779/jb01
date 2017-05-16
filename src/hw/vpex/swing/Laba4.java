package hw.vpex.swing;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Vadim Voronov
 * Created: 16-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Laba4 extends JFrame {
    DefaultListModel listModel = new DefaultListModel();
    File dir2;
    File dir = new File("D:\\");
    Vector elements = new Vector();
    JButton Open = new JButton("Open TXT");
    JButton Return = new JButton("Back");
    JButton Delete = new JButton("Del");
    JButton Go = new JButton("Go to");
    JButton Create = new JButton("New folder ");
    JButton TestPanel = new JButton("HERE");
    JButton CreateTxt = new JButton("New TXT");
    JButton TestButton = new JButton("Properites");
    JTextField Name = new JTextField("", 5);//пропуск, пустое место, ширина 5
    JLabel Window = new JLabel();//окно 1, JLabel - название окошка, поле
    JLabel Window1 = new JLabel();//окно 2
    JLabel Window2 = new JLabel();//окно 3
    JList List = new JList(listModel);
    int a;

    public Laba4() {
        for (File item : dir.listFiles())
            elements.add(0, item.getName());
        a = elements.size();
        JFrame General = new JFrame("TCM");
        General.setSize(950, 600);
        General.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        General.setVisible(true);
        General.setLocation(200, 150); //положение левой верхней точки программы
        General.setLayout(null);
        General.getContentPane().setBackground(Color.DARK_GRAY);

        Open.addActionListener(new ActionListener() {
                                   @Override // метод переопределяет объявление метода в базовом классе.
                                   public void actionPerformed(ActionEvent e) //для определения нажатой кнопки используется команда действия.
                                   {
                                       dir2 = new File((String) List.getSelectedValue());
                                       File dir8 = new File(dir.getPath() + File.separator + File.separator + dir2.getName());
                                       String[] text2 = new String[2];
                                       text2[0] = "notepad.exe";
                                       text2[1] = dir8.getAbsolutePath();
                                       try {
                                           Process process = Runtime.getRuntime().exec(text2, null);
                                       } catch (IOException ex) {
                                           Logger.getLogger(Laba4.class.getName()).log(Level.SEVERE, null, ex);
                                       }
                                   }
                               }
        );

        Open.setSize(100, 40);
        Open.setLocation(650, 350);
        General.add(Open);

        Return.addActionListener(new ActionListener() {
                                     @Override // метод переопределяет объявление метода в базовом классе.
                                     public void actionPerformed(ActionEvent e) //для определения нажатой кнопки используется команда действия.
                                     {
                                         File dir3 = new File(dir.getParent());
                                         dir = dir3;

                                         elements.clear();

                                         for (int i = 0; i < a; i++)
                                             listModel.remove(0);

                                         for (File item : dir.listFiles())
                                             elements.add(0, item.getName());
                                         a = elements.size();

                                         for (int i = 0; i < a; i++)
                                             listModel.addElement(elements.elementAt(i));

                                         Window.setText("");
                                         Window1.setText("");
                                         Window2.setText("");

                                     }
                                 }
        );

        Return.setSize(100, 40);
        Return.setLocation(650, 100); //для кнопки назад
        General.add(Return);

        Delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dir2 = new File((String) List.getSelectedValue());
                File dir5 = new File(dir.getPath() + File.separator + File.separator + dir2.getName());
                if (dir5.delete()) {
                    Window.setText("Удалено");
                    Window1.setText("");
                    Window2.setText("");

                    elements.clear();

                    for (int i = 0; i < a; i++)
                        listModel.remove(0);

                    for (File item : dir.listFiles())
                        elements.add(0, item.getName());

                    a = elements.size();
                    for (int i = 0; i < a; i++)
                        listModel.addElement(elements.elementAt(i));
                } else {
                    Window.setText("Не получилось =(");
                }
            }
        });

        Delete.setSize(100, 40);
        Delete.setLocation(650, 300);
        General.add(Delete);

        Go.addActionListener(new ActionListener() {
                                 @Override
                                 public void actionPerformed(ActionEvent e) {

                                     Window.setText((String) List.getSelectedValue());
                                     Window.setName("work");
                                     dir2 = new File((String) List.getSelectedValue());
                                     File dir1 = new File(dir.getPath() + File.separator + File.separator + dir2.getName());
                                     dir = dir1;

                                     elements.clear();

                                     for (int i = 0; i < a; i++)
                                         listModel.remove(0);

                                     for (File item : dir.listFiles())
                                         elements.add(0, item.getName());
                                     a = elements.size();

                                     for (int i = 0; i < a; i++)
                                         listModel.addElement(elements.elementAt(i));

                                     Window.setText("");
                                     Window1.setText("");
                                     Window2.setText("");
                                 }
                             }
        );
        Go.setSize(100, 40);
        Go.setLocation(650, 250);
        General.add(Go);

        Create.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dir2 = new File(Name.getText());
                File dir4 = new File(dir.getPath() + File.separator + File.separator + dir2.getName());
                boolean result = dir4.mkdirs();


                elements.clear();

                for (int i = 0; i < a; i++)
                    listModel.remove(0);

                for (File item : dir.listFiles())
                    elements.add(0, item.getName());

                a = elements.size();
                for (int i = 0; i < a; i++)
                    listModel.addElement(elements.elementAt(i));

            }
        });
        Create.setSize(100, 40);
        Create.setLocation(650, 200);
        General.add(Create);

        CreateTxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dir2 = new File(Name.getText());
                File dir7 = new File(dir.getPath() + File.separator + File.separator + dir2.getName() + ".txt");
                try {
                    dir7.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Laba4.class.getName()).log(Level.SEVERE, null, ex);
                }

                elements.clear();

                for (int i = 0; i < a; i++)
                    listModel.remove(0);

                for (File item : dir.listFiles())
                    elements.add(0, item.getName());

                a = elements.size();
                for (int i = 0; i < a; i++)
                    listModel.addElement(elements.elementAt(i));

            }
        });
        CreateTxt.setSize(100, 40);
        CreateTxt.setLocation(650, 150); //для кнопки файл-txt
        General.add(CreateTxt);

        TestButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dir2 = new File((String) List.getSelectedValue());
                File dir6 = new File(dir.getPath() + File.separator + File.separator + dir2.getName());
                Window.setText("Имя: " + dir6.getName());
                Window1.setText("\nПуть: " + dir6.getPath());
                Window2.setText("\nРазмер: " + dir6.length() + " байт");
            }
        });
        TestButton.setSize(100, 40);
        TestButton.setLocation(650, 50); //для кнопки свойства
        General.add(TestButton);

        Window.setSize(150, 40);
        Window.setLocation(650, 400);
        General.add(Window);

        Window1.setSize(200, 40);
        Window1.setLocation(650, 420);
        General.add(Window1);

        Window2.setSize(150, 40);
        Window2.setLocation(650, 440);
        General.add(Window2);


        Name.setSize(600, 40);
        Name.setLocation(40, 450);
        Name.setBackground(Color.CYAN);
        General.add(Name);

        List = new JList(listModel);

        for (int i = 0; i < a; i++)
            listModel.addElement(elements.elementAt(i));
        List.setSize(600, 400);
        List.setLocation(40, 30);
        List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        General.add(new JScrollPane(List));

        List.setBorder(new LineBorder(Color.DARK_GRAY));
        List.setBackground(Color.ORANGE);

        General.add(List);

        JScrollPane scroll = new JScrollPane(List);
        scroll.setSize(600, 400);
        scroll.setLocation(40, 30);

        General.add(scroll);



        List.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                if (event.getClickCount() > 1)
                    if (Desktop.isDesktopSupported()) {
                        Desktop desktop = Desktop.getDesktop();

                        Window.setText((String) List.getSelectedValue());
                        Window.setName("work");
                        dir2 = new File((String) List.getSelectedValue());
                        File dir1 = new File(dir.getPath() + File.separator + File.separator + dir2.getName());
                        dir = dir1;

                        elements.clear();


                        for (int i = 0; i < a; i++)
                            listModel.remove(0);


                        for (File item : dir.listFiles())
                            elements.add(0, item.getName());
                        a = elements.size();

                        for (int i = 0; i < a; i++)
                            listModel.addElement(elements.elementAt(i));

                        Window.setText("");
                        Window1.setText("");
                        Window2.setText("");
                    }
            }
        });
    }

    public void mouseEntered(MouseEvent event) {
    } //указатель мыши на поле

    public void mouseExited(MouseEvent event) {
    } //указатель мыши вне поля

    public void mousePressed(MouseEvent event) {
    } //кнопка мыши нажата

    public void mouseReleased(MouseEvent event) {
    } //кнопка мыши отпущена

    public static void main(String[] args) {
        Laba4 laba4 = new Laba4(); //создание нового объекта laba4
    }

}
