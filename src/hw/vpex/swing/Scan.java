package hw.vpex.swing;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class Scan {

    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        final int j = 0;
        final int m[][] = new int[4][2];
        final JFrame forma = new JFrame("Форма 1");
        forma.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        forma.setSize(new Dimension(300, 300));

        JButton batton1 = new JButton("Кнопка");
        batton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                forma.setState(JFrame.ICONIFIED);


                Timer timer = new Timer(50, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JButton b2 = new JButton("Обновить");
                        final JFrame forma2 = new JFrame("Форма2");
                        forma2.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                        forma2.setSize(new Dimension(150, 150));
                        forma2.addComponentListener(new TransparentComponentListener());
//                        Start app = new Start(forma2);
//                        app.setLayout(new BorderLayout());
//                        app.setVisible(true);
                        b2.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                forma.setState(JFrame.NORMAL);

                            }
                        });
                        b2.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                forma2.dispose();
                            }
                        });
//                        app.add(b2, "North");
//                        forma2.getContentPane().add("Center", app);
//                        forma2.pack();
                        forma2.setExtendedState(JFrame.MAXIMIZED_BOTH);
                        forma2.show();

//                        app.addMouseListener(new MouseListener() {
//                            @Override
//                            public void mouseClicked(MouseEvent e) {
//
//                                if (count < 3) {
//                                    int x = e.getX();
//                                    int y = e.getY();
//                                    m[i][j] = x;
//                                    m[i][j + 1] = y;
//                                    System.out.println("x = " + m[i][j]);
//                                    System.out.println("y = " + m[i][j + 1]);
//                                    i++;    //здесь выдает ошибку
//                                    count++;//ошибка тоже
//
//
//                                }
//                            }
//
//                            @Override
//                            public void mousePressed(MouseEvent e) {
//
//                            }
//
//                            @Override
//                            public void mouseReleased(MouseEvent e) {
//
//                            }
//
//                            @Override
//                            public void mouseEntered(MouseEvent e) {
//
//                            }
//
//                            @Override
//                            public void mouseExited(MouseEvent e) {
//
//                            }
//                        });
                        forma2.addWindowListener(new WindowAdapter() {
                            @Override
                            public void windowClosed(WindowEvent e) {
                                super.windowClosed(e);
                                forma.setState(Frame.NORMAL);
                            }
                        });
                        forma2.setLocationRelativeTo(null);
                        forma2.setVisible(true);
                    }
                });
                timer.setRepeats(false);
                timer.start();
            }
        });

        JPanel panel = new JPanel();
        panel.add(batton1);
        forma.getContentPane().add(panel);
        forma.setLocationRelativeTo(null);
        forma.setVisible(true);
    }

}
