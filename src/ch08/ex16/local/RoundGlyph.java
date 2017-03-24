package ch08.ex16.local;

/**
 * Created by V1 on 10-Feb-17.
 */
public class RoundGlyph extends Glyph{
    private int radius = 1;

    public RoundGlyph(int radius) {
        this.radius = radius;
        System.out.println("RoundGlyph.Constructor.radius."+radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw.radius."+radius);
    }
}
