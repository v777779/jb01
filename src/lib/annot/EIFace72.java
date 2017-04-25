package lib.annot;

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
public @interface EIFace72
{
    public String value();      // по умолчанию и без default
}
