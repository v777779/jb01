package ch11.ex23.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nMap  Check\n");
        Stat st = new Stat();
        st.showMap();  // Map готово



        for (int i = 0; i < 10; i++) {
            int value;
            st.fillMap();
            int key = st.getMaxKey();
            System.out.printf("Number: %2d  Freq: %5d \n",key,st.getVal(key));
        }
    }
}
