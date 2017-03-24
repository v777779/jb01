package ch08.ex16.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class RectangularGlyph extends Glyph {
    private int vertexes = 4;

    public RectangularGlyph() {
        System.out.println("RectangularGlyph.Constructor."+vertexes);
    }

    void draw() {
        System.out.println("RectangularGlyph.draw."+vertexes);
    }

}
