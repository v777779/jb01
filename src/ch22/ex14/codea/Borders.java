package ch22.ex14.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Borders extends JFrame{
    public static JPanel showBorder(Border b) {
        JPanel jp = new JPanel();
        jp.setLayout(new BorderLayout());
        String name = b.getClass().toString(); // имя класса в строку
        name = name.substring(name.lastIndexOf(".")+1); // вытащить чистое имя
        jp.add(new JLabel(name, JLabel.CENTER),BorderLayout.CENTER); // в центр BorderLayout
        jp.setBorder(b);                                            // задать новый Border
        return jp;                                                  // вернуть новую панель
    }

    public Borders() {
        setLayout(new GridLayout(2,4)); // 2 на 4 поле
        add(showBorder(new TitledBorder("Title")));                     // добавить панель с именем класса
        add(showBorder(new EtchedBorder()));                                // добавить панель с именем класса
        add(showBorder(new LineBorder(Color.BLUE)));                        // добавить панель с именем класса
        add(showBorder(new MatteBorder(5,5,30,30,Color.GREEN))); // добавить панель с именем класса
        add(showBorder(new BevelBorder(BevelBorder.RAISED)));               // добавить панель с именем класса
        add(showBorder(new SoftBevelBorder(BevelBorder.LOWERED)));          // добавить панель с именем класса
        add(showBorder(new CompoundBorder(new EtchedBorder(),new LineBorder(Color.RED)))); // добавить панель с именем класса
    }

    public static void check() {
        SwingConsole.run(new Borders(),500,300);
    }
}
