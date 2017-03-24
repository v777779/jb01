package ch.ex20;

import ch.ex20.access.IDestination;
import ch.ex20.access.MailOffice;
import ch.ex20.access.PostOffice;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ex20 {
    public static void main(String[] args) {
        System.out.println("\nExercise 20 Nested Class Check\n");
        IDestination d = PostOffice.getClassDest("YellowStone");
        System.out.println(d);
        System.out.println(d.getEntry());
        PostOffice.getClassEntry().g();

        System.out.println("\nExercise 20 Internal Class Check\n");
        IDestination md = new MailOffice().getClassDest("OrangeApple");
        System.out.println(md);
        System.out.println(md.getEntry());

    }
}
