package ch15.ex38.access.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class CaramelCoffee extends Decorator {

    public CaramelCoffee(Basic basic) {
        super(basic);
        setType(getType()+" & caramel");
    }

}
