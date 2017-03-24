package ch11.ex12a.orange;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Controller {
    private List<Event> eventList = new LinkedList<>(); // создать список событий
    private boolean requestExit = false;

    public void addEvent(Event c) {                    // добавить событие в список
        eventList.add(c);                              // т.к. abstract Event, то action()
    }                                                   // задать в потомке либо анонимный классе

    public void requestForExit() {
        requestExit = true;
    }

    public void run() {
        requestExit = false; // запрос на выход выключен
        while (eventList.size() > 0 && !requestExit) {  // отработать весь список событий
            ListIterator<Event> it = new LinkedList<>(eventList).listIterator();  // сделать копию и итератор
            while(it.hasNext()) {
               Event event =  it.next();
                if (event.ready()) {
                    System.out.print(event); // распечатать событие
                    event.action();             // создается при new Event()
                    eventList.remove(event);    //  интересно как он ее находит???
                }
            }
        }
    }

}
