package ch18.ex06.access;

import lib.files.IStrategy;
import lib.files.ProcessFiles;

import java.io.File;
import java.util.Calendar;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static long getDate(String s) {
        String[] dates = s.split("[: .]");
        int[] ints = new int[5];
        if (dates == null || dates.length < 5) {
            System.out.println("Usage:  Data < HH:MM  DD:MM:YYYY");
            return 0;
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.valueOf(dates[i]);
            if (ints[i] < 0) {
                System.out.println("Usage:  Data < HH:MM  DD:MM:YYYY");
                return 0;
            }
        }
        if (ints[0] > 24 || ints[1] > 59 || ints[2] > 31 || ints[3] > 12 || ints[4] < 1971) {
            System.out.println("Usage:  Data < HH:MM  DD:MM:YYYY");
            return 0;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(ints[4], ints[3] - 1, ints[2], ints[0], ints[1], 0);
        return calendar.getTimeInMillis();
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 6 Search files for date time Check\n");


        System.out.println("\nShort version:");
        String[] args = {"10:05 05.04.2017"};
         new ProcessFiles(new IStrategy() {   // анонимный внутренний класс обработчика файлов
            final long timeChange = getDate(args[0]);
            @Override
            public void process(File file) {
                if (file.lastModified() > timeChange) {
                    Calendar c = Calendar.getInstance();
                    c.setTimeInMillis(file.lastModified());
                    System.out.printf("%-75s : %s\n", file, c.getTime());
                }
            }
        }, "java").start(new String[]{"./src"});    // внутри же метода массив каталогов

    }
}
