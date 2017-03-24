package ch14.ex24.local;

import java.util.ArrayList;

/**
 * Created by V1 on 12-Mar-17.
 */
public class Staff extends ArrayList<Position> {
    public void add(String title, Person person) {
        add(new Position(title, person));  // конструктор <jobTitle, employee>
    }

    public void add(String... titles) {  // String...titles означает от 1 до n String[]
        for (String title : titles) {
            add(new Position(title)); // конструктор <jobTitle>  person = Person.NULL
        }
    }

    public Staff(String... titles) {
        add(titles);
    }

    public boolean isPosAvailable(String title) {
        for (Position pos : this) {
            if ((pos.getTitle() == title) && (pos.getPerson() == Person.NULL)) {
                return true;
            }
        }
        return false;
    }
    public void fillPosition(String title, Person hire) {
        for (Position pos : this) {
            if ((pos.getTitle() == title) && (pos.getPerson() == Person.NULL)) {
                pos.setPerson(hire);
                return;
            }
        }
        throw new RuntimeException("Position:"+title+" not available");
    }

}
