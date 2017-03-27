package lib.container;

import java.util.AbstractList;

/**
 * Created by V1 on 3/27/2017.
 */
public class CIntList extends AbstractList<Integer>{
    private int size;
    private int coeff[] = {1,5,7,9,15};

    public CIntList(int size) {
        if(size < 0)    this.size = 0;
        else            this.size = size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index * coeff[index %coeff.length] );  // генератор элементов списка
    }

    @Override
    public int size() {
        return size;
    }
}
