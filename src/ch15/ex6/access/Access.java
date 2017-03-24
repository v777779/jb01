package ch.ex6.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 6 Random List Check\n");
//Integer
        System.out.println("Integer RandomList:");
        RandomList<Integer> rsi = new RandomList<>();
        for (int i = 0; i < 10; i++) {
            rsi.add(i);
        }
        for (int i = 0; i < 10 ; i++) {
            System.out.print(rsi.select()+" ");
        }
        System.out.println();
//Character
        System.out.println("\nCharacter RandomList:");
        RandomList<Character> rsc = new RandomList<>();
        for (char c :"RandomList<Character> rsc = new RandomList<>()".toCharArray()) {
            rsc.add(c); // автоупаковка
        }
        for (int i = 0; i < 25 ; i++) {
            System.out.print(rsc.select()+" ");
        }
        System.out.println();



    }
}
