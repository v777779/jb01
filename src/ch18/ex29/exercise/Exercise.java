package ch18.ex29.exercise;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 16-Apr-17.
 */
public class Exercise {
    public static void app() {
        System.out.println("\n====EXERCISE===");
        System.out.println("\nExercise 29 Externalizable Check\n");
        Blips.check();
        System.out.println("\nMethod writeExternal() saves data with expressions:");
        System.out.println("out.writeObject(s)");
        System.out.println("out.writeInt(i)");

        System.out.println("\nMethod readExternal() recoveres data with expressions:");
        System.out.println("s = (String) in.readObject()");
        System.out.println("i = in.readInt()");


    }
}
