package ch11.ex32.local;

import lib.shapes.Shape;
import lib.utils.Range;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nAdapter  Check\n");
        ShapeGen shapes = new ShapeGen(5);

        System.out.print("ForEach Default Iterator: ");
        for (Shape shape : shapes) {
            System.out.printf("%-10s",shape);
        }
        System.out.println();
        System.out.print("ForEach Reverse Iterator: ");
        for (Shape shape : shapes.reversed()) {
            System.out.printf("%-10s",shape);
        }

        System.out.println("ArrayList Custom Reversed Iterator");
        ArrayListGen<Integer> list = new ArrayListGen<>(Range.arrayList(5)); //
        System.out.print("ArrayList Default  Iterator:");
        System.out.print("[");
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println("]");
        System.out.print("ArrayList Reversed Iterator:");
        System.out.print("[");
        for (Integer integer : list.rev()) {
            System.out.print(integer+" ");
        }
        System.out.println("]");

        System.out.print("ArrayList Shuffle  Iterator:");
        System.out.print("[");
        for (Integer integer : list.rand()) {
            System.out.print(integer+" ");
        }
        System.out.println("]");




    }
}
