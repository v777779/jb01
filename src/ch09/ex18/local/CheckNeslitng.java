package ch.ex18.local;

/**
 * Created by V1 on 14-Feb-17.
 */
public class CheckNeslitng {
    public class CheckPublic implements A.IBDefault {  // в пределах пакета IBDefault
        @Override
        public void f() { }
    }

    class CheckDefault implements A.IBPublic {  // public IBPublic
        @Override
        public void f() { }
    }

    //    class Check2Default implements A.IBPrivate {   // private IBPrivate не работает
//        @Override
//        public void f() { }
//    }
    class Check2Default implements E {  // обычный интерфейс
        @Override
        public void g() { }
    }

    class Check3Default implements E.IGPublic {  // вложенный интерфейс в интерфейс
        @Override
        public void f() { }
    }

    class Check4Default implements E {   // обычный интерфейс обычный класс
        @Override
        public void g() { }
        class check5Default implements E.IGPublic {   // вложенный интерфейс вложенный класс
            @Override
            public void f() { }
        }
    }



}
