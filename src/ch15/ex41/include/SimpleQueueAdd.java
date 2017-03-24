package ch.ex41.include;

import lib.utils.SimpleQueue;

import java.util.Iterator;

/**
 * Created by V1 on 23.03.2017.
 */
public class SimpleQueueAdd<T> extends SimpleQueue<T> implements IAddable<T> {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<T> it = this.iterator();
        while (it.hasNext()) {
            sb.append(it.next() + ", ");
        }
        sb.replace(sb.length()-2,sb.length(),"");
        sb.append("]\n");
        return sb.toString();
    }
}
