package ch16.ex09.access;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by V1 on 18-Feb-17.
 */
public class Access {
    public static void fill(Banana[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = new Banana();
        }
    }
    public static void fill(List<Banana>[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = new ArrayList<>(Arrays.asList(
                    new Banana(), new Banana()
            ));
        }
    }
    public static void app() {
        System.out.println("\n====ACCESS===");
        System.out.println("\nExercise 9 Array Check\n");

        System.out.println("Class Peel<Banana> Array:");
        Banana[] bananas = new Banana[5];
        Banana[] bananas2 = new Banana[5];
        Banana[] bananas3 = new Banana[5];

        fill(bananas);
        fill(bananas2);
        fill(bananas3);

        Peel<Banana> peels = new Peel(bananas);
        System.out.println("peels class link :" + Arrays.deepToString(peels.get()));
        System.out.println("peels ext array  :" + Arrays.deepToString(peels.get(bananas2)));

        System.out.println("Method Peel<Banana> Array Link:");
        System.out.println("peels method link :" + Arrays.deepToString(PeelMethod.get(bananas3)));
//      Banana[] bananas4 = (Banana[])PeelMethod.get();  // не работет


        System.out.println("\nClass Peel<Banana> List<> :");
        List<Banana>[] listb = new List[5];
        List<Banana>[] listb2 = new List[5];
        List<Banana>[] listb3 = new List[5];

        fill(listb);
        fill(listb2);
        fill(listb3);

        Peel<Banana> peels2 = new Peel(listb);  // инициализируем список
        System.out.println("peels2 list link :" + Arrays.deepToString(peels2.getList())); // вернуть внутренний линк
        System.out.println("peels2 list array:" + Arrays.deepToString(peels2.getLists())); // пустой массив
        fill(peels2.getLists());
        System.out.println("peels2 list array:" + Arrays.deepToString(peels2.getLists())); // заполненный массив


        System.out.println("\nMethod Peel List<Banana> Array Link:");
// проверка кастинга ссылки на внешний список
        List<Banana>[]listb2a = PeelMethod.getList(listb2);
        listb2a[2].add(new Banana());
        List<Banana>[]listb3a = PeelMethod.getListCast(listb3);
        listb3a[2].add(new Banana());

        System.out.println("list<> link method      :" + Arrays.deepToString(listb2a));
        System.out.println("list<> link method сast :" + Arrays.deepToString(listb3a));

// проверка кастинга внутреннего списка
        List<Banana>[] listb4 = PeelMethod.getLists();  // вытаскиваем внутренний массив без кастинга
        listb4[2] = new ArrayList<>();
        listb4[2].add(new Banana());
        List<Banana>[] listb5 = PeelMethod.getListsCast(); // тоже самое с кастингом
        listb5[2] = new ArrayList<>();
        listb5[2].add(new Banana());
        System.out.println("list<> array method     :" + Arrays.deepToString(listb4));
        System.out.println("list<> array method cast:" + Arrays.deepToString(listb4));

    }
}
