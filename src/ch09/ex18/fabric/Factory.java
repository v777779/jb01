package ch.ex18.fabric;

/**
 * Created by V1 on 14-Feb-17.
 */
public class Factory implements IEFactory {  // обернули интерфейс и класс реализации в обертку
    @Override
    public Service getEquipment() {   // возвращаем класс с реализацией
        System.out.println("Factory.getEquipment");
        return new Equipment();
    }
}
