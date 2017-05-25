package ch22.ex34.codeb;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class ColorBoxes extends JFrame {
    private int grid = 12;
    private int pause = 50; //ms
    private static ExecutorService exec = Executors.newCachedThreadPool(); // параллельное выполнение

    public ColorBoxes() {
        setLayout(new GridLayout(grid, grid)); // 12x12
        for (int i = 0; i < grid * grid; i++) {  // 144 окошка для панелей
            CBox cBox = new CBox(pause);
            add(cBox);
            exec.execute(cBox); // запустили фоновый поток панели
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                exec.shutdownNow(); // закрыть все потоки
                while (!exec.isTerminated()) {  // waiting
                 }

                super.windowClosing(e);

            }
        });

    }


    public static void check() {
        SwingConsole.run(new ColorBoxes(), 500, 400);
    }

}
