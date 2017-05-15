package ch22.ex02.exercise;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Vadim Voronov
 * Created: 15-May-17.
 * email: vadim.v.voronov@gmail.com
 */
public class HelloLabel extends JFrame {
    private static List<JLabel> labels;
    private static Random rnd = new Random();

    public HelloLabel() {
        super("Hello Dynamic Label ");
        labels = new CopyOnWriteArrayList<>();

        int nLabel = /*rnd.nextInt(10)*/ +10;
        for (int i = 0; i < nLabel; i++) {
            JLabel label = new JLabel("A label:" + i);
            add(label);  // to JFrame
            labels.add(label);
        }
        setLayout(new FlowLayout()); // метод плавающего окна
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // закрыть окно
        setSize(300, 300); // размер
        setVisible(true); // включить окно
    }

    private static class LabelText implements Runnable {
        private String[] strings = new String[]{
                "Hey! This is Different!",
                "It's not the same Color!",
                "Why do you think that dog is smiling?",
                "What the difference betwen these two balls?",
                "This park is so big!"
        };


        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {  // меняем 3 метки всегда
                JLabel label = labels.get(rnd.nextInt(labels.size()));
                String s = strings[rnd.nextInt(strings.length)];
                label.setText(s);
            }
        }
    }

    public static void check() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HelloLabel();
            }
        });

        int count = 10;

        try {
            while(count-- > 0) {
                SwingUtilities.invokeLater(new LabelText());
                TimeUnit.MILLISECONDS.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
