package ch19.ex09.exercise.post;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public interface IHandler<T> {
    boolean handle(T m);
}
