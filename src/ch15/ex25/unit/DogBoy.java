package ch15.ex25.unit;

/**
 * Created by V1 on 18.03.2017.
 */
public class DogBoy extends CaninHero<SuperHearSmell>{ // класс хранения  объекта SuperHearSmell
    public DogBoy() {
        super(new SuperHearSmell()); // создаем объект прямо в конструкторе
    }
}
