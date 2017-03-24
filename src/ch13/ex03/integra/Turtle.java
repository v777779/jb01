package ch13.ex03.integra;

import java.util.Formatter;

/**
 * Created by V1 on 05-Mar-17.
 */
public class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n",name,x,y);
    }
}
