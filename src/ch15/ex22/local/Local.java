package ch.ex22.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nGeneric newInstance Check\n");

        System.out.println("Emplyee:");
        ClassFactory<Employee> classFactoryE = new ClassFactory<>(Employee.class);
        System.out.println("ClassFactory<Ball> : succeded");

        System.out.println("Integer:");
        try {
            ClassFactory<Integer> classFactoryI = new ClassFactory<>(Integer.class);
            System.out.println("ClassFactory<Integer> : succeded");

        } catch (Exception e) {
            System.out.println("ClassFactory<Integer> : failed");

        }



    }
}
