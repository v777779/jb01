package ch.ex22.include;

import lib.utils.IFactory;

/**
 * Created by V1 on 17.03.2017.
 */
public class Widget {
    public class Factory implements IFactory<Widget> {
        public Factory() {
        }

        @Override
        public Widget create() {
            return new Widget();
        }
    }

    @Override
    public String toString() {
        return "Widget{}";
    }
}
