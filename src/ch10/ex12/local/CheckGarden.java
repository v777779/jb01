package ch.ex12.local;

/**
 * Created by V1 on 15-Feb-17.
 */
public class CheckGarden {

    public static void show() {

        Garden garden = new Garden();
        System.out.println(garden.showFlower());  // обычный класс

        Garden g = new Garden() {  // анонимный класс пустой конструктор
            public String sInside = "String_Anonymous_Value";
            @Override
            public String showFlower() {
                return ("Anonymous:"+sInside+ "  Garden:"+ super.sInside); // использовать свое поле и чужое

            }   // super Доступно только внутри класса
            @Override
            public  String getSuper() {
                return super.sInside;
            }
            @Override
            public  String getsInside() {
                return sInside;
            }
        };
        Garden g2 = new Garden("S2Garden"){     // конструктор с параметром
            public String sInside ="S2Anonymous";
            @Override
            public  String getsInside() {
                return sInside;
            }
        };

        System.out.println("\nAnonymous 1");
        System.out.println("Field :"+g.sInside);      // по умолчанию данные предка
        System.out.println("Method:"+g.getSuper());   // поле берет из предка
        System.out.println("Method:"+g.getsInside()); // поле взято из потомка

        System.out.println("\nAnonymous 2");
        System.out.println("Field :"+g2.sInside);      // по умолчанию данные предка
        System.out.println("Method:"+g2.getsInside()); // поле взято из потомка


        System.out.println("\nStandard Inheritance");
        Garden r = new Row();
        System.out.println("Field :"+r.sInside);          // поля берет у класса предка
        System.out.println("Method:"+r.getsInside());     // поля берет у класса предка


    }
}
