package ch13.ex12.include;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Include {
    public static void app() {
        System.out.println("\n====INCLUDE===");
        System.out.println("\nGroups Check\n");
        String regex = ".*?abc(bcd)(def)(bc(d).*(data))";//def";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher("Start text abc abcbcddefbcdeeebefbcddata");
        System.out.println("regex :"+regex);
        System.out.println("groups:"+m.groupCount());
        boolean flag = m.find();                    // одиночная операция поиска
        System.out.println("match:"+flag);
        for (int i = 0; i < 6 ; i++) {              // целая куча найденных групп
            try {
                System.out.println("group:" + m.group(i) + " " + m.start(i) + " " + m.end(i));
            } catch (Exception e) {
            }
        }

    }
}
