package ch.ex38.local.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class Decorator extends Basic {
    protected Basic basic;
    public Decorator(Basic basic) {  // добавили объект с реализацией Basic
        this.basic = basic;
    }
    public void setString(String s) {  // делегируем в базовый класс
        basic.setString(s);
    }
    public String getString() {// делегируем в базовый класс
        return basic.getString();
    }
}
