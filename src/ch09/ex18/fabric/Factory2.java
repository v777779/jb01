package ch09.ex18.fabric;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Factory2 implements IEFactory {  // обернули интерфейс и класс реализации в обертку
    @Override
    public Service getEquipment() {   // возвращаем класс с реализацией
        System.out.println("Factory2.getEquipment");
        return new Equipment2();
    }
}
