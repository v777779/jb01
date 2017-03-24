package ch10.ex7.access;

/**
 * Created by V1 on 15-Feb-17.
 */
public class Ground {
    private int groundValue = 35;  // закрытое поле внешнего класса
    private String sPath = "";

    private class Router {   // закрытый класс
        private int groundValue = 15; // добавлено чтобы увеличить неразбериху

        public Router() {
        }

        private void incGround() {  // закрытый метод внутреннего класса
            sPath+= ("Router.incGround > ");
            Ground.this.groundValue++;  // доступ к закрытому полю внешнего класса
            Ground.this.showGround();   // доступ к закрытому методу внешнего класса

        }

        private void showGround() {  // тоже самое чтобы добавить неразберихи
            System.out.println("Router:" + groundValue);
        }

    }

    public Ground() {
    }

    private void showGround() {  // закрытый метод внешнего класса
        sPath+= ("Ground.showGround");
        System.out.println("Ground:" + groundValue);
    }

    public void newRouter() {    // кольцевой доступ  разрешено вызвать снаружи
        sPath+= ("Ext > Ground.newRouter > ");
        Router r = new Router();  // создать объект закрытого внутреннего класса
        r.incGround();            // вызвать его закрытый метод внутреннего класса
        System.out.println(sPath);// который меняет закрытое поле внешнего класса
    }                             // и вызывает закрытый метод внешнего класса

    public void checkRouter() {
        Router r = new Router();
        r.showGround();
        r.groundValue++;
        r.showGround();
    }


}
