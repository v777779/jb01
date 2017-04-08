package lib.orange;

import java.util.List;

/**
 * Created by V1 on 10-Mar-17.
 */
public interface IFactoryGC< C extends GreenHouse,T extends Event> {
    T create();
//   IFactoryGC<C,T> next(C c,long delay);
    T create(C c,long delay);               // сразу создаем объект внутри класса
    T create(C c,long delay, int count, List<T> list);   // на два параметра


}
