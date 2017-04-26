package ch20.ex08.codeb;

import lib.units.atunit.Test;
import lib.units.atunit.TestObjectCreate;
import lib.units.atunit.TestProperty;

import java.util.*;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class AtUnitExample4 {
    //static
    public static String theory = "All brontosauruses " +
            "are thin at one end, much MUCH thicker in the " +
            "middle, and then thin again at the far end.";

    //object
    private String word;
    private Random rnd = new Random();


    public AtUnitExample4(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public String scrambledWord() {
        List<Character> chars = new ArrayList<>();
        for (char c : word.toCharArray()) {
            chars.add(c);
        }
        Collections.shuffle(chars, rnd); // перемешали в списке все символы
        StringBuilder sb = new StringBuilder();
        for (Character aChar : chars) {
            sb.append(aChar);
        }
        return sb.toString();
    }

    // статические поля равные для всех экземпляров класса
    @TestProperty
    public static List<String> input = Arrays.asList(theory.split(" ")); // разбить на слова

    @TestProperty
    public static Iterator<String> words = input.iterator();

    @TestObjectCreate
    public static AtUnitExample4 createForTest() {  // проверка другого имени
        if (words.hasNext()) {
            return new AtUnitExample4(words.next());
        } else {
            return null;
        }
    }

    @Test
    boolean words() {
        System.out.print("'" + getWord() + "'");
        return getWord().equals("All");      // отработает только на слово "are"
    }

    @Test
    public boolean scramble1() {
        rnd = new Random(15); // фиксированное seed
        System.out.print("'" + getWord() + "' ");
        String scrambled = scrambledWord();
        System.out.println(scrambled);
        if (getWord().equals("are")) {
            return scrambled.equals("era");
        } else {
            return scrambled.equals("tnssbourrosuea");
        }
    }

    @Test
    public boolean scramble2() {
        rnd = new Random(125); // фиксированное seed
        System.out.print("'" + getWord() + "' ");
        String scrambled = scrambledWord();
        System.out.println(scrambled);
        if (getWord().equals("are")) {
            return scrambled.equals("era");
        } else {
            return scrambled.equals("rsouasrotnsube");
        }
    }
}
