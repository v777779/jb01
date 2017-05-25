package ch22.ex33.coded;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class InterruptableLongRunningTask extends JFrame {
    private JButton jButton = new JButton("Start Long Running Task");
    private JButton jButton2 = new JButton("End Long Running Task");
    ExecutorService exec = Executors.newSingleThreadExecutor(); // один поток

    public InterruptableLongRunningTask() {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                if (exec.isShutdown()) {
//                    System.out.println("ExecutorService is shutdown");
//                    return;
//                }
                Task task = new Task();
                exec.execute(task);
                System.out.println(task+" added to the queue");
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {  // запуск прерывания
                exec.shutdownNow(); // вырубить все задачи

            }
        });
        setLayout(new FlowLayout());
        add(jButton);
        add(jButton2);
    }

    public static void check() {
        SwingConsole.run(new InterruptableLongRunningTask(), 200, 150);
    }

}
