package lib.maps;

import java.util.*;

/**
 * Created by V1 on 3/27/2017.
 */
public class Countries {
    private CMap cMap = new CMap();
    public static Map<String, String> map = new FlyWeightMap(); // полная карта на базе AbstractMap
    public static List<String> names = new ArrayList<>(map.keySet());  // имена стран


    private static class FlyWeightMap extends AbstractMap<String, String> {
        private static Set<Map.Entry<String, String>> entries = new EntrySet(CMap.DATA.length);  // полный комплект

        private static class Entry implements Map.Entry<String, String> {
            int index;

            public Entry(int index) {  // конструктор создается с значением index
                this.index = index;
            }

            @Override
            public String getKey() {
                return CMap.DATA[index][0];
            }

            @Override
            public String getValue() {
                return CMap.DATA[index][1];
            }

            @Override
            public String setValue(String value) {
                throw new RuntimeException(); // CMap.DATA final  no write
            }

            @Override
            public boolean equals(Object o) {
                return CMap.DATA[index][0].equals(o);
            }

            @Override
            public int hashCode() {
                return CMap.DATA[index][0].hashCode();
            }

        }

        // создаются entries
        static class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private int size;

            public EntrySet(int size) {  // конструктор EntrySet заполняет длину
                if (size < 0) {
                    this.size = 0;
                }
                if (size > CMap.DATA.length) {
                    this.size = CMap.DATA.length;
                } else {
                    this.size = size;
                }
            }

            //AbstractSet >> Abstract Collection >> implementation
            @Override
            public int size() {
                return size;
            }

            // AbstractSet >> Abstract Collection >> implementation
            @Override
            public Iterator<Map.Entry<String, String>> iterator() {  // Iterator method
                return new Iterator<Map.Entry<String, String>>() {
                    private Entry entry = new Entry(-1); // в общем что то создается

                    @Override
                    public boolean hasNext() {
                        return entry.index < (size - 1);
                    }

                    @Override
                    public Map.Entry<String, String> next() {
                        entry.index++;
                        return entry;
                    }
                };
            }// EntrySet.interator()
        }//EntrySet Class

        // AbstractMap implementation
        @Override
        public Set<Map.Entry<String, String>> entrySet() {
            return entries;  // << EntrySet << Entry
        }
    }// FlyWeightMap Class


    // Static Methods
// select()  subMap(size)
    public static Map<String, String> select(final int size) { // размер набора выбирается при вызове метода
        return new FlyWeightMap() {
            public Set<Map.Entry<String, String>> entrySet() {  // переопределение метода
                return new EntrySet(size);
            }
        };
    }

    public static Map<String, String> capitals() {
        return map; // полная карта
    }
    public static Map<String, String> capitals(int size) {
        return select(size); // частичная карта
    }

    public static List<String> names() {
        return names; // полный список стран
    }
    public static List<String> names(int size) {
        return new ArrayList<>(select(size).keySet()); // частичная карта
    }

}
