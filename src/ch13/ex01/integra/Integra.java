package ch13.ex01.integra;

import lib.utils.Range;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Integra {
    public static void app() {
        System.out.println("\n====INTEGRA===");
        System.out.println("\nStringBuilder Cycle Check\n");
//        UsingStringBuilder u = new UsingStringBuilder();
//        System.out.println(u.toString());
        System.out.println("Very Preffered Way to Append String via StringBuilder");
        StringBuilder sb;
            sb = new StringBuilder("[");   // в цикле ЛУЧШИЙ СПОСОБ
            for (int i = 0; i < 25 ; i++) {
                sb.append(Range.getInt(10)); // добавляем стрку
                sb.append(", ");
            }
            sb.delete(sb.length()-2,sb.length()); // подрезаем строку
            sb.append("]");
        System.out.println(sb.toString());
        System.out.println("Bad Way to Append String via String \"+\"");

        String s = "[";  // в цикле САМЫЙ РАСТОЧИТЕЛЬНЫЙ И МЕДЛЕННЫЙ СПОСОБ
        for (int i = 0; i < 25; i++) {
            s += Range.getInt(10)+", ";
        }
            s = s.substring(0,s.length()-2);
            s += "]";
        System.out.println(s);

    }

}
