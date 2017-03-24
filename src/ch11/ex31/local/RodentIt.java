package ch11.ex31.local;

import lib.rodent.Rodent;

import java.util.Iterator;

/**
 * Created by V1 on 28-Feb-17.
 */
public class RodentIt extends Rodents implements Iterable<Rodent>{
    public RodentIt() {  // просто запускается
    }

    public RodentIt(int size) {  // создает объект нужного формата
        super(size);
    }

    @Override
    public Iterator<Rodent> iterator() {
        return new Iterator<Rodent>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < rodents.length;
            }

            @Override
            public Rodent next() {
                return rodents[index++];
            }
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
