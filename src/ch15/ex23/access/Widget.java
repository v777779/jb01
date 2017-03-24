package ch15.ex23.access;

/**
 * Created by V1 on 17.03.2017.
 */
public class Widget {
    private String s;

    public Widget(String s) {
        this.s = s;
    }

    public static class Factory implements IFactory2<Widget,String> {
        @Override
        public Widget create(String s) {
            return new Widget(s);
        }
    }

    @Override
    public String toString() {
        return "Widget{"+s+"}";
    }
}
