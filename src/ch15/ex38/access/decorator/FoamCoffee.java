package ch15.ex38.access.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class FoamCoffee extends Decorator {

    public FoamCoffee(Basic basic) {
        super(basic);
        setType(getType()+" & foam");   // переопределение метода базового класса
    }

}
