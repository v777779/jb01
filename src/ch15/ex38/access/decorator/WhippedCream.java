package ch.ex38.access.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class WhippedCream extends Decorator {

    public WhippedCream(Basic basic) {
        super(basic);
        setType(getType()+" & whipped cream");  // переопределение метода базового класса
    }

}
