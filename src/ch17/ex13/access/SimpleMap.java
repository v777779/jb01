package ch17.ex13.access;

/**
 * Created by V1 on 29-Mar-17.
 */
public class SimpleMap<K, V> {  // самодельная карта Map
    private Object[][] pairs;
    private int index;

    public SimpleMap(int length) {
        pairs = new Object[length][2];
    }

    public void put(K key, V value) {
        if (get(key) == null) {
            Object[][] temp = new Object[index + 1][2];
            for (int i = 0; i < index; i++) {
                temp[i][0] = pairs[i][0];
                temp[i][1] = pairs[i][1];
            }
            pairs = temp; // передали новый массив на 1 больше
            if (index >= pairs.length) {
                throw new RuntimeException();
            }
            pairs[index++] = new Object[]{key, value};
        } else {  // значение уже есть в базе
            for (int i = 0; i < index; i++) {
                if (key.equals(pairs[i][0])) {
                    pairs[i][1] = value;
                    break;
                }
            }
        }
    }

    public V get(K key) {
        for (int i = 0; i < index; i++) {
            if (key.equals(pairs[i][0])) {
                return (V) pairs[i][1];
            }
        }
        return null; // ничего не найдено
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < index ; i++) {
            sb.append(pairs[i][0].toString());
            sb.append(":");
            sb.append(pairs[i][1].toString());
            if (i < index - 1) {
                sb.append("\n"); // везде кроме последней строки добавить \n
            }
        }
        return sb.toString();
    }
}
