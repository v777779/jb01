package ch20.ex03m.codea.dbase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLString {
    int value() default 0;
    String name() default "";
    Constraints constraints() default @Constraints;  // объявление аннотаций
}
