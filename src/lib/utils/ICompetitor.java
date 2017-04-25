package lib.utils;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public interface ICompetitor<T extends ICompetitor<T>> { // все что расширяет ICompetitor<T> и ничего более
    Outcome compete(T item);
}
