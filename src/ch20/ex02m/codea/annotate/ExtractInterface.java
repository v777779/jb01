package ch20.ex02m.codea.annotate;

import java.lang.annotation.*;

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
