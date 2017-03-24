package ch15.ex21.remote;

/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() {
        System.out.println("\n====REMOTE===");
        System.out.println("\nErasure Compensation Check\n");
        System.out.println("Check Generic w Class Label");

        System.out.println("Building<>:");
        ClassCapture<Building> ctt1 = new ClassCapture<>(Building.class); // загнали образец класса
        System.out.println("Building instanceof Building :"+ctt1.f(new Building())); //
        System.out.println("House    instanceof Building :"+ctt1.f(new House())); //
        System.out.println("\nHouse<>:");

        ClassCapture<House> ctt2 = new ClassCapture<>(House.class); // загнали образец класса
        System.out.println("Building instanceof House    :"+ctt2.f(new Building())); //
        System.out.println("House    instanceof House    :"+ctt2.f(new House())); //

    }
}
