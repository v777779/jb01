package lib.container;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by V1 on 3/27/2017.
 */
public class CIntMap extends AbstractMap<Integer, String> {
    private int size;
    private static String[] strings = "A B C D E F G H I J K L M N O P Q R S T U V W ZX Y Z".split(" ");

    public CIntMap(int size) {
        if (size < 0) {
            this.size = 0;      // сделать размер = 0}
        } else {
            this.size = size;   // нормальный размер
        }
    }

    private static class Entry implements Map.Entry<Integer, String> {
        int index;

        public Entry(int index) {
            this.index = index;
        }

        @Override
        public Integer getKey() {
            return index;
        }

        @Override
        public String getValue() {
            String s = strings[index%strings.length]+ (index/strings.length);  // O1,H5 и так далее
            return s;
        }

        @Override
        public String setValue(String value) {
            throw new  RuntimeException();
        }
    }


    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
        Set<Map.Entry<Integer, String>> entries = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            entries.add(new Entry(i));  // добавляет  Entry() объект
        }

        return entries;
    }
}
