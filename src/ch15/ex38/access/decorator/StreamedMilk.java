package ch.ex38.access.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class StreamedMilk extends Decorator {

    public StreamedMilk(Basic basic) {
        super(basic);
        setType(getType()+" & streamed milk");  // переопределение метода базового класса
    }
}
