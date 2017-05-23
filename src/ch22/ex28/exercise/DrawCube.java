package ch22.ex28.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
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
public class DrawCube extends JFrame {
    private final int SIZE_X = 600;
    private final int SIZE_Y = 300;

    private final int OFFSET_X = 50;  //  0 = 50   600 = 650
    private final int OFFSET_Y = 300; //  0 = 300  300 = 0


    private Point orgPoint = new Point(0, 0);
    private Point yPoint = new Point(0, SIZE_Y);  // шкала 300  10 на очко
    private Point xPoint = new Point(SIZE_X, 0);  // шкала 400  400/n на бросок
    private int radius = 10; // радиус точки кривой

    private Cube[] cubes = new Cube[5];

    private JTextField[] jtMoves = new JTextField[6];
    ;

    private JButton jButton = new JButton("Throw Cubes");

    private List<Integer> list = new ArrayList<>(); // записать сумму бросков


    class AL implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {         // отрабатывает JSlider
            int sum = 0;
            for (int i = 0; i < cubes.length; i++) {
                sum += cubes[i].getValue();
                jtMoves[i].setText(String.format("Cube%d: %d",i,cubes[i].getLast()));
            }
            jtMoves[5].setText(String.format("Sum: %2d",sum));
            list.add(sum);
            repaint();
        }
    }

    private void initList() {
        list.clear();
        repaint();

    }

    private int cX(int x) {
        return x + OFFSET_X;
    }

    private int cY(int y) {
        return OFFSET_Y - y;
    }

    private JPanel jPanel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
// оси
            g.drawLine(cX(orgPoint.x), cY(orgPoint.y), cX(orgPoint.x), cY(yPoint.y));
            g.drawLine(cX(orgPoint.x), cY(orgPoint.y), cX(xPoint.x), cY(orgPoint.y));

            for (int i = 5; i <= 30; i += 5) {  // насечки на y
                g.drawLine(cX(orgPoint.x - 5), cY(orgPoint.y + i * 10), cX(orgPoint.x + 5), cY(orgPoint.y + i * 10));
            }

            if (list.size() == 0) {
                return; // нет значений
            }
            int count = list.size(); // число точек

            int stepX = SIZE_X; // число точек на интервале  начинаем с нуля
            if (list.size() > 1) {
                stepX = SIZE_X / (count - 1); // число точек на интервале  начинаем с нуля
            }

            for (int i = stepX; i <= SIZE_X; i += stepX) {
                g.drawLine(cX(i), cY(orgPoint.y - 5), cX(i), cY(orgPoint.y + 5));
            }

// значения
            int stepY = 10;
            int x = orgPoint.x; // начальная координата
            int y = orgPoint.y;
            int xOld = x; // начальная координата
            int yOld = y;
            Graphics2D g2d = (Graphics2D) g;
            Stroke stroke = g2d.getStroke();
            g2d.setColor(Color.BLUE);

            for (int i = 0; i < list.size(); i++) {
// начальная точка
                y = list.get(i) * stepY;// новое значение
                if (i > 0) {
                    x = xOld + stepX; // новое значение
                    g2d.setStroke(new BasicStroke(radius - 3));
                    g2d.drawLine(cX(xOld), cY(yOld), cX(x), cY(y));
                }
                g2d.setStroke(stroke);
                g2d.drawOval(cX(x - radius / 2), cY(y + radius / 2), radius, radius); // на новом месте
                g2d.fillOval(cX(x - radius / 2), cY(y + radius / 2), radius, radius);
                xOld = x;
                yOld = y;

            }
        }
    };


    public DrawCube() throws HeadlessException {
        setLayout(new BorderLayout());

        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = new Cube();
        }

        jPanel.setPreferredSize(new Dimension(600, 400));
        jButton.addActionListener(new AL());

        JLabel jLabel = new JLabel("Cube Game");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(jLabel, BorderLayout.NORTH);
        add(jPanel);

//        JPanel jpRed = new JPanel();
//        jpRed.add(new JLabel("Y:"));
//        jpRed.add(jsMoveY);
//        jpRed.add(jtMoveY);
//        add(jpRed, BorderLayout.EAST);


        JPanel jpMove = new JPanel(new GridLayout(2, 6));
//первая строка
        for (int i = 0; i < jtMoves.length - 1; i++) {
            jtMoves[i] = new JTextField("Cube" + i + ": ");
            jtMoves[i].setEditable(false);
            jpMove.add(jtMoves[i]);
        }
        jtMoves[5] = new JTextField("Sum:  0");
        jtMoves[5].setEditable(false);
        jpMove.add(jtMoves[5]);
// вторая строка
        jpMove.add(new JPanel()); // пропуск
        jpMove.add(new JPanel()); // пропуск
        jpMove.add(jButton); // кнопка по центру
        jpMove.add(new JPanel()); // пропуск
        jpMove.add(new JPanel()); // пропуск
        add(jpMove, BorderLayout.SOUTH);
// перерисовка автоматом
//        initList();
    }


    public static void check() {
        SwingConsole.run(new DrawCube(), 700, 450);
    }

    public static void main(String[] args) {
        check();
    }

}
