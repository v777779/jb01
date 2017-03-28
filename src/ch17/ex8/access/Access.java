package ch17.ex8.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 8 List Check\n");

        SList<Integer> sl = new SList<>();  // первый элемент автоматом
        System.out.println(sl);
        ISListIterator<Integer> lit = sl.iterator();
        for (int i = 0; i < 15; i++) {
            lit.add(i+1);
        }
        System.out.println(sl);

        lit.remove(); // удалить последний элемент
        System.out.println(sl);
        lit.remove(12);
        lit.remove(5);
        System.out.println(sl);
        lit.remove();
        lit.remove();
        System.out.println(sl);
        lit.removeAll();

        System.out.println(sl);




    }
}
