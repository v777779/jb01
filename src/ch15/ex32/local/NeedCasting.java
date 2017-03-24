package ch.ex32.local;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by V1 on 21.03.2017.
 */
public class NeedCasting {
    public static <T> List<T> f() {
        String[] args = new String[]{"", "", "", "", "", ""};  // строка пустых аргументов
        ObjectInputStream in;
        List<T> list = new ArrayList<>();
        List <T> listNew = new ArrayList<T>();
        try {
            in = new ObjectInputStream(new FileInputStream(args[0]));
            list = (List<T>)in.readObject();            // работает, по старому типу
            listNew = List.class.cast(in.readObject()); // работает по новому типу

        } catch (Exception e) {

        }
        return listNew;  // возврат по новому типу
    }

    public static void castTest() {
        System.out.println("Cast Test:");
        List <Widget> list = f();
        System.out.println("list:"+list);

    }

}
