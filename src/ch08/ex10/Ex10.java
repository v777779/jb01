package ch08.ex10;

/**
 * Created by V1 on 09-Feb-17.
 */
public class Ex10 {
    public static void main(String[] args) {
        Mouse mouse = new FieldMouse();
        Mouse mouse1 = new HouseMouse();
        Mouse mouse2 = new Hamster();

        System.out.println("\nExercise 10 \n");

        mouse.wakeup();
        mouse1.wakeup();
        mouse2.wakeup();
    }
}
