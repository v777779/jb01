package ch22.ex26.exercise.sinewave;

import lib.swing.SwingConsole;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class SineWaveMul extends JFrame {

    public SineWaveMul(int count) {
        Random rnd = new Random();
        setLayout(new GridLayout(count + 1, 1)); // число панелей
        JLabel jLabel = new JLabel("Oscilloscope Diagrams:");
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(jLabel);
        for (int i = 0; i < count; i++) {
            add(new SineWaveRun(rnd.nextInt(20) + 1, rnd.nextInt(100) + 10));
        }
    }

    public static void check(String[] args) {
        int count = 5;
        if (args.length > 0) {
            Scanner in = new Scanner(args[0]);
            if (in.hasNextInt()) {
                count = in.nextInt();
            }
        }
        SwingConsole.run(new SineWaveMul(count), 700, 400);
    }

    public static void main(String[] args) {
        check(args);
    }
}
