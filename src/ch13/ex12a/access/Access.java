package ch13.ex12a.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 12a Matcher start() stop() matches() lookingAt() Check\n");
        StartEnd st = new StartEnd();

        for (String s : st.getInputArray()) {
            System.out.println("message:"+s);
            for (String r : st.getRegexArray()) {
                st.examine(s,r);
            }
        }

    }
}
