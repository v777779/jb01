package ch.ex38.access.decorator;


/**
 * Created by V1 on 22.03.2017.
 */
public class Decorator extends Basic {
    protected Basic basic;

    public Decorator(Basic basic) {  // добавили объект с реализацией функционала Basic
        this.basic = basic;
    }
    public void setType(String s) {  // делегируем в базовый класс
        basic.setType(s);
    }
    public String getType() {// делегируем в базовый класс
        return basic.getType();
    }

}
