package ch09.ex11.text;

/**
 * Created by V1 on 13-Feb-17.
 */
public class DownCase  extends  StringProcessor {

    @Override
    public String process(Object object) {                 // @Override тип параметра должен четко совпадать
         return  object.toString().toLowerCase();          // @Override тип параметра по выходу может быть производный
    }

    @Override
    public String toString() {
        return "DownCase{}";
    }
}
