package ch22.ex33.codec;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class LongRunningTask extends JFrame{
    private JButton jButton = new JButton("Start Long Running Task");
    private JButton jButton2 = new JButton("End Long Running Task");


    public LongRunningTask() {

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    TimeUnit.MILLISECONDS.sleep(3000);

                } catch (InterruptedException ex) {
                    System.out.println("Task interrupted");
                    return;
                }
                System.out.println("Task completed");
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  // запуск прерывания
                Thread.currentThread().interrupt();
            }
        });
        setLayout(new FlowLayout());
        add(jButton);
        add(jButton2);
    }

    public static void check() {
        SwingConsole.run(new LongRunningTask(), 200, 150);
    }

}
