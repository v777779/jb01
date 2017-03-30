package ch17.ex15.remote;

/**
 * Created by V1 on 30-Mar-17.
 */
public class GroundHog2 {
    protected int number;

    public int hashCode() {  // вернуть в качестве hashCode номер объекта
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GroundHog2)) return false;
        return number == ((GroundHog2) o).number;
    }

    public GroundHog2(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "GHog_" + number;
    }
}
