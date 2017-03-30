package ch17.ex15.integra;

/**
 * Created by V1 on 30-Mar-17.
 */
public class GroundHog {
    protected int number;

    public GroundHog(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "GHog_"+ number;
    }
}
