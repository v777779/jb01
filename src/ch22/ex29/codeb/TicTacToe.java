package ch22.ex29.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Vadim Voronov
 * Created: 23-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class TicTacToe extends JFrame {
    private JTextField rows = new JTextField("3");
    private JTextField cols = new JTextField("3");

    private enum State {BLANK, XX, OO}

    private class ToeDialog extends JDialog {
        private State turn = State.XX; // состояние

        private class ToeButton extends JPanel {
            private State state = State.BLANK;

            private class ML extends MouseAdapter {
                @Override
                public void mousePressed(MouseEvent e) {
                    if (state == State.BLANK) {
                        state = turn;
                        turn = (turn == State.XX ? State.OO : State.XX);
                    } else {
                        state = (state == State.XX ? State.OO : State.XX);
                    }
                    repaint();
                }
            }

            public ToeButton() {
                addMouseListener(new ML());
            }

            @Override
            protected void paintComponent(Graphics g) {  // рисует состояние кнопки
                super.paintComponent(g);
                int x1 = 0;
                int y1 = 0;
                int x2 = getSize().width -1;
                int y2 = getSize().height -1;
                g.drawRect(x1,y1,x2,y2);

                x1 = x2/4;
                y1 = y2/4;
                int wide = x2/2;
                int high = y2/2;
                if (state == State.XX) {
                    g.drawLine(x1,y1,x1+wide,y1+high); // X  все верно тут координаты начала и конца
                    g.drawLine(x1,y1+high,x1+wide,y1);
                }
                if (state == State.OO) {
                    g.drawOval(x1, y1, x1 + wide / 2, y1 + high / 2); // X  а здесь диаметр 1/2 от угла 1/4
                }
            }
        }

        public ToeDialog(int cellsWidth, int cellsHeight) {
            setTitle("The game itself");
            setLayout(new GridLayout(cellsWidth, cellsHeight));
            for (int i = 0; i < cellsWidth * cellsHeight; i++) {  // добавил кучу кнопок
                add(new ToeButton());  // кнопки на самом деле JPanel
            }
            setSize(cellsWidth*50,cellsHeight*50);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        }
    }
    class BL implements ActionListener {  // включить JDialog
        @Override
        public void actionPerformed(ActionEvent e) {  // каждый раз создается новый JDialog
            JDialog jDialog = new ToeDialog(new Integer(rows.getText()), new Integer(cols.getText()));
            jDialog.setVisible(true);
        }
    }

    public TicTacToe() throws HeadlessException {
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,2));
        jPanel.add(new Label("Rows",JLabel.CENTER));
        jPanel.add(rows);
        jPanel.add(new Label("Columns",JLabel.CENTER));
        jPanel.add(cols);
        add(jPanel,BorderLayout.NORTH);
        JButton jButton = new JButton("go");
        jButton.addActionListener(new BL());
        add(jButton,BorderLayout.SOUTH);
    }

    public static void check() {
        SwingConsole.run(new TicTacToe(), 200, 200);
    }


}
