package ch05.ex21;

/**
 * Created by V1 on 06-Feb-17.
 */
public class Burrito {
    Species degree = Species.NOT;

    public Burrito(Species degree) {
        this.degree = degree;
    }

    void describe() {
        System.out.print("This burrito is > ");
        switch (degree) {
            case NOT:
                System.out.println(" not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println(" a little  hot");
                break;
            case HOT_FIX:
            case FLAMING:
                System.out.println(" maybe too hot");
                break;
            default:
                System.out.println(" isn't burrito");
            break;
        }
    }
}
