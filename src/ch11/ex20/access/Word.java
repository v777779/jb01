package ch11.ex20.access;

/**
 * Created by V1 on 22-Feb-17.
 */
public class Word {
    String word;
    int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public String toString() {
        return word + "{" +
                count + '}';
    }
}
