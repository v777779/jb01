package ch.ex34.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 34 Check\n");

        ClassSB s1 = new ClassSB();
        ClassSB s2 = new ClassSB();
        ClassSB s3 =  null;
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        s3 = s1.getChange(s2);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);




    }
}
