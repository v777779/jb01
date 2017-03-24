package ch14.ex24.local;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nINull Objects Check\n");
        //     TestInfo.printInfo();
        Staff staff = new Staff("President", "CTO", "Marketing Manager",
                "Product Manager", "Project Lead", "Software Engineer",
                "Software Engineer", "Software Engineer", "Software Engineer",
                "Test Engineer", "Technical Writer"
        );

        staff.fillPosition("President", new Person("Me", "Last","The Top, Lonely At"));
        staff.fillPosition("Project Lead", new Person("Janet", "Planner","Burbs"));
        if (staff.isPosAvailable("Software Engineer")) {
            staff.fillPosition("Software Engineer",
                    new Person("Bob", "Coder","Bright Light City"));
        }
        //System.out.println(staff); // ArrayList standard toString <Position>
        for (Position position : staff) {
            System.out.println(position);
        }


    }
}
