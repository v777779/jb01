package ch18.ex11.access.variant;

/**
 * Created by V1 on 10-Mar-17.
 */
public interface IFactoryGC2< C extends GreenHouse,T extends Event> {
//    T create();
//   IFactoryGC<C,T> next(C c,long delay);
    T create(C c, long delay);               // сразу создаем объект внутри класса
    T create(C c, long delay, long count);   // на два параметра


}
