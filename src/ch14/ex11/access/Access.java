package ch14.ex11.access;

import ch14.ex11.access.recount.Recount;
import ch14.ex11.access.thrown.Thrown;
import ch14.ex11.access.unit.Unit;
import ch14.ex11.access.value.Value;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 11 Class Check\n");
        try {
            Recount.app();
            Thrown.app();
            Unit.app();
            Value.app();
        } catch (Exception e) {
            System.out.println("catch:"+e.getMessage());
        }

    }
}
