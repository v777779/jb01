package ch20.ex03m.codea.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@Target(ElementType.TYPE)  // область класс
@Retention(RetentionPolicy.SOURCE)  //
public @interface ExtractInterface {
    public String value();      // по умолчанию и без default
}
