package ch20.ex01.codeb;

import lib.ball.Ball;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 21-Apr-17.
 */
@Target(ElementType.TYPE)           // to class only
@Retention(RetentionPolicy.RUNTIME) // at runtime only
public @interface SimulatingNull {
    public int id() default -1;
    public String description() default "";
    public long count() ;
    public Class value() default Ball.class;
}
