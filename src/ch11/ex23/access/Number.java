package ch11.ex23.access;

/**
 * Created by V1 on 27-Feb-17.
 */
public class Number implements Comparable<Number> {   // вот так задается сразу тип на сравнение в compareTo
    private int val;
    private int count;

    public Number(int val, int count) {
        this.val = val;
        this.count = count;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void incCount() {  // инкремент
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Number o) {            // сравнение только по значению count
        if(o.count < count ) {
            return -1;
        }
        if(count == o.count ) {
            return 0;
        }
            return 1;  // count > remote
    }

    @Override
    public String toString() {
        return String.format("%2d:%3d",val,count) ;
    }
}
