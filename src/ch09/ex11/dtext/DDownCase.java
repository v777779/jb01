package ch09.ex11.dtext;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DDownCase extends DStringProcessor {

    public String name() {
        System.out.print("IProcessor.name.");
        return getClass().getSimpleName(); // get simple Name of Class
    }
    @Override
    public String process(Object object) {                 // @Override тип параметра должен четко совпадать
         return  object.toString().toLowerCase();          // @Override тип параметра по выходу может быть производный
    }

    @Override
    public String toString() {
        return "DDownCase{}";
    }
}
