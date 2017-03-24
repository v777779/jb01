package ch.ex38.access.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class ChocolateCoffee extends Decorator {

    public ChocolateCoffee(Basic basic) {
        super(basic);
        setType(getType()+" & chocolate");
    }

}
