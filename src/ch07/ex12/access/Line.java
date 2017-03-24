package ch07.ex12.access;

/**
 * Created by V1 on 08-Feb-17.
 */
public class Line extends Shape {
    int start;
    int end;

    public Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Line.Constructor: "+start+" "+end);
    }

    void dispose() {
        System.out.println("Line.dispose: "+start+" "+end);
        super.dispose();
    }


}
