package ch16.ex10.access;

import java.util.List;

/**
 * Created by V1 on 25.03.2017.
 */
public class ListOfGeneric<T> {
    private List<T>[] lists;

    public ListOfGeneric(int size) {
        this.lists = (List<T>[])new List[size]; // создали коллекцию
    }

    public List<T>[] get() {
        return lists;
    }

}
