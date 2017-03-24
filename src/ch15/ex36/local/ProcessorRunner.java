package ch.ex36.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class ProcessorRunner<T,E extends Exception> extends ArrayList<IProcessor<T,E>> {

    List<T> processAll()throws E {
        List<T> list = new ArrayList<>();           // T тип хранения пустой список на обработку

        for (IProcessor<T,E> iProc : this) {        // данный класс расширяет ArrayList с типом хранения IP<T,E>
            iProc.process(list);                    // аргумент processor(List<T>)
        }                                           // прогнать все объекты this
        return list; // вернули список
    }
}
