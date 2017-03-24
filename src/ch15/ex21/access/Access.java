package ch.ex21.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 21 Erasure Compansation Check\n");

        ClassCapture<Building> ctt = new ClassCapture<>(Building.class);
        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("Room", Room.class);

        Building room       = ctt.createNew("Room");
        Building house      = ctt.createNew("House");
        Building building   = ctt.createNew("Building");

        System.out.println(room.getClass().getSimpleName());
        System.out.println(house.getClass().getSimpleName());
        System.out.println(building.getClass().getSimpleName());

    }
}
