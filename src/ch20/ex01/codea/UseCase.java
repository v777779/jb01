package ch20.ex01.codea;

import java.lang.annotation.*;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public int id();
    public String description() default "no description" ;
}
