package ch18.ex22.exercise;

import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 22 Process Control Check\n");

        List<String> errList = OSExecA.command("javap -sysinfo ./out/production/jb01/ch18.ex22.Ex22");
        System.out.println("\nProcess Errors List:");
        for (String s : errList) {
            System.out.println(s);
        }

    }
}
