package ch17.ex10.access;

import lib.ball.IComparator;

import java.util.*;

/**
 * Created by V1 on 29-Mar-17.
 */
public class SortedLinked<T> implements SortedSet<T> {
    private final List<T> list;

    public SortedLinked(List<T> list) {     // запускаем
        this.list = new LinkedList<T>(list);
    }

    @Override
    public Comparator<? super T> comparator() {
        return new Comparator<T>() {
            private int count = 0;
            @Override
            public int compare(T o1, T o2) {
                Class<?> type = o1.getClass();
                if (type == String.class) {
                    return ((String) o1).compareTo((String) o2);
                }
                if (type == Integer.class) {
                    return ((Integer) o1).compareTo((Integer) o2);
                }
                try {
                IComparator<T> comp = (IComparator<T>) o1;  // вытаскиваем компаратор
                    return comp.compare(o1, o2);  // автораспаковка
                } catch (Exception e) {
                    if (count++ == 0) {
                        System.out.println("catch: no Comparator");
                    }
                    return 0;
                }
            }
        };
    }

    @Override
    public SortedLinked<T> subSet(T fromElement, T toElement) {
        int from = list.indexOf(fromElement);
        int to = list.indexOf(toElement);
        if (to < from) {
            int change = from;
            from = to;
            to = change;
        }
        return new SortedLinked<T>(list.subList(from, to));
    }

    @Override
    public SortedLinked<T> headSet(T toElement) {
        int from = 0;
        int to = list.indexOf(toElement);
        return new SortedLinked<T>(list.subList(from, to));
    }

    @Override
    public SortedLinked<T> tailSet(T fromElement) {
        int from = list.indexOf(fromElement);
        int to = list.size();
        return new SortedLinked<T>(list.subList(from, to));
    }

    @Override
    public T first() {
        return list.get(0);
    }

    @Override
    public T last() {
        return list.get(list.size() - 1);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return list.contains(o);
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public Object[] toArray() {
        return list.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return  list.toArray(a);
    }

    @Override
    public boolean add(T t) {
        return list.add(t);
    }

    @Override
    public boolean remove(Object o) {
        return list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return list.addAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return list.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return list.removeAll(c);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
