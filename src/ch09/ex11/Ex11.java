package ch.ex11;

import ch.ex11.dtext.*;
import ch.ex11.dfilter.*;
import ch.ex11.filter.*;
import ch.ex11.text.*;

import java.util.Arrays;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Ex11 {
    public static void main(String[] args) {
        System.out.println("\nInheritance Class Text Filter Check\n");

        Processor[] p = new Processor[]{
                new UpCase(),
                new DownCase(),
                new Splitter(),
                new LowPass(100),
                new HighPass(1000),
                new BandPass(100, 1000)
        };

        Apply.pProc(p);  // static parameter
        System.out.println(Arrays.toString(p));

        System.out.println("\nInheritance Interface DText DFilter Check\n");
        IProcessor[] ip = new IProcessor[]{
                new DUpCase(),
                new DDownCase(),
                new DSplitter(),
                new DLowPass(100),
                new DHighPass(1000),
                new DBandPass(100, 1000)
        };

        Apply.pProc(ip);  // static parameter
        System.out.println(Arrays.toString(ip));

        System.out.println("\nExercise 11 Interface Check\n");
                IProcessor p2 = new DMixText();
                Apply.pProc(p2);
        System.out.println(p2);

    }
}
