package ch15.ex06.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nRandomList w Generic  Check\n");
        RandomList<String> rss = new RandomList<>();
        for (String s : "The duck brown fox jumped over lazy brown dog".split(" ")) {
            rss.add(s);
        }
        for (int i = 0; i < 11; i++) {
            System.out.print(rss.select()+" ");
        }
        System.out.println();
    }
}
