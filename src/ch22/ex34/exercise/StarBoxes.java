package ch22.ex34.exercise;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vadim Voronov
 * Created: 25-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class StarBoxes extends JFrame {
    private int grid = 12;
    private int pause = 50; //ms
    private static ExecutorService exec = Executors.newCachedThreadPool(); // параллельное выполнение
    private static Random rnd = new Random();

    public StarBoxes() {
        setLayout(new GridLayout(grid, grid));              // 12x12
        for (int i = 0; i < grid * grid; i++) {             // 144 окошка для панелей
            if (rnd.nextBoolean()) {
                CStar cStar = new CStar(250, 5); // звездочка
                add(cStar);
                exec.execute(cStar);                        // запустили фоновый поток панели
            } else {
                JPanel jPanel = new JPanel();// пустая панель
                add(jPanel);
            }
        }

    }


    public static void check() {
        SwingConsole.run(new StarBoxes(), 500, 400);
    }

}
