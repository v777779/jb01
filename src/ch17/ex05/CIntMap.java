package ch17.ex05;

import java.util.*;

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

    private static class EntrySet extends AbstractSet<Map.Entry<Integer, String>> {
        private int size;
        public EntrySet(int size) {
            this.size = size;
        }

        @Override
        public Iterator<Map.Entry<Integer, String>> iterator() {
            return new Iterator<Map.Entry<Integer, String>>() {
                private int index = 0;
                @Override
                public boolean hasNext() {
                    return index < size;
                }

                @Override
                public Map.Entry<Integer, String> next() {  // создавать объект по ходу
                    index++;
                    return new Entry(index);
                }
            };
        }

        @Override
        public int size() {
            return size;
        }
    }

    @Override
    public Set<Map.Entry<Integer, String>> entrySet() {
         return new EntrySet(size);
    }
}
