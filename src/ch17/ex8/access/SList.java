package ch17.ex8.access;

/**
 * Created by V1 on 3/28/2017.
 */
public class SList<T> {
    private Link first;
    private Link last;

    private int size;

    public SList() {
    }

    public SList(T arg) {
        first = new Link(arg);
        last = first;
        size = 1;
    }

    private class Iter implements ISListIterator<T> {
        private int index;
        private Link link;

        public Iter() {  // предыдущий не взять
            index = 0;
            link = first;
        }
        // методы
        @Override
        public boolean hasNext() {
            return index < size;
        }
        @Override
        public Link next() {
            Link linkOld = link;
            if (index >= size) {
                throw new RuntimeException();
            }
            index++;

            link = link.getNext();
            return linkOld;
        }
        @Override
        public void add() {
            Link link = new Link();
            if (size == 0) {  // первый раз
                first = link;
                last = link;
            } else {
                last.setNext(link);  // пробросить линк
                last = link; // отпустить last
            }
            size++;
        }
        @Override
        public void add(T arg) {
            Link link = new Link(arg);
            if (size == 0) {  // первый раз
                first = link;
                last = link;
            } else {
                last.setNext(link);  // пробросить линк
                last = link; // отпустить last
            }
            size++;
        }
        @Override
        public void remove() {       // удалить по умолчанию первый элемент
            Link linkPrev = first;
            Link link = first;
            if (size <= 0) {
                throw new RuntimeException();
            }

            ISListIterator<T> lit = new Iter(); // новый итератор
            while (lit.hasNext()) { // открутить весь итератор
                linkPrev = link;
                link = lit.next();
            }
            size--;
            last = linkPrev;           // забыли последний элемент
            last.setNext(null);        // забыли ссылку о нем
        }
        @Override
        public void remove(T arg) {  // удалить выбранный элемент
            Link linkPrev;
            Link link = first;
            if (size <= 0) {
                throw new RuntimeException();
            }
            ISListIterator<T> lit = new Iter(); // новый итератор
            while (lit.hasNext()) {
                linkPrev = link;
                link = lit.next();
                if (link.getValue() == arg) {
                    size--;
                    linkPrev.setNext(link.getNext());  // выключить звено
                    break;
                }
            }
        }
        @Override
        public void removeAll() {       // удалить по умолчанию первый элемент
            size = 0;
            first  = null;
            last = null;
        }

    }

    public ISListIterator<T> iterator() {
        return new Iter();
    }

    public int size() {
        return  size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SList ["+size()+"] [");

        ISListIterator it = iterator();
        while (it.hasNext()) {
            sb.append(it.next() + " ");
        }
        sb.append("]\n");

        return sb.toString();
    }
}
