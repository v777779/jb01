package ch11.ex16.access;

/**
 * Created by V1 on 22-Feb-17.
 */
public class Word implements Comparable{
    public String s;
    public int count;

    public Word(String word, int count) {
        this.s = word;
        this.count = count;
    }

    public void inc() {
        this.count++;
    }

    public String toString(String format) {
        return String.format(format,s,count);
    }

    @Override
    public String toString() {
        return s + "{" +
                count + '}';
    }


    @Override
    public int compareTo(Object o) {
        String s1 = this.s;//+this.count;
        String s2 = ((Word)o).s;// + ((Word)o).count;

        return s1.compareTo(s2);
    }
}
