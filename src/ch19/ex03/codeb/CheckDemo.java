package ch19.ex03.codeb;

import lib.utils.Range;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 18-Apr-17.
 */
public class CheckDemo {
    public static void check() {

        System.out.println("\nSet CheckEnum Values:");
        for (CheckEnum checkEnum : CheckEnum.values()) {
            checkEnum.setValue(Range.getInt(100));
        }

        System.out.println("\nCheckEnum Values:");
        for (CheckEnum checkEnum : CheckEnum.values()) {
            System.out.println(checkEnum.name()+" "+checkEnum.getValue());
        }

        System.out.println("\nCheckEnum Values:");
        for (CheckEnum checkEnum : CheckEnum.values()) {
            System.out.println(checkEnum.name()+" "+checkEnum.getValue());
        }

    }
}
