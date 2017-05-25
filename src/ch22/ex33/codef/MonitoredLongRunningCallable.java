package ch22.ex33.codef;

import ch22.ex33.codee.TaskManager;
import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Vadim Voronov
 * Created: 24-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class MonitoredLongRunningCallable extends JFrame {
    private JButton jButton = new JButton("Start Long Running Task");
    private JButton jButton2 = new JButton("End Long Running Task");
    private JButton jButton3 = new JButton("Get results");

    private TaskManager<String, MonitoredCallable> manager = new TaskManager<>(); // используется Callable<String>

    public MonitoredLongRunningCallable() {
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MonitoredCallable task = new MonitoredCallable(
                        new ProgressMonitor(
                                MonitoredLongRunningCallable.this,
                                "Long Running Task", "", 0, 0)
                );
                manager.add(task); // и тут же запустили
                System.out.println(task + " added to the queue");
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String result : manager.purge()) {  // отрубить все незавершенные задачи и вернуть список
                    System.out.println(result);
                }
            }
        });
        jButton3.addActionListener(new ActionListener() {  // собираем честные результаты
            @Override
            public void actionPerformed(ActionEvent e) {
                for (String result : manager.getResults()) {  // найти завершенные задачи и вернуть список
                    System.out.println(result);
                }
            }
        });

        setLayout(new FlowLayout());
        add(jButton);
        add(jButton2);
        add(jButton3);
    }

    public static void check() {
        SwingConsole.run(new MonitoredLongRunningCallable(), 200, 500);
    }

}
