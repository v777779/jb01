package ch14.ex11.remote;

import ch14.ex11.remote.toys.*;


/**
 * Created by V1 on 20-Feb-17.
 */
public class Remote {
    public static void app() throws Exception {
        System.out.println("\n====REMOTE===");
        System.out.println("\nClass.getInstance() Check\n");
        Class<FancyToy> ftClass = FancyToy.class; // ссылка на объект Class
// восходящее
        FancyToy f  = ftClass.newInstance();                      // экземпляр создает
        Toy t       = ftClass.newInstance();                      // экземпляр восходящее тоже создает

// superclass via Class getSuperClass()
//      Class<Toy>  tt2 = ft.getSuperclass();               // так не работает
//      Toy t4 = tt2.newInstance();                         // не работает

        Class<? super FancyToy> ftSuper = ftClass.getSuperclass();   // работает
//        Object t4 = tt2.newInstance();                         // НЕ работает RunTime Exception


// superclass original way
        Class<Toy>  tSuper = Toy.class;                             // работает
//        Toy t2 = tt.newInstance();                            // НЕ работает RunTime Exception

        System.out.println("f  :"+f.getClass().getSimpleName());
        System.out.println("t  :"+t.getClass().getSimpleName());
        System.out.println("tt2:"+ftSuper.getSimpleName());
        System.out.println("tt :"+tSuper.getSimpleName());
// Cast
        FancyToy h2 = ftClass.cast(t);  // обратный cast
        FancyToy h4 = (FancyToy)t;      // обратный cast

        h2.draw();
        h4.draw();

        System.out.println("FancyToy.isInstance       : "+FancyToy.class.isInstance (h2));
        System.out.println("Toy.isInstance            : "+Toy.class.isInstance(h2));
        System.out.println("FancyToy ==               : " +(FancyToy.class == h2.getClass()));
//            System.out.println(Toy.class == h2.getClass());
        System.out.println("FancyToy == getSuperclass : "+ (FancyToy.class == h2.getClass().getSuperclass()));
        System.out.println("Toy == getSuperclass      : "+(Toy.class == h2.getClass().getSuperclass()));
        System.out.println("isAssignableFrom(FancyToy): "+FancyToy.class.isAssignableFrom(h2.getClass()));
        System.out.println("isAssignableFrom(Toy)     : "+Toy.class.isAssignableFrom(h2.getClass()));
        System.out.println("isAssignableFrom(FancyToy): "+FancyToy.class.isAssignableFrom(h2.getClass()));
        System.out.println("isAssignableFrom(Toy)     : "+Toy.class.isAssignableFrom(h2.getClass()));

    }
}
