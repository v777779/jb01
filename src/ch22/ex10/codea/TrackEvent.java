package ch22.ex10.codea;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

/**
 * Vadim Voronov
 * Created: 17-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TrackEvent extends JFrame {
    private HashMap<String, JTextField> hMap = new HashMap<>();

    private String[] events = {
            "focusGained", "focusLost", "keyPressed",
            "keyReleased", "keyTyped", "mouseClicked",
            "mouseEntered", "mouseExited", "mousePressed",
            "mouseReleased", "mouseDragged", "mouseMoved"
    };


    class MyButton extends JButton{
        void report(String field, String msg) {
            hMap.get(field).setText(msg);
        }

        FocusListener fl = new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                report("focusGained",e.paramString()); // просто показывает что сработало
            }

            @Override
            public void focusLost(FocusEvent e) {
                report("focusLost",e.paramString()); // просто показывает что сработало
            }
        };
        KeyListener kl = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                report("keyTyped",e.paramString()); // просто показывает что сработало

            }

            @Override
            public void keyPressed(KeyEvent e) {
                report("keyPressed",e.paramString()); // просто показывает что сработало

            }

            @Override
            public void keyReleased(KeyEvent e) {
                report("keyReleased",e.paramString()); // просто показывает что сработало

            }
        };

        MouseListener ml = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                report("mouseClicked",e.paramString()); // просто показывает что сработало
            }

            @Override
            public void mousePressed(MouseEvent e) {
                report("mousePressed",e.paramString()); // просто показывает что сработало
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                report("mouseReleased",e.paramString()); // просто показывает что сработало
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                report("mouseEntered",e.paramString()); // просто показывает что сработало
            }

            @Override
            public void mouseExited(MouseEvent e) {
                report("mouseExited",e.paramString()); // просто показывает что сработало
            }
         };
        MouseMotionListener mml = new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                report("mouseDragged",e.paramString()); // просто показывает что сработало

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                report("mouseMoved",e.paramString()); // просто показывает что сработало

            }
        };

        public MyButton(Color color, String label) {  // это setup кнопки
            super(label);
            setBackground(color);
            addFocusListener(fl);
            addKeyListener(kl);
            addMouseListener(ml);
            addMouseMotionListener(mml);
        }
    }

    private MyButton b1 = new MyButton(Color.BLUE, "test1");
    private MyButton b2 = new MyButton(Color.RED, "test2");

    public TrackEvent() {
        setLayout(new GridLayout(events.length+1,2)); // целая туча событий
        for (String event : events) {
            JTextField textField = new JTextField(); // текстовое поле
            textField.setEditable(true);
            add(new JLabel(event,JLabel.RIGHT)); // добавить надпись к полю
            add(textField); // добавить само поле
            hMap.put(event,textField); // в карту для отработки Listener
        }
        add(b1);
        add(b2);
    }

    public static void check() {
        SwingConsole.run(new TrackEvent(),700,500); // размещение по сетке
    }
}

