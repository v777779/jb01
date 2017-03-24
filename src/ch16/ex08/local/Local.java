package ch16.ex08.local;

import lib.ball.Ball;
import lib.utils.BerylliumSphere;
import lib.utils.Range;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Local {
    public static <T> T[] getArray(int size) {
        return (T[]) new Object[size];
    }

    public static String[] getArray2(int size) {
        return (String[]) new Object[size];
    }

    public static void app() {
        System.out.println("\n====LOCAL===");
        System.out.println("\nArray and Generic Check\n");

        System.out.println("Parametrized Array:");
        ClassParam<Ball> cb = new ClassParam<>();
        Ball[] balls = {new Ball(), new Ball(), new Ball()};
        Ball[] cballs = cb.f(balls); // получить входной массив и вернуть его
        System.out.println(Arrays.deepToString(cballs));

        System.out.println("\nParametrized Method:");
        Ball[] dballs = MethodParam.f(balls); // получить входной массив и вернуть его
        System.out.println(Arrays.deepToString(dballs));

        Integer[] ints = {1, 2, 3, 4, 5};
        Double[] dbls = {1.1, 2.2, 3.3, 4.4, 5.5};


        Integer[] ints2 = new ClassParam<Integer>().f(ints);
        Double[] dbls2 = new ClassParam<Double>().f(dbls);

        Integer[] ints4 = MethodParam.f(ints);
        Double[] dbls4 = MethodParam.f(dbls);

        System.out.println("\nParametrized Array<String> Link:");
        List<String>[] ls;  // ссылка на массив параметризованных списков
        List[] la = new ArrayList[5];
        ls = (ArrayList<String>[]) la;           //параметризация явная с кастингом
        ls[0] = new ArrayList<String>(Arrays.asList(Range.randomStr(5)));          // работает
//      ls[1] = new ArrayList<Integer>();   // не прокатывает
        System.out.println("ls:" + Arrays.deepToString(ls));

        System.out.println("\nParametrized Array<Object>:");
        Object[] objects = ls;
        objects[1] = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)); // ВНИМАНИЕ произошло наложение типов
        System.out.println(Arrays.deepToString(objects));

        System.out.println("\nParametrized Array<BerriliumSpheres> Creation:");
        List<BerylliumSphere>[] cp = (List<BerylliumSphere>[]) new List[10];//параметризованный массив создан
        for (int i = 0; i < cp.length; i++) {
            cp[i] = new ArrayList<BerylliumSphere>(
                    Arrays.asList(new BerylliumSphere(), new BerylliumSphere()));
        }
        System.out.println(Arrays.deepToString(cp));


        System.out.println("\nParametrized List<T>[] Link:");
        ClassParam<String> cs = new ClassParam<>(new ArrayList[5]);//параметризация в конструкторе
        for (int i = 0; i < cs.lists.length; i++) {
            cs.lists[i] = new ArrayList<>(Arrays.asList(Range.randomStr(2)));
        }
        System.out.println(Arrays.deepToString(cs.lists));

        System.out.println("\nParametrized List<T>[] Creation:");
        ClassParam<String> cd = new ClassParam<>();//параметризованный массив создан
        for (int i = 0; i < cd.clists.length; i++) {
            cd.clists[i] = new ArrayList<String>(Arrays.asList(Range.randomStr(5)));
//          cd.clists[i] = new ArrayList<Integer>();  // так не прокатывает
        }
        System.out.println("clists:"+Arrays.deepToString(cd.clists));

        System.out.println("\nParametrized <T>[] Class Creation:");
        try {
            ClassParam<Ball> cn = new ClassParam<>();    //параметризованный массив Ball[]  НЕ создан
            cn.сobjects[0] = new Ball();                 // не работает Runtime
//          cn.array[0] = new Integer(1);                // не работает компилятор
        } catch (Exception e) {
            System.out.println("Array cast exception ");
        }

        System.out.println("\nParametrized <T>[] Class Link:");  // ссылка работает
        try {
            String[] strs = Range.randomStr(5); // массив строк

            ClassParam<String> cn = new ClassParam<>(strs);  //передали массив в класс
//          cn.objects[0] = new Integer(1);                // не работает компилятор
            System.out.println("objects:"+Arrays.deepToString(cn.objects));

        } catch (Exception e) {
            System.out.println("Array cast exception ");
        }


        System.out.println("\nParametrized <T>[] Method Creation:");
        try {
            String[] strings = getArray(10);        //параметризованный массив Ball[] создан
            strings[0] = Range.randomStr();             // не работает Runtime
//          strings[0] = new Integer(0);                // не работает компилятор

        } catch (Exception e) {
            System.out.println("Array cast exception ");
        }

    }
}
