package ch22.ex36.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BangBean3 extends JPanel implements Serializable {
    private int xm;
    private int ym;
    private int cSize = 20;
    private String text = "Bang!";
    private int fontSize = 48;
    private Color tColor = Color.RED;
    private ArrayList<ActionListener> actionListener = new ArrayList<>();  // многоадресный слушатель

    class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            Graphics g = getGraphics();
            g.setColor(tColor);
            g.setFont(new Font("TimeRoman", Font.BOLD, fontSize)); // задать новый фонт
            int width = g.getFontMetrics().stringWidth(text);  // ширина шрифта
            g.drawString(text, (getSize().width - width) / 2, getSize().height / 2); // в центре кадра
            g.dispose();
//                actionListener.actionPerformed(new ActionEvent(
//                        BangBean2.this, ActionEvent.ACTION_PERFORMED, null) );
            notifyListeners(); // вместо одного рассылаем событие всем
        }
    }

    class MML extends MouseMotionAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {  // обновляются координаты
            xm = e.getX();
            ym = e.getY();
            repaint();  //не вызывается головной объект т.к. есть super.paintComponent
        }
    }

    public BangBean3() {
        addMouseListener(new ML());
        addMouseMotionListener(new MML());

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action Event " + e);
            }
        });

        addActionListener(new ActionListener() {  // второй Listener
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BangBean2 action ");
            }
        });

        addActionListener(new ActionListener() {  // третий Listener
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("More action ");
            }
        });

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    @Override
    protected synchronized void paintComponent(Graphics g) {  // перерисовка окружности на новом месте
        super.paintComponent(g);  // чтобы использовать локальный repaint()
        g.setColor(Color.BLACK);
        g.drawOval(xm - cSize / 2, ym - cSize / 2, cSize, cSize); // окружность вокруг центра

    }

    //JavaBeans support
    public int getcSize() {
        return cSize;
    }

    public void setcSize(int cSize) {
        this.cSize = cSize;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public Color gettColor() {
        return tColor;
    }

    public void settColor(Color tColor) {
        this.tColor = tColor;
    }

    // JavaBean Listeners
// ВНИМАНИЕ  многоадресный слушатель
    public synchronized void addActionListener(ActionListener al) {
        actionListener.add(al);  // получить свой обработчик
    }

    public synchronized void removeActionListener(ActionListener al) {
        actionListener.remove(al);  // отключить обработчик
    }

    public void notifyListeners() {
        ActionEvent action = new ActionEvent(BangBean3.this, ActionEvent.ACTION_PERFORMED, null);
        ArrayList<ActionListener> clone = null;
        synchronized (this) {  // блок синхронизации
            clone = actionListener;  // для работы с клоном но он копия только по ссылке
        }
        for (ActionListener listener : clone) { // по сути рассылка события
            listener.actionPerformed(action);  // перебрать все Listener и все оповестить
        }
    }

    public static void check() {
        BangBean3 bangBean2 = new BangBean3();
        bangBean2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action Event " + e);
            }
        });

        bangBean2.addActionListener(new ActionListener() {  // второй Listener
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BangBean2 action ");
            }
        });

        bangBean2.addActionListener(new ActionListener() {  // третий Listener
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("More action ");
            }
        });
        JFrame jFrame = new JFrame();  // запуск JFrame снаружи
        jFrame.add(bangBean2);
        SwingConsole.run(jFrame, 300, 300);
    }

}
