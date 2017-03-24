package ch11.ex05.access;

import lib.utils.Range;

import java.util.*;

/**
 * Created by V1 on 20-Feb-17.
 */


public class IntList {
    ArrayList arrayList(int size) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size ; i++) {
            list.add(Range.getInt(10));
//            list.add(i);
        }
        return list;
    }

    void show() {
        Random rnd = new Random();
        List<Integer> ints = arrayList(7);                       // создание при помощи утилиты инициализации
//        Integer[] aInts = ArrayUtils.toObject(Range.rangeInt(7));  // тоже самое свой конвертер int[] >>Integer[]
//        List<Integer> ints = new ArrayList(Arrays.asList(aInts));    // создание списка из массива объектов

        System.out.println(" 1:"+ints);


        Integer h = new Integer(115); // добавить новый класс порода
        ints.add(h);
        System.out.println(" 2:"+ints);

        System.out.println(" 3: contains(h)>"+ints.contains(h)+" get(4)>"+ints.get(4)); // проверка оператора contains

        ints.remove(h);                                                     // удалить объект
        System.out.println("  : remove(h)>"+ints);                           // удаление по объекту

        Integer p = ints.get(4);
        System.out.println(" 4: get(4)>"+p+" indexOf(p)>"+ints.indexOf(p));  // работа с объектом по индексу и по объекту

        Integer c = new Integer(23);                                  // объект заданной породы новый для pets
        System.out.println(" 5: indexOf(c)>"+ints.indexOf(c)); // неизвестный объект не берет индекс
        System.out.println(" 6: remove(c)>"+ints.remove(c));   // неизвестный объект не удаляет

        System.out.println("  :"+ints);                        // до удаления
        System.out.println(" 7:"+ints.remove(p));              // удалить известный объект

        System.out.println(" 8:"+ints);                        // после удаления

        ints.add(3,new Integer(575));                         // добавить новый объект
        System.out.println(" 9:"+ints);                        // после добавления

        List<Integer> sub = ints.subList(1,4);                 // sublist [1,2,3] 4 не входит
        System.out.println("  : ints>"+ints);                  // это живая часть списка головного списка
        sub.add(121);                                          // добавляет в головной список 121
        System.out.println("  :  add>"+ints);
        sub.set(1,543);                                         // меняет [1] на 543 в головном списке
        System.out.println("  :  set>"+ints);                  // головной  список
        System.out.println("  :  sub>"+sub);                    // частичный список

       System.out.println("10: containsAll()>"+ints.containsAll(sub)); // проверяет sublist живой для list или нет


// сортировка
        Collections.sort(sub);                                          // сортировка sublist
        System.out.println("  : sort>"+sub);                         // после сортировки
        System.out.println("  : ints>"+ints);                  // это живая часть списка головного списка
        System.out.println("11: containsAll()>"+ints.containsAll(sub)); // после сортировки и перемешивания

// перемешивание
        Collections.shuffle(sub,rnd);
        System.out.println("  : shuffle>"+sub);                          // после сортировки
        System.out.println("  :    ints>"+ints);                  // это живая часть списка головного списка
        System.out.println("12: containsAll()>"+ints.containsAll(sub)); // после сортировки и перемешивания
// клонирование
        List<Integer> copy = new ArrayList<>(ints);                             // клонируем pets
        sub = Arrays.asList(ints.get(1),ints.get(4));
        System.out.println("  : ints>"+ints);                  // это живая часть списка головного списка
        System.out.println("  : copy>"+copy+" size>"+copy.size());          // элементы с копии
        System.out.println("  : get(1)(4)>"+sub+"  size>"+sub.size());      // элементы с копии
        copy.retainAll(sub);                                    // оставить только те элементы которые есть в sublist
        System.out.println("12:retainAll()>"+copy+" size>"+copy.size());    // скопировать
        copy = new ArrayList<>(ints);                                       // новая копия
        System.out.println("  : copy>"+copy+" size>"+copy.size());          // элементы с копии

        copy.remove(2);
        System.out.println("14: remove(2)>"+copy+" size>"+copy.size());     // удаление по индексу


// удаление элементов, идет строго по объектам, как ссылкам
        System.out.println("  : containsAll()>"+copy.containsAll(sub));     // проверяем sublist активный
        copy.removeAll(sub);                    // удалить элементы sublist из основного списка
        System.out.println("15: removeAll()>"+copy+" size>"+copy.size()+"  sub>"+sub+" size>"+sub.size());

        copy.set(1,new Integer(141));                // 1й элемент задать
        System.out.println("16: set(1)>"+copy+" size>"+copy.size());

        copy.addAll(sub);                       // добавить все объекты из списка
        System.out.println("17: addAll()>"+copy+" size>"+copy.size());
        System.out.println("18: isEmpty()>"+ints.isEmpty());
        ints.clear();                           // удаление всего
        System.out.println("19: isEmpty()>"+ints.isEmpty()+" pets>"+ints);
        System.out.println("20: ints>"+ints);

        ints.addAll(arrayList(4));     // сгенерить новый объект на 4 элемента
        System.out.println("21: ints>"+ints);

        Object[] o = ints.toArray();
        System.out.println("22: toArray()>"+Arrays.toString(o));  // создали массив
        Integer[] pa = ints.toArray(new Integer[1]);  // расширение массива
        System.out.println("23: toArray(new [1])>"+Arrays.toString(pa)+" id>"+pa[0]);
        Integer[] pb = ints.toArray(new Integer[8]);  // автозаполнение массива
        System.out.println("24: toArray(new [8])>"+Arrays.toString(pb)+" id>"+pb[1]);

/*
*/




    }

}
