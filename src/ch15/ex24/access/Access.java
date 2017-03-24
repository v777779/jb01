package ch.ex24.access;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 24 Class Capture Check\n");

        System.out.println("ClassCapture:");
        ClassCapture<Building> ctt = new ClassCapture<>();
        ctt.addType("Building", new Building.Factory());
        ctt.addType("House", new House.Factory());
        ctt.addType("Room", new Room.Factory());

        Building room       = ctt.createNew("Room");
        Building house      = ctt.createNew("House");
        Building building   = ctt.createNew("Building");

        System.out.println(room.getClass().getSimpleName());
        System.out.println(house.getClass().getSimpleName());
        System.out.println(building.getClass().getSimpleName());

        System.out.println("FactoryCapture:");
        FactoryCapture ctt2 = new FactoryCapture();
        ctt2.addType("Building", new Building.Factory());
        ctt2.addType("House", new House.Factory());
        ctt2.addType("Room", new Room.Factory());

        Room  room1 = (Room)ctt2.createNew("Room");
        House house1 = (House)ctt2.createNew("House");
        Building  building1 = (Building)ctt2.createNew("Building");

        System.out.println(room1.getClass().getSimpleName());
        System.out.println(house1.getClass().getSimpleName());
        System.out.println(building1.getClass().getSimpleName());





    }
}
