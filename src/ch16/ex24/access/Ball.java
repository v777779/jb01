package ch16.ex24.access;

/**
 * Created by V1 on 26.03.2017.
 */
public class Ball {
    private int size;

    public Ball(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball)) return false;
        Ball ball = (Ball) o;
        return size == ball.size;
    }


    @Override
    public String toString() {
        return "Ball(" + size+ ')';
    }
}
