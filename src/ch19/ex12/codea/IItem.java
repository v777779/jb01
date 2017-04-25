package ch19.ex12.codea;

/**
 * Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
public interface IItem {
    Outcome compete(IItem i);  // используется собственно интерфейс
    Outcome eval(Papers p);      // класс реализующий интерфейс
    Outcome eval(Scissors s);  // класс реализующий интерфейс
    Outcome eval(Rock r);       // класс реализующий интерфейс
}
