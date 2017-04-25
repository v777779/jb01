package ch20.ex01.exercise.dbase;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
public enum EShape {
    CIRCLE, POINT, CUBE;

    @Override
    public String toString() {
        return name();
    }
}
