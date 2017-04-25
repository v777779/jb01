package ch20.ex01.exercise.dbase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@Target(ElementType.TYPE)  // работает на уровне класса
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    String name() default "";
}
