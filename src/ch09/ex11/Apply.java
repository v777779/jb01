package ch.ex11;

import ch.ex11.dtext.IProcessor;
import ch.ex11.text.Processor;

/**
 * Created by V1 on 13-Feb-17.
 */
public class Apply {

    public static void pProc(Processor pItem) {
            System.out.print(pItem.name() + " > ");
            System.out.println(pItem.process(pItem.getData()));
    }
    public static void pProc(Processor[] p) {
        for (Processor pItem : p) {
            System.out.print(pItem.name() + " > ");
            System.out.println(pItem.process(pItem.getData()));
        }
    }

    public static void pProc(IProcessor pItem) {
            System.out.print(pItem.name() + " > ");
            System.out.println(pItem.process(pItem.getData()));
    }

    public static void pProc(IProcessor[] p) {
        for (IProcessor pItem : p) {
            System.out.print(pItem.name() + " > ");
            System.out.println(pItem.process(pItem.getData()));
        }
    }


}
