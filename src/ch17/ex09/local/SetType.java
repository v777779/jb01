package ch17.ex09.local;

/**
 * Created by V1 on 28-Mar-17.
 */
public class SetType {  // базовый класс хранения содержит общие компоненты
    int i;

    public SetType(int i) {
        this.i = i;
    }

    public boolean equals(Object o) {
        if ((o instanceof SetType) && i == ((SetType) o).i) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return Integer.toHexString(i);
    }
}
