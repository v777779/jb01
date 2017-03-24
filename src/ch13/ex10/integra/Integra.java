package ch13.ex10.integra;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nCharSequence Check\n");
        CharSeq cs = new CharSeq("char sequence string data");

        System.out.println("CharSequence :"+cs+" charAt(15):"+cs.charAt(15)+
                " subseq(5,10):"+cs.subSequence(5,10)+" length():"+cs.length());

    }
}
