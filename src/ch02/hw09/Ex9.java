package ch02.hw09;

import java.util.ArrayList;

/**
 * Created by V1 on 03-Feb-17.
 */
public class Ex9 {

    static int abs(int a) {
        return Math.abs(a);
    }

    public static void main(String[] args) {
        Character chObject = 'U';  // автоупаковка
        Integer intObject = 15;    // автоупаковка
        Integer intObject1 = new Integer(25); // создание объекта
        Integer intObject2 = Integer.valueOf(25); // создание объекта

        System.out.println("ch:"+chObject+" int:"+intObject+" int1"+intObject1);

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(2);               // упаковка примитива в массив объектов
        arrayList.add(5);

        for (Integer i: arrayList) {
            System.out.println("arrayList %2%:"+i%2);  // унарный оператор работает с объектом Integer
        }

// распаковка

        int a =  arrayList.get(0);                  // распаковка через обращение к массиву
        int  b = arrayList.get(1);
        char c = chObject;                          // значение от объекта к примитиву
        int d  = abs(intObject1);                   // распаковка через функцию которая ожидает примитив
        System.out.println(a+" "+b+" "+c+" "+d);








    }

}
