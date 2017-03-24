package ch11.ex22.access;

import java.util.Iterator;

/**
 * Created by V1 on 22-Feb-17.
 */
public class Word implements Comparable {
    private String s;
    private int count;

   public static void show(Iterator<Word> it) {
        int k = 1;
        while(it.hasNext()) {
            Word word = it.next();
            System.out.printf(word.toString("%-15s:%-6s"));
            if (k++ % 8 == 0) {
                k = 1;
                System.out.println();
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Word word = (Word) o;

        return (s != null) ? (s.equals(word.s)) : (word.s == null);
    }

    @Override
    public int hashCode() {
        return s != null ? s.hashCode() : 0;
    }

    public Word(String s) {
        this.s = s;
        this.count = 1;
    }

    public void inc() {
        count++;
    }

    public String toString(String format) {
        return String.format(format,s,count);
    }

    @Override
    public String toString() {
        return s + "{"+ count + '}';
    }

    @Override
    public int compareTo(Object o) {
        return s.compareToIgnoreCase(((Word)o).s);
    }
}
