package ch22.ex24.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


/**
 * Vadim Voronov
 * Created: 21-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class SliderPoint extends JFrame {
    private final int SIZE_X = 480;
    private final int OFFSET_X = 80;
    private final int SIZE_Y = 350;
    private JSlider jsMoveY = new JSlider(1, SIZE_Y, SIZE_Y / 2);
    private JSlider jsMoveX = new JSlider(1, SIZE_X, SIZE_X / 2);
    private JTextField jtMoveY = new JTextField("Y:" + SIZE_Y / 2, 5);
    private JTextField jtMoveX = new JTextField("X:" + SIZE_X / 2, 5);
    private JButton jButton = new JButton("Clear Screen");

    private int radius = 10;
    private List<Point> list = new ArrayList<>();
    private boolean block = false;

    class CLY implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            int x = jsMoveX.getValue() + OFFSET_X;
            int y = SIZE_Y - jsMoveY.getValue();
            jtMoveY.setText(String.format("Y:%3d", y));
            if (block) {  // если заблокирован, то не отрабатывать repaint
                return;
            }
            list.add(new Point(x, y));
            repaint();
        }
    }

    class CLX implements ChangeListener {
        @Override
        public void stateChanged(ChangeEvent e) {         // отрабатывает JSlider
            int x = jsMoveX.getValue() + OFFSET_X;
            int y = SIZE_Y - jsMoveY.getValue();
            jtMoveX.setText(String.format("X:%3d", x));
            if (block) {  // если заблокирован, то не отрабатывать list,repaint
                return;
            }
            list.add(new Point(x, y));
            repaint();
        }
    }

    class AL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            initList();  // сбросить list

        }
    }

    private void initList() {

        list.clear();
        list.add(new Point(SIZE_X / 2 + OFFSET_X, SIZE_Y / 2));  // две точки начало и конец
        block = true;
        jsMoveX.setValue(SIZE_X / 2); // будет прорисовывать, надо заблокировать
        jsMoveY.setValue(SIZE_Y / 2);
        block = false;
        repaint();

    }

    private JPanel jPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            Point pStart = new Point(list.get(0));
// начальная точка
            g.drawOval(pStart.x, pStart.y, radius, radius);
            g.setColor(Color.BLUE);
            g.fillOval(pStart.x, pStart.y, radius, radius);

            Graphics2D g2d = (Graphics2D) g;
            Stroke stroke = g2d.getStroke();
            g2d.setStroke(new BasicStroke(radius - 1));
            g2d.setColor(Color.BLUE);
            for (Point point : list) {
                g2d.drawLine(pStart.x + 5, pStart.y + 5, point.x + 5, point.y + 5);
                pStart = point;
            }
// завершающую точку
            g2d.setStroke(stroke); // вернуть
            g.drawOval(pStart.x, pStart.y, radius, radius);
            g.setColor(Color.BLUE);
            g.fillOval(pStart.x, pStart.y, radius, radius);
        }
    };


    public SliderPoint() throws HeadlessException {
//        setLayout(new FlowLayout());

        jPanel.setPreferredSize(new Dimension(600, 400));

        jsMoveY.setPreferredSize(new Dimension(20, SIZE_Y));
        jsMoveY.addChangeListener(new CLY());
        jsMoveY.setOrientation(SwingConstants.VERTICAL);

        jtMoveY.setHorizontalAlignment(SwingConstants.CENTER);
        jtMoveY.setEditable(false);

        jsMoveX.setPreferredSize(new Dimension(SIZE_X, 20));
        jsMoveX.addChangeListener(new CLX());
        jsMoveX.setOrientation(SwingConstants.HORIZONTAL);


        jtMoveX.setHorizontalAlignment(SwingConstants.CENTER);
        jtMoveX.setEditable(false);

        jButton.addActionListener(new AL());

        JLabel jLabel = new JLabel("Color JPanel with Sliders");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(jLabel, BorderLayout.NORTH);
        add(jPanel);
//        add(jsSpeed);
        JPanel jpRed = new JPanel();
        jpRed.add(new JLabel("Y:"));
        jpRed.add(jsMoveY);
        jpRed.add(jtMoveY);
        add(jpRed, BorderLayout.EAST);

//        add(jsMoveX);
        JPanel jpMoveX = new JPanel();
        jpMoveX.setLayout(new BorderLayout(2, 3));
        jpMoveX.add(new JLabel("X:"), BorderLayout.WEST);
        jpMoveX.add(jsMoveX, BorderLayout.CENTER);
        jpMoveX.add(jtMoveX, BorderLayout.EAST);
//        jpMoveX.add(jButton,BorderLayout.SOUTH);
        JPanel subPanel = new JPanel(new GridLayout(1, 5));
        subPanel.add(new JPanel()); // пропуск
        subPanel.add(new JPanel()); // пропуск
        subPanel.add(jButton); // кнопка по центру
        subPanel.add(new JPanel()); // пропуск
        subPanel.add(new JPanel()); // пропуск
        jpMoveX.add(subPanel, BorderLayout.SOUTH);
        add(jpMoveX, BorderLayout.SOUTH);
// перерисовка автоматом
        initList();
    }


    public static void check() {
        SwingConsole.run(new SliderPoint(), 700, 450);
    }

    public static void main(String[] args) {
        check();
    }

}
