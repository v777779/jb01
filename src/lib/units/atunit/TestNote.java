//: net/mindview/atunit/Test.java
// The @Test tag.
package lib.units.atunit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.TYPE,ElementType.METHOD,
         ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestNote {
    String value(); //  default "";
} ///:~
