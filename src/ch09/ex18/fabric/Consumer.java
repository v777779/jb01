package ch.ex18.fabric;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Consumer { // статический метод для выполнения обработки на конкретном оборудовании
    public static void getService(IEFactory factory) {
        System.out.println("UserCycle.getService IEFactory");
        Service s = factory.getEquipment();  // получили оборудование под интерфейс Service
        s.initData();
        s.startWork();
    }

    public static void getService(Service s) {
        System.out.println("UserCycle.getService Equipment");
        s.initData();
        s.startWork();
    }

}
