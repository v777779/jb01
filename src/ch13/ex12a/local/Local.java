package ch13.ex12a.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMatcher start() end()  Check\n");
        StartEnd st = new StartEnd();

        for (String s : st.getInputArray()) {
            System.out.println("s:"+s);
            for (String r : st.getRegexArray()) {
                st.examine(s,r);
            }
        }

    }
}
