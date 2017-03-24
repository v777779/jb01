package ch.ex12.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ground  {
    private int groundValue = 35;  // закрытое поле внешнего класса


    public Ground() {
    }

    protected void showGround() {  // закрытый метод внешнего класса
        System.out.println("Ground:" + groundValue);
    }

    protected void incGround(){  // абстрактная функция
    }

    protected void incValue(){  // абстрактная функция
    }

    public void newRouter() {   // запустить отработку
        this.showGround();       // проверка содержимого поля базового класса
        getRouter().incGround();
        this.showGround();       // проверка содержимого поля базового класса

    }

    private Ground getRouter() {
        return new Ground() {               // Anonym
            private int groundValue = 15;   // anonym field
            @Override
            protected void incGround() {
//                super.groundValue++;      // доступ к полю super анонимного класса
//                super.showGround();       // доступ к методу super анонимного класса
                Ground.this.groundValue++;  // доступ к полю внешнего класса
                Ground.this.showGround();   // доступ к методу внешнего класса


            }

            @Override
            protected void showGround() {
                System.out.println("Ground:"+super.groundValue+" Router:" + groundValue);
            }

            @Override
            protected void incValue() {
                groundValue++;
            }
        };

    };

    public void checkRouter() {
        Ground r = getRouter();
        r.showGround();  // показать оба поля
        r.groundValue++; // поле предка++
        r.incValue();    // поле потомка++
        r.showGround();

    }
}
