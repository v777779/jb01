package ch19.ex10.codea.vm;

import lib.utils.IGenerator;

/**
 * Copyright (c) 2017 Vadim Voronov
 * email: vadim.v.voronov@gmail.com
 * Created: 19-Apr-17.
 */
public class RandomInputGenerator implements IGenerator<Input>{
    @Override
    public Input next() {
        return Input.randomSelection();
    }
}
