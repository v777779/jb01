package ch22.ex35.exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;
import java.util.TooManyListenersException;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BangBean extends JPanel implements Serializable {
    private int xm = 100;
    private int ym = 100;
    private int cSize = 20;
    private String text = "Bang!";
    private int fontSize = 48;
    private Color tColor = Color.RED;
    private ActionListener actionListener;

    class ML extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            Graphics g = getGraphics();
            g.setColor(tColor);
            g.setFont(new Font("TimeRoman", Font.BOLD, fontSize)); // задать новый фонт
            int width = g.getFontMetrics().stringWidth(text);  // ширина шрифта
            g.drawString(text, (getSize().width - width) / 2, getSize().height / 2); // в центре кадра
            g.dispose();
            if (actionListener != null) {  // если объект существует то вызвать автоматическую сработку
                actionListener.actionPerformed(new ActionEvent(
                        BangBean.this, ActionEvent.ACTION_PERFORMED, null)
                );
            }
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

    public BangBean() {
        addMouseListener(new ML());
        addMouseMotionListener(new MML());
    }


    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);  // если в форме не задано, то это работает
    }

    @Override
    protected void paintComponent(Graphics g) {  // перерисовка окружности на новом месте
        super.paintComponent(g);  // чтобы использовать локальный repaint()
        g.setColor(Color.BLACK);
        g.drawOval(xm-cSize/2,ym-cSize/2,cSize,cSize); // окружность вокруг центра

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
    public void addActionListener(ActionListener al) throws TooManyListenersException{
        if (actionListener != null) {
            throw new TooManyListenersException();  // обработчик может быть только один
        }
        actionListener = al;  // получить свой обработчик
    }

    public void removeActionListener(ActionListener al){
        actionListener = null;  // отключить обработчик
    }


}
