package ch19.ex08.exercise.office;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public interface IHandler<T> {
    boolean handle(T m);
}
