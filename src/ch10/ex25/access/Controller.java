package ch10.ex25.access;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 17-Feb-17.
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>(); // создать список событий
    private boolean requestExit = false;

    public void addEvent(Event c) {                    // добавить событие в список
        eventList.add(c);                              // т.к. abstract Event, то action()
    }                                                   // задать в потомке либо анонимный классе



    public void run() {
        while (eventList.size() > 0 ) {  // отработать весь список событий
            ArrayList<Event> eventClone = new ArrayList<>(eventList);  // сделать копию иначе слетает итератор
            for (Event event : eventClone) {
                if (event.ready()) {
                    System.out.print(event); // распечатать событие
                    event.action();             // создается при new Event()
                    eventList.remove(event);    //  интересно как он ее находит???
                }
            }
        }
    }

}
