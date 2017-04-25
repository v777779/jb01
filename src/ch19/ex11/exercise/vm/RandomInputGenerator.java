package ch19.ex11.exercise.vm;

import lib.utils.TextFile;

import java.util.*;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class RandomInputGenerator {
    private static Map<String, Good> map = new HashMap<>();
//    private static List<String> list = new ArrayList<>();
    private static Random rnd = new Random();

    static {
        String fileName = "./src/ch19/ex11/exercise/goods.txt";
        List<String> listString = new TextFile(fileName, "\\W+");
        Iterator<String> it = listString.iterator();
        if (listString.size() % 3 != 0) {
            throw new RuntimeException("Error length of List");
        }
        while (it.hasNext()) {
            Good good = new Good(it.next(), it.next(), it.next());
            map.put(good.getName(), good);
        }
// spec объекты
        map.put("ABORT_TRANSACTION", new Good("ABORT_TRANSACTION", "0", "QUIT_TRANSACTION"));
        map.put("STOP", new Good("STOP", "0", "SHUT_DOWN"));

//        list.addAll(map.keySet()); // весь keyset  категории товаров, спец объект входят
    }

    public static Input next(String name) {
        return new Input(map.get(name)); // вытащить
    }

//    @Override
//    public Input next() {
//        String name = list.get(rnd.nextInt(list.size()));  // получить случайное имя
//        return new Input(map.get(name)); // вернуть полный объект
//    }
}
