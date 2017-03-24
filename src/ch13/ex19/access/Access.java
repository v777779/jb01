package ch13.ex19.access;

import ch13.ex04.local.Receipt;
import lib.utils.TextFile;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 18-Feb-17.
 */
class T1 extends Receipt {  // comments

}
class T2 extends Access.Internal.Enclosed implements Comparable {  //comments
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

public class Access {
    static class Internal {
        private int value;
        private String name;

        public Internal() {
            this.value = value;
            this.name = name;
        }

        static class Enclosed {
            public Enclosed() {
            }

            static class Embossed {
                public Embossed() {
                }
            }

        }
    }

    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 19 RegEx Check\n");

        String sClass = "[$A-Za-z_][$A-Za-z0-9]*";              // имя класса Abbb a999
        String sInter = sClass +"(\\."+sClass+")*";             // повторяется группа abbb .abbb .bccc
        String regex = "class\\s"+sClass+"|"+                   // class    Abbb
                        "extends\\s"+sInter+"|"+                // extends  Abbb.Bccc.Cddd
                        "new\\s"+sInter;                        // new      Abbb.Bccc.Cddd

        String fName = "src/ch13.ex19/access/Access.java";        // первое условие  чтение в файл
        String s = TextFile.read(fName);

       Internal.Enclosed internal = new Internal.Enclosed();
       Internal.Enclosed.Embossed embossed = new Internal.Enclosed.Embossed();

        Iterator<String> it = new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }
        };

        String regex2 = sInter;
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group().replaceFirst("new\\s|class\\s|extends\\s",""));
        }


    }
}
