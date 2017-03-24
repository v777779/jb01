package ch.ex38.access.decorator;

/**
 * Created by V1 on 22.03.2017.
 */
public class Basic {
    private String type;

    public Basic() {  // конструктор нужен для Decorator конструктора
    }

    public Basic(String type) {  // конструктор с предустановкой базового типа
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
}
