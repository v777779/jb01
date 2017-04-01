package ch17.ex26.local;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 01-Apr-17.
 */
public class CountedString {
    private static List<String> list = new ArrayList();
    private String s;
    private int id = 0;

    public CountedString(String s) {
        this.s = s;
        list.add(s);
        for (String s1 : list) {  // на каждый экземпляр проверяет
            if (s1.equals(s)) {   // сколько раз одна и та же строка
                id++;             // попала в список
            }
        }
    }

    @Override
    public int hashCode() {
        int result = 17; // формируем hashCode() для объекта String
        result = result * 37 + s.hashCode();  // поле s отработали
        result = result * 37 + id;            // поле id отработали
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CountedString))
            return false;
        CountedString that = (CountedString) o;
        if (id != that.id)
            return false;
        return s != null ? s.equals(that.s) : that.s == null;

//        if ((o instanceof CountedString2) &&
//                s.equals(((CountedString2) o).s) &&
//                id == ((CountedString2) o).id) {
//            return true;
//        }
//        return false;
    }

    @Override
    public String toString() {
        return "[String:" + s + " id:" + id+
                " hashCode():"+hashCode()+"]";
    }
}
