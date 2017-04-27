package ch20.ex11.exercise;

import lib.units.atunit.TestNote;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Vadim Voronov
 * Created: 27-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class Proc {
    public static void checkNote(Class<?> className) {
        TestNote tNote = className.getAnnotation(TestNote.class);
        System.out.println("\nClass:");
        if (tNote != null) {
            System.out.printf("%-19s %-40s \n", className.getSimpleName(), tNote.value());
        } else {
            System.out.printf("%-25s\n", className.getSimpleName());
        }


        System.out.println("Fields:");
        for (Field f : className.getDeclaredFields()) {

            TestNote tNoteField = f.getAnnotation(TestNote.class);
            if (tNoteField != null) {
                System.out.printf("%-25s %-40s \n", f.getName(), tNoteField.value());
            }
        }
        System.out.println("Methods:");
        for (Method m : className.getDeclaredMethods()) {

            TestNote tNoteField = m.getAnnotation(TestNote.class);
            if (tNoteField != null) {
                System.out.printf("%-25s %-40s \n", m.getName(), tNoteField.value());
            }
        }
        className = className.getSuperclass();
        if (className.getSimpleName().equals("Object")) {
            return;
        }
        checkNote(className);  // рекурсивный вызов

    }

    public static void check(String cName) {

        try {
            Class<?> className = Class.forName(cName);
            checkNote(className);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void classCheck(Class<?> className) {
        TestNote tNote = className.getAnnotation(TestNote.class);
        if (tNote != null) {
            System.out.printf("  .%-12s : %-40s \n", className.getSimpleName(), tNote.value());
        } else {
            System.out.printf("  .%-12s\n", className.getSimpleName());
        }
    }
    public static void fieldCheck(Class<?> className) {
        for (Field f : className.getDeclaredFields()) {
            TestNote tNoteField = f.getAnnotation(TestNote.class);
            if (tNoteField != null) {
                System.out.printf("  .%-12s :%s \n", f.getName(), tNoteField.value());
            }
        }
    }

}
