package hw.vpex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;


@SuppressWarnings("serial")
public class Gomoku extends JPanel
        implements ActionListener, MouseListener {
    private enum Pieces {
        WHITE,
        BLACK,
        NOT_USED;
    }

    private final static int ROWS = 10;
    private final static int COLUMNS = 10;
    private final static int SIDE = 32;
    private boolean isBlack;
    private Graphics2D g2d;
    private Pieces[][] pieces;
    private static JFrame frame;
    private static JMenuBar menuBar;

    public Gomoku() {
        isBlack = true;
        pieces = new Pieces[COLUMNS - 1][ROWS - 1];
        frame = new JFrame();
        menuBar = new JMenuBar();
        JMenu menu = new JMenu("Game");
        JMenuItem resetAction = new JMenuItem("Reset");
        JMenuItem exitAction = new JMenuItem("Exit");
        resetAction.addActionListener(this);
        exitAction.addActionListener(this);
        menu.add(resetAction);
        menu.add(exitAction);
        menuBar.add(menu);

        resetBoard();
        setPreferredSize(new Dimension(COLUMNS * SIDE, ROWS * SIDE));
        addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g2d = (Graphics2D) g;
        drawBoard(g2d);
        drawPieces(g2d);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Reset")) {
            resetBoard();
            this.repaint();
        } else
            frame.dispose();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        updateBoard(e.getX(), e.getY());
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    private void drawBoard(Graphics2D g) {
        g.drawLine(0, 0, COLUMNS * SIDE, 0);
        g.drawLine(0, ROWS * SIDE, COLUMNS * SIDE, ROWS * SIDE);
        g.drawLine(0, 0, 0, ROWS * SIDE);
        g.drawLine(COLUMNS * SIDE, 0 * SIDE, COLUMNS * SIDE, ROWS * SIDE);
        for (int i = 1; i < ROWS; i++) {
            g.drawLine(0, SIDE * i, SIDE / 2, SIDE * i);
            g.drawLine(COLUMNS * SIDE - (SIDE / 2), SIDE * i,
                    COLUMNS * SIDE, SIDE * i);
        }
        for (int j = 1; j < COLUMNS; j++) {
            g.drawLine(SIDE * j, 0, SIDE * j, SIDE / 2);
            g.drawLine(SIDE * j, SIDE * ROWS - (SIDE / 2),
                    j * SIDE, ROWS * SIDE);
        }
        for (int i = 0; i < COLUMNS - 1; i++) {
            for (int j = 0; j < ROWS - 1; j++) {
                if (pieces[i][j] == Pieces.NOT_USED) {
                    g.drawLine((SIDE / 2) + (i * SIDE),
                            (j + 1) * SIDE,
                            ((SIDE / 2) + ((i + 1) * SIDE)),
                            (j + 1) * SIDE);
                    g.drawLine((i + 1) * SIDE,
                            (SIDE / 2) + (j * SIDE),
                            (i + 1) * SIDE,
                            (SIDE / 2) + ((j + 1) * SIDE));
                }
            }
        }
    }

    private void drawPieces(Graphics2D g) {
        for (int i = 0; i < COLUMNS - 1; i++) {
            for (int j = 0; j < ROWS - 1; j++) {
                if (pieces[i][j] != Pieces.NOT_USED) {
                    int x = i * SIDE;
                    int y = j * SIDE;
                    if (pieces[i][j] == Pieces.BLACK) {
                        g.fillOval(x + (SIDE / 2), y + (SIDE / 2), SIDE, SIDE);
                    }
                    if (pieces[i][j] == Pieces.WHITE) {
                        g.drawOval(x + (SIDE / 2), y + (SIDE / 2), SIDE, SIDE);
                    }
                }
            }
        }
    }

    private void nextMove() {
        Random rnd = new Random();
        int x;
        int y;
        int centreX = 0;
        int centreY = 0;

        for (int i = 0; i < 100; i++) {  // trying to set chess
            x = rnd.nextInt(280) + 20;
            y = rnd.nextInt(280) + 20;

            if (x % SIDE <= SIDE / 2) {
                centreX = x / SIDE - 1;
            } else {
                centreX = x / SIDE;
            }
            if (y % SIDE <= SIDE / 2) {
                centreY = y / SIDE - 1;
            } else {
                centreY = y / SIDE;
            }
            try {
                if (pieces[centreX][centreY] != Pieces.NOT_USED) {  // занято
                    continue;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                continue;
            }

            updateBoard(x, y);  // successful return;
            return;
        }

        JOptionPane.showMessageDialog(null,
                "You Win!");
    }

    private void updateBoard(int x, int y) {
        int centreX, centreY;
        if (x % SIDE <= SIDE / 2) {
            centreX = x / SIDE - 1;
        } else {
            centreX = x / SIDE;
        }
        if (y % SIDE <= SIDE / 2) {
            centreY = y / SIDE - 1;
        } else {
            centreY = y / SIDE;
        }
        if (centreX < 0 || centreY < 0 || centreX > (COLUMNS - 2)
                || centreY > (ROWS - 2)) {
            JOptionPane.showMessageDialog(null,
                    "You cannot place a piece here.");
        } else {
            if (pieces[centreX][centreY] != Pieces.NOT_USED) {
                JOptionPane.showMessageDialog(null,
                        "You cannot place a piece above another one.");
            } else {
                pieces[centreX][centreY] =
                        (isBlack) ? Pieces.BLACK : Pieces.WHITE;
                isBlack = !isBlack;
                this.repaint();
//
                if (!isBlack) {
                    nextMove();
                }
            }
        }
    }

    private void resetBoard() {
        for (int i = 0; i < COLUMNS - 1; i++) {
            for (int j = 0; j < ROWS - 1; j++) {
                pieces[i][j] = Pieces.NOT_USED;
            }
        }
    }

    private static void createAndShowGUI() {
        JPanel panel = new Gomoku();

        frame.setTitle("Connect Five");
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

