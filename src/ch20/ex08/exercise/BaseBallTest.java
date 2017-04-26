package ch20.ex08.exercise;

import lib.units.atunit.Test;
import lib.units.atunit.TestObjectCreate;

import java.util.Random;

/**
 * Vadim Voronov
 * Created: 26-Apr-17.
 * email: vadim.v.voronov@gmail.com
 */
public class BaseBallTest extends BaseBall<String> {
private static String[] t = "These are the words that written there on the wall".split(" ");
private static Random rnd = new Random();

    public BaseBallTest(String val1, String val2) {
        super(val1, val2);
    }

    @TestObjectCreate
    public static BaseBallTest create() {
        return new BaseBallTest(t[rnd.nextInt(t.length)],t[rnd.nextInt(t.length)]);
    }

    @Test
    boolean _put() {

        System.out.print("   :"+pop1()+" "+pop2());
        put1("one");
        put2("two");
        System.out.print(" >"+pop1()+" "+pop2());

        return (pop1()+pop2()).equals("onetwo");
    }

    @Test
    boolean _pop() {
        String s1 = pop1();
        System.out.print("   :"+pop1()+" "+pop2());
        for (String s : t) {
            if (s1.equals(s)) {
                return true;
            }
        }
        return false;
    }




}
