package ch08.ex16.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class Glyph {

    public Glyph() {
        System.out.println("Glyph.Glyph.before.draw");
        draw(); // rewritten method
        System.out.println("Glyph.Glyph.after.draw");
    }

    void draw() {
    }
}
