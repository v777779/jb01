package ch11.ex03.access;

import lib.utils.Range;

/**
 * Created by V1 on 20-Feb-17.
 */
public class SequenceOld {
    private Object[] items;
    private int next = 0;

    public SequenceOld(int size) {
        items = new Object[size];
    }

    public void add(Object obj) {  // добавить объект
        if (next < items.length) {
            items[next++] = obj;
        }
    }

    public void newSequence() {
        for (int i = 0; i < items.length; i++) {
            add(Integer.valueOf(Range.getInt(100))); // заполнить объектами Integer
        }
    }

    public void show() {
        Selector sl = new Selector();
        System.out.println("Sqequence with Selector ["+items.length+"]");
        while (!sl.end()) {
            System.out.print(sl.current()+" ");  // вывести текущий объект
            sl.next(); // переключить на новый объект
        }
        System.out.println();

    }


    private class Selector {   // internal class
        private int i = 0;     // internal index

        public boolean end() {
            return i == items.length; // если конец то true
        }

        public Object current() {
            if (end()) {
                return items[items.length - 1];  // вернуть последний объект
            }
            return items[i];
        }

        public void next() {
            if (i < items.length) {  // от 0 до длины массива на самом деле
                i++;                 // i.max = items.length т.е. выход за пределы массива
            }
        }

        public Selector selector() {  // вернуть собственно Selector внутренний класс
            return new Selector();
        }


    }
}

