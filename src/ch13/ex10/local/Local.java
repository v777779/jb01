package ch13.ex10.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nRegEx Check\n");
        String s = "Rudolph";
        String regex;
        regex = "Rudolph";
        System.out.printf("s:%s regex: %-25s match:%b\n",s,regex,s.matches(regex));
        regex = "[rR]udolph";
        System.out.printf("s:%s regex: %-25s match:%b\n",s,regex,s.matches(regex));
        regex = "(?i)[r][aeiou][a-z]ol.*";
        System.out.printf("s:%s regex: %-25s match:%b\n",s,regex,s.matches(regex));
        regex = "R.*";
        System.out.printf("s:%s regex: %-25s match:%b\n",s,regex,s.matches(regex));




    }
}
