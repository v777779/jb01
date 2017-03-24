package ch15.ex04.access;

/**
 * Created by V1 on 14-Mar-17.
 */
public class Sequence<T> {
    private Object[] items; // ссылка пустая на массив ссылок Object
    private int next = 0;
    private Sequence<T> pLink = this;

    public Sequence(int size) {
        items = new Object[size]; // создали массив пустых ссылок
    }

    public void add(T o) {
        if (next < items.length) {
            items[next++] = o;  // прописали новую ссылку в массиве на объект
        }
    }

    public class Selector implements ISelector<T> { // inner class
        private int index = 0;

        @Override
        public boolean checkEnd() {     // проверяет последний это элемент или нет
            return (index >= items.length);
        }

        @Override
        public T getCurrent() {             // вытаскивает текущий объект
            if (checkEnd()) {
                throw new RuntimeException("Array Error");
            } else {
                return (T) items[index];         // нестрогая типизация}
            }
        }

        @Override
        public void nextIndex() {
            if (index < items.length) {
                index++;
            }
        }
    }

    public ISelector<T> getSelector() {
        return new Selector();
    }

}
