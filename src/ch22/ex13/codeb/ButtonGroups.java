package ch22.ex13.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.lang.reflect.Constructor;

/**
 * Vadim Voronov
 * Created: 18-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ButtonGroups extends JFrame {
    private static String[] ids = {
            "June", "Ward", "Beaver", "Wally", "Eddie", "Lumpy"
    };

    static JPanel makeBPanel(Class<? extends AbstractButton> kind, String[] ids) {
        ButtonGroup bg = new ButtonGroup();
        JPanel jp = new JPanel();
        String title = kind.getName();
        title = title.substring((title.lastIndexOf(".") + 1)); // вытащить заключительный текст кнопки
        jp.setBorder(new TitledBorder(title));
        for (String id : ids) {
            AbstractButton ab = new JButton("failed");
            try {
                Constructor ctor = kind.getConstructor(String.class); // получить конструктор с String параметром
                ab = (AbstractButton) ctor.newInstance(id); // создать методом Reflections кнопку нужного класса
            } catch (Exception e) {
                System.out.println("Can't create " + kind);
            }
            bg.add(ab); // в группу bg добавить кнопку
            jp.add(ab); // эту же кнопку добавить в панель
        }
        return jp;  // вернуть панель
    }

    public ButtonGroups() {
        setLayout(new FlowLayout());
        add(makeBPanel(JButton.class,ids));
        add(makeBPanel(JToggleButton.class,ids));
        add(makeBPanel(JCheckBox.class,ids));
        add(makeBPanel(JRadioButton.class,ids));
    }

    public static void check() {
        SwingConsole.run(new ButtonGroups(),500,350);
    }

}
