package ch20.ex01.codea;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vaidim.v.voronov@gmail.com
 * Created: 20-Apr-17.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}

